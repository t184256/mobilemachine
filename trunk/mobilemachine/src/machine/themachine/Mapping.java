/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public abstract class Mapping {
	public abstract long getValue(String view);
	public abstract String getView(long value);
	//public abstract long getFirstValue();
	public abstract String getFirstView(String input) throws NothingToReadException;
	/*public abstract String getViewPrefix();
	public abstract String getViewPostfix();*/
	public abstract String getName();
	public abstract String getSample();
}
