/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mobilemachine;

import machine.themachine.MachineSettings;

/**
 *
 * @author lantern
 */
public class CodeProject {
	private String code="";
	private String defaultInput="";
	private MachineSettings machineSettings = new MachineSettings();

	public CodeProject() {
	
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


	public String getDefaultInput() {
		return defaultInput;
	}

	public void setDefaultInput(String defaultInput) {
		this.defaultInput = defaultInput;
	}

	
	public MachineSettings getMachineSettings() {
		return machineSettings;
	}

	public void setMachineSettings(MachineSettings machineSettings) {
		this.machineSettings = machineSettings;
	}
}

