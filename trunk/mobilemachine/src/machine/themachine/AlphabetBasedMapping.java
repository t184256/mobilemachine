/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public abstract class AlphabetBasedMapping extends Mapping{
	//private final String ALPHABET="";
	
	public long getValue(String view) {
		for (int i=0; i<getALPHABET().length()/getCHARASTERSIZE(); i++)
		{
			if (getALPHABET().substring(i*getCHARASTERSIZE(), (i+1)*getCHARASTERSIZE()).equals(view))
				return i;
		}
		return 0;
	}

	public String getView(long value) {
		int v = (int) value;
		return getALPHABET().substring(v*getCHARASTERSIZE(), (v+1)*getCHARASTERSIZE());
	}

	public abstract String getALPHABET();
	
	public String getFirstView(String input) throws NothingToReadException {
		if (input.length()<getCHARASTERSIZE())
			throw new NothingToReadException();
		return input.substring(0,getCHARASTERSIZE());
	}

	public int getCHARASTERSIZE() {
		return 1;
	}

}
