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
public class abcABC_Mapping extends AlphabetBasedMapping {

	public String getALPHABET() {
		return "abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSUVWXYZ ";
	}

	public String getName() {
		return "abc...ABC_";
	}

	public String getSample() {
		return "abc...xyzABC...XYZ_";
	}
}
