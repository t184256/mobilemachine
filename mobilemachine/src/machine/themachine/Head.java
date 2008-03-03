/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author Администратор
 */
public class Head {
	
	private Cell cell;
	
	public Head(Cell cell) {
		this.cell = cell;
	};

	public Cell getCell() {
		return cell;
	}
	
	public long getValue() {
		return cell.getValue();
	}
	
	public void setValue(long value) {
		cell.setValue(value);
	}
	
	public void increment() {
		cell.increment();
	}
	
	public void decrement() {
		cell.decrement();
	}
	
	public void moveForward() {
		if (cell.getNext()==null)
			cell.nextInit();
		cell=cell.getNext();
	}
	
	public void moveBackward() {
		if (cell.getPrev()==null)
			cell.prevInit();
		cell=cell.getPrev();
	}
	
	
}
