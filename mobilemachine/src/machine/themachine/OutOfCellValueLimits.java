/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author Администратор
 */
public class OutOfCellValueLimits extends Exception {

    /**
     * Creates a new instance of <code>OutOfCellValueLimits</code> without detail message.
     */
    public OutOfCellValueLimits() {
    }


    /**
     * Constructs an instance of <code>OutOfCellValueLimits</code> with the specified detail message.
     * @param msg the detail message.
     */
    public OutOfCellValueLimits(String msg) {
        super(msg);
    }
}
