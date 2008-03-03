/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

import machine.themachine.mappings.SpaceSeparatedNumbersMapping;


public class Interpreter {
	
	//For, heh, interpretation
	private TheMachine machine;
	private String code;
	private int pos=0;
	private int step=0;
	
	//Value
	long minValue;
	long maxValue;
	boolean wrap;
	
	/*//For IO
	Vector input = new Vector();
	private boolean hasOutput = false;
	private char output;*/
	Mapping mapping;
	
	public Interpreter(String code, MachineSettings ms) {
		this(code, ms.getMapping(), ms.getMinValue(), ms.getMaxValue(), ms.isWrap());
	}
	
	public Interpreter(String code) {
		this(code, new SpaceSeparatedNumbersMapping(), 0, 255, true);
	}
	
	public Interpreter(String code, Mapping mapping, long minValue, long maxValue, boolean wrap) {
		this.code = code;
		this.mapping = mapping;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.wrap = wrap;
		machine = new TheMachine();
	}

	private char currChar() {
		return code.charAt(getPos());
	}
	
	public StepResult step(String input) throws OutOfCellValueLimits {
		StepResult result = new StepResult();
		if(pos>=code.length())
			return result; //No steps left for execution, report a non-executed step (default)
		switch(currChar())
		{
			case '+': {
				if (machine.getHead().getValue() != maxValue) 
					machine.getHead().increment();
				else
					if (wrap) 
						machine.getHead().setValue(minValue);
					else
						return result;
				pos++;
				break;
			}
			case '-': {
				if (machine.getHead().getValue() != minValue) 
					machine.getHead().decrement();
				else
					if (wrap) 
						machine.getHead().setValue(maxValue);
					else
						throw new OutOfCellValueLimits();
				pos++;
				break;
			}
			case '>': {machine.getHead().moveForward(); pos++; break;}
			case '<': {machine.getHead().moveBackward(); pos++; break;}
			case '[': {
				if(machine.getHead().getValue()==0)
					windForward();
				else
					pos++;
				break;
			}
			case ']': {
				if(machine.getHead().getValue()!=0)
					windBackward();
				else
					pos++;
				break;
			}
			case ',': {
				if(input.length()!=0) {
				try {
					String view = mapping.getFirstView(input);
					machine.getHead().setValue(mapping.getValue(view));
					result.setCharactersEatenFromInput(view.length());
				} catch (NothingToReadException ex) {
					return result;
				}
				}
				else
					machine.getHead().setValue(0);
				pos++;	
				break;
			}
			case '.': {result.setOutput(mapping.getView(machine.getHead().getValue())); pos++; break;}
			default: {pos++; break;}
		}
		step++;
		result.setWasExecuted();
		return result;
	}

	private void windBackward() {
		int tmp=1;
		while(tmp!=0)
		{
			pos--;
			if(currChar()=='[')
				tmp--;
			if(currChar()==']')
				tmp++;
		}
	}

	private void windForward() {
		int tmp=1;
		while(tmp!=0)
		{
			pos++;
			if(currChar()=='[')
				tmp++;
			if(currChar()==']')
				tmp--;
		}
	}
	
	public String dump() {
			return machine.dump();
	}
	
	public StepResult tracestep(String input) throws OutOfCellValueLimits {
		System.out.println(getPos()+" in "+code+" "+machine.dump());
		return step(input);
	}

	public int getStep() {
		return step;
	}

	public int getPos() {
		return pos;
	}
}
