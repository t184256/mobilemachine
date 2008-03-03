/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;


public class TheMachine {
	
	private Cell firstCell = new Cell();
	private Head head;
	
	public TheMachine()	{
		head = new Head(firstCell);
		//test();
	}

	public String dump() {
		String s="";
		Cell c = firstCell;
		while(c.getPrev()!=null)
			c=c.getPrev();
		while(c!=null) {
			if (c.equals(head.getCell()))
			{
				s+="(";
				s+=c.getValue();			//A current cell must be surronded with ().
				s+=")";
			}
			else
			{
				s+=c.getValue();
				if (c.getNext()!=null&&c.getNext()!=head.getCell())
					s+=" ";					//If next cell is regular and is not the one the head is on, we should add a space delimiter.
			}
			c=c.getNext();
		}
		return s;
	}
	
	public String mappedDump(Mapping m) {
		String s = "";
		
		
		return s;
	}
	
	public Cell getFirstCell() {
		return firstCell;
	}

	public Head getHead() {
		return head;
	}

}
