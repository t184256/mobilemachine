/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public class NothingToReadException extends Exception {

    /**
     * Creates a new instance of <code>NothingToReadException</code> without detail message.
     */
    public NothingToReadException() {
    }


    /**
     * Constructs an instance of <code>NothingToReadException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NothingToReadException(String msg) {
        super(msg);
    }
}
