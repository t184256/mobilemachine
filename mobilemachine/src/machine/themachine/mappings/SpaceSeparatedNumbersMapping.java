/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine.mappings;

import machine.themachine.Mapping;

/**
 *
 * @author lantern
 */
public class SpaceSeparatedNumbersMapping extends Mapping {

	public long getValue(String view) {
		if (view.endsWith(" ")) 
			view = view.substring(0, view.length()-1);
		try {
		return Long.parseLong(view);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	public String getView(long value) {
		return value+" ";
	}

	public String getFirstView(String input) {
		/*if (input.indexOf(input)==-1)
			throw new NothingToReadException("No spaces in the input string");*/
		if (input.indexOf(" ")==-1)
			return input;
		String number = input.substring(0, input.indexOf(" ")+1);
		return number;
	}

	public String getName() {
		return "Space separated numbers";
	}

	public String getSample() {
		return "..., -1, 0, 1, 2, ...";
	}
	
}
