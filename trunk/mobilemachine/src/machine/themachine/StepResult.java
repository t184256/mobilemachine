/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public class StepResult {
	private boolean executed = false;
	//boolean hasOutput = false;
	private String output = "";
	//boolean usedInput = false;
	private int charactersEatenFromInput = 0;

	public boolean isExecuted() {
		return executed;
	}

	public void setExecuted(boolean wasExecuted) {
		this.executed = wasExecuted;
	}

	public void setWasExecuted() {
		this.executed = true;
	}
	
	public //boolean hasOutput = false;
	String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public //boolean usedInput = false;
	int getCharactersEatenFromInput() {
		return charactersEatenFromInput;
	}

	public void setCharactersEatenFromInput(int charactersEatenFromInput) {
		this.charactersEatenFromInput = charactersEatenFromInput;
	}
}
