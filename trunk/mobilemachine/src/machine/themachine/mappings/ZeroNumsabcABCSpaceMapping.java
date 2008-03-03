/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine.mappings;

import machine.themachine.AlphabetBasedMapping;

/**
 *
 * @author lantern
 */
public class ZeroNumsabcABCSpaceMapping extends AlphabetBasedMapping {

	public String getALPHABET() {
		return "01234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSUVWXYZ ";
	}

	public String getName() {
		return "012abcABC_";
	}

	public String getSample() {
		return "012...9ab...zAB...Z_";
	}

}
