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
public class _abcMapping extends AlphabetBasedMapping {

	public String getALPHABET() {
		return " abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSUVWXYZ";
	}

	public String getName() {
		return "_abc...ABC";
	}

	public String getSample() {
		return "_abc...xyzABC...XYZ";
	}

}