/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;


public class Cell {
	private long value=0;
	private Cell prev=null;
	private Cell next=null;
	
	public Cell() {
		
	}

	public long getValue() {
		return value;
	}

	public Cell getPrev() {
		return prev;
	}

	public Cell getNext() {
		return next;
	}
	
	public void increment() {
		value++;
	}
	
	public void decrement() {
		value--;
	}
	
	public void nextInit() {
		next = new Cell();
		next.prev = this;
	}
	
	public void prevInit() {
		prev = new Cell();
		prev.next = this;
	}

	public void setValue(long value) {
		this.value = value;
	}
}
