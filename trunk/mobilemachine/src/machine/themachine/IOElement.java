/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public class IOElement {
	long value;
	String view;
	
	IOElement(Mapping m, long value) {
		this.value = value;
		this.view = m.getView(value);
	}
	
	IOElement(Mapping m, String view) {
		this.view = view;
		this.value = m.getValue(view);
	}
	
	/*IOElement(Mapping m, Cell c) {
		IOElement (m, c.getValue());
	}*/
}
