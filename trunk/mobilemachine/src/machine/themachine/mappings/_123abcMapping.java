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
public class _123abcMapping extends AlphabetBasedMapping {

	public String getALPHABET() {
		return " 1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSUVWXYZ";
	}

	public String getName() {
		return "_123abcABC";
	}

	public String getSample() {
		return "_12...0ab...zAB...Z";
	}

}
