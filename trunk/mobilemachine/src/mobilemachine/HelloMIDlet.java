/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mobilemachine;

import java.util.Enumeration;
import java.util.Vector;
import machine.themachine.MachineSettings;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import machine.themachine.Interpreter;
import machine.themachine.Mapping;
import machine.themachine.OutOfCellValueLimits;
import machine.themachine.StepResult;
import machine.themachine.mappings.SpaceSeparatedNumbersMapping;
import machine.themachine.mappings.ZeroNumsabcABCSpaceMapping;
import machine.themachine.mappings._123abcMapping;
import machine.themachine.mappings._abcMapping;
import machine.themachine.mappings.abcABC_Mapping;

/**
 * @author Администратор
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

	private Interpreter intie;
	private Vector mappings = new Vector();
	
	//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Command exitCommand;
	private Command goToExecutionCommand;
	private Command terminateCommand;
	private Command stepCommand;
	private Command settingsCommand;
	private Command storeSettingsCommand;
	private Command cancelSettingsCommand;
	private Form codeForm;
	private TextField textField;
	private TextField definputField;
	private Spacer spacer;
	private Form executionForm;
	private StringItem codeString;
	private StringItem dumpString;
	private StringItem outputString;
	private TextField inputField;
	private Form settingsForm;
	private TextField maxTextVal;
	private TextField minTextVal;
	private ChoiceGroup wrapPolicy;
	private ChoiceGroup mappingChoiceGroup;
	private TextBox codeBox;
	private List menuList;
	//</editor-fold>//GEN-END:|fields|0|
	private MachineSettings settings = new MachineSettings();
	String code="";
	//</editor-fold>

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
		mappingsInitialisation();
    }

	private void mappingsInitialisation() {
		mappings.addElement(new SpaceSeparatedNumbersMapping());
		mappings.addElement(new _abcMapping());
		mappings.addElement(new abcABC_Mapping());
		mappings.addElement(new _123abcMapping());
		mappings.addElement(new ZeroNumsabcABCSpaceMapping());
		
		settings.setMapping((Mapping) mappings.firstElement());
	}
	
	//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
	//</editor-fold>//GEN-END:|methods|0|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
	/**
	 * Initilizes the application.
	 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
	 */
	private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
		stepCommand = new Command("Step", Command.OK, 0);//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
	}//GEN-BEGIN:|0-initialize|2|
	//</editor-fold>//GEN-END:|0-initialize|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Started point.
	 */
	public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
		switchDisplayable(null, getMenuList());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
	}//GEN-BEGIN:|3-startMIDlet|2|
	//</editor-fold>//GEN-END:|3-startMIDlet|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
	/**
	 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
	 */
	public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
	}//GEN-BEGIN:|4-resumeMIDlet|2|
	//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
	/**
	 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
	 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
	 * @param nextDisplayable the Displayable to be set
	 */
	public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
		Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
		if (alert == null) {
			display.setCurrent(nextDisplayable);
		} else {
			display.setCurrent(alert, nextDisplayable);
		}//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
	}//GEN-BEGIN:|5-switchDisplayable|2|
	//</editor-fold>//GEN-END:|5-switchDisplayable|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
	/**
	 * Called by a system to indicated that a command has been invoked on a particular displayable.
	 * @param command the Command that was invoked
	 * @param displayable the Displayable where the command was invoked
	 */
	public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
		if (displayable == codeForm) {//GEN-BEGIN:|7-commandAction|1|19-preAction
			if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
				exitMIDlet();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
			} else if (command == goToExecutionCommand) {//GEN-LINE:|7-commandAction|3|23-preAction
				// write pre-action user code here
				executionPreparations();//GEN-LINE:|7-commandAction|4|23-postAction
				// write post-action user code here
			} else if (command == settingsCommand) {//GEN-LINE:|7-commandAction|5|65-preAction
				// write pre-action user code here
				readSettings();//GEN-LINE:|7-commandAction|6|65-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|7|31-preAction
		} else if (displayable == executionForm) {
			if (command == stepCommand) {//GEN-END:|7-commandAction|7|31-preAction
				// write pre-action user code here
				step();//GEN-LINE:|7-commandAction|8|31-postAction
				// write post-action user code here
			} else if (command == terminateCommand) {//GEN-LINE:|7-commandAction|9|26-preAction
				// write pre-action user code here
				switchDisplayable(null, getCodeForm());//GEN-LINE:|7-commandAction|10|26-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|11|115-preAction
		} else if (displayable == menuList) {
			if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|11|115-preAction
				// write pre-action user code here
				menuListAction();//GEN-LINE:|7-commandAction|12|115-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|13|105-preAction
		} else if (displayable == settingsForm) {
			if (command == cancelSettingsCommand) {//GEN-END:|7-commandAction|13|105-preAction
				// write pre-action user code here
				switchDisplayable(null, getCodeForm());//GEN-LINE:|7-commandAction|14|105-postAction
				// write post-action user code here
			} else if (command == storeSettingsCommand) {//GEN-LINE:|7-commandAction|15|75-preAction
				// write pre-action user code here
				storeSettings();//GEN-LINE:|7-commandAction|16|75-postAction
				// write post-action user code here
			}//GEN-BEGIN:|7-commandAction|17|7-postCommandAction
		}//GEN-END:|7-commandAction|17|7-postCommandAction
        // write post-action user code here
	}//GEN-BEGIN:|7-commandAction|18|
	//</editor-fold>//GEN-END:|7-commandAction|18|


	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
	/**
	 * Returns an initiliazed instance of exitCommand component.
	 * @return the initialized component instance
	 */
	public Command getExitCommand() {
		if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
			exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
		}//GEN-BEGIN:|18-getter|2|
		return exitCommand;
	}
	//</editor-fold>//GEN-END:|18-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: goToExecutionCommand ">//GEN-BEGIN:|22-getter|0|22-preInit
	/**
	 * Returns an initiliazed instance of goToExecutionCommand component.
	 * @return the initialized component instance
	 */
	public Command getGoToExecutionCommand() {
		if (goToExecutionCommand == null) {//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
			goToExecutionCommand = new Command("Ok", Command.SCREEN, 1);//GEN-LINE:|22-getter|1|22-postInit
			// write post-init user code here
		}//GEN-BEGIN:|22-getter|2|
		return goToExecutionCommand;
	}
	//</editor-fold>//GEN-END:|22-getter|2|



	//<editor-fold defaultstate="collapsed" desc=" Generated Method: executionPreparations ">//GEN-BEGIN:|48-entry|0|49-preAction
	/**
	 * Performs an action assigned to the executionPreparations entry-point.
	 */
	public void executionPreparations() {//GEN-END:|48-entry|0|49-preAction
		code=textField.getString();
		intie = new machine.themachine.Interpreter(textField.getString(), settings);
		
		switchDisplayable(null, getExecutionForm());//GEN-LINE:|48-entry|1|49-postAction
		// write post-action user code here
		codeForm.setTitle("Debug");
		codeString.setLabel("Code:\n");
		codeString.setText(getPositionedCode());
		dumpString.setLabel("Dump:\n");
		dumpString.setText(intie.dump());
		outputString.setText("");
		inputField.setString(definputField.getString());
		
	}//GEN-BEGIN:|48-entry|2|
	//</editor-fold>//GEN-END:|48-entry|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: settingsCommand ">//GEN-BEGIN:|64-getter|0|64-preInit
	/**
	 * Returns an initiliazed instance of settingsCommand component.
	 * @return the initialized component instance
	 */
	public Command getSettingsCommand() {
		if (settingsCommand == null) {//GEN-END:|64-getter|0|64-preInit
			// write pre-init user code here
			settingsCommand = new Command("Settings", Command.SCREEN, -2);//GEN-LINE:|64-getter|1|64-postInit
			// write post-init user code here
		}//GEN-BEGIN:|64-getter|2|
		return settingsCommand;
	}
	//</editor-fold>//GEN-END:|64-getter|2|



	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: terminateCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
	/**
	 * Returns an initiliazed instance of terminateCommand component.
	 * @return the initialized component instance
	 */
	public Command getTerminateCommand() {
		if (terminateCommand == null) {//GEN-END:|25-getter|0|25-preInit
			// write pre-init user code here
			terminateCommand = new Command("Terminate", Command.CANCEL, 0);//GEN-LINE:|25-getter|1|25-postInit
			// write post-init user code here
		}//GEN-BEGIN:|25-getter|2|
		return terminateCommand;
	}
	//</editor-fold>//GEN-END:|25-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: codeForm ">//GEN-BEGIN:|14-getter|0|14-preInit
	/**
	 * Returns an initiliazed instance of codeForm component.
	 * @return the initialized component instance
	 */
	public Form getCodeForm() {
		if (codeForm == null) {//GEN-END:|14-getter|0|14-preInit
			// write pre-init user code here
			codeForm = new Form("Welcome", new Item[] { getTextField(), getDefinputField(), getSpacer() });//GEN-BEGIN:|14-getter|1|14-postInit
			codeForm.addCommand(getExitCommand());
			codeForm.addCommand(getGoToExecutionCommand());
			codeForm.addCommand(getSettingsCommand());
			codeForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
			// write post-init user code here
		}//GEN-BEGIN:|14-getter|2|
		return codeForm;
	}
	//</editor-fold>//GEN-END:|14-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|28-getter|0|28-preInit
	/**
	 * Returns an initiliazed instance of textField component.
	 * @return the initialized component instance
	 */
	public TextField getTextField() {
		if (textField == null) {//GEN-END:|28-getter|0|28-preInit
			// write pre-init user code here
			textField = new TextField("Enter code here: ", null, 128, TextField.ANY | TextField.NON_PREDICTIVE);//GEN-BEGIN:|28-getter|1|28-postInit
			textField.setLayout(ImageItem.LAYOUT_DEFAULT);
			textField.setInitialInputMode("+-[]<>.,");//GEN-END:|28-getter|1|28-postInit
			// write post-init user code here
		}//GEN-BEGIN:|28-getter|2|
		return textField;
	}
	//</editor-fold>//GEN-END:|28-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: executionForm ">//GEN-BEGIN:|21-getter|0|21-preInit
	/**
	 * Returns an initiliazed instance of executionForm component.
	 * @return the initialized component instance
	 */
	public Form getExecutionForm() {
		if (executionForm == null) {//GEN-END:|21-getter|0|21-preInit
			// write pre-init user code here
			executionForm = new Form("Debug", new Item[] { getCodeString(), getInputField(), getOutputString(), getDumpString() });//GEN-BEGIN:|21-getter|1|21-postInit
			executionForm.addCommand(stepCommand);
			executionForm.addCommand(getTerminateCommand());
			executionForm.setCommandListener(this);//GEN-END:|21-getter|1|21-postInit
			// write post-init user code here
		}//GEN-BEGIN:|21-getter|2|
		return executionForm;
	}
	//</editor-fold>//GEN-END:|21-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: codeString ">//GEN-BEGIN:|32-getter|0|32-preInit
	/**
	 * Returns an initiliazed instance of codeString component.
	 * @return the initialized component instance
	 */
	public StringItem getCodeString() {
		if (codeString == null) {//GEN-END:|32-getter|0|32-preInit
			// write pre-init user code here
			codeString = new StringItem("Code:", "");//GEN-LINE:|32-getter|1|32-postInit
			// write post-init user code here
		}//GEN-BEGIN:|32-getter|2|
		return codeString;
	}
	//</editor-fold>//GEN-END:|32-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dumpString ">//GEN-BEGIN:|33-getter|0|33-preInit
	/**
	 * Returns an initiliazed instance of dumpString component.
	 * @return the initialized component instance
	 */
	public StringItem getDumpString() {
		if (dumpString == null) {//GEN-END:|33-getter|0|33-preInit
			// write pre-init user code here
			dumpString = new StringItem("Dump: ", "", Item.PLAIN);//GEN-LINE:|33-getter|1|33-postInit
			// write post-init user code here
		}//GEN-BEGIN:|33-getter|2|
		return dumpString;
	}
	//</editor-fold>//GEN-END:|33-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: settingsForm ">//GEN-BEGIN:|57-getter|0|57-preInit
	/**
	 * Returns an initiliazed instance of settingsForm component.
	 * @return the initialized component instance
	 */
	public Form getSettingsForm() {
		if (settingsForm == null) {//GEN-END:|57-getter|0|57-preInit
			// write pre-init user code here
			settingsForm = new Form("Settings", new Item[] { getMinTextVal(), getMaxTextVal(), getWrapPolicy(), getMappingChoiceGroup() });//GEN-BEGIN:|57-getter|1|57-postInit
			settingsForm.addCommand(getCancelSettingsCommand());
			settingsForm.addCommand(getStoreSettingsCommand());
			settingsForm.setCommandListener(this);//GEN-END:|57-getter|1|57-postInit
			// write post-init user code here
		}//GEN-BEGIN:|57-getter|2|
		return settingsForm;
	}
	//</editor-fold>//GEN-END:|57-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: maxTextVal ">//GEN-BEGIN:|59-getter|0|59-preInit
	/**
	 * Returns an initiliazed instance of maxTextVal component.
	 * @return the initialized component instance
	 */
	public TextField getMaxTextVal() {
		if (maxTextVal == null) {//GEN-END:|59-getter|0|59-preInit
			// write pre-init user code here
			maxTextVal = new TextField("Maximum Cell Value: ", "undefined", 32, TextField.ANY);//GEN-LINE:|59-getter|1|59-postInit
			// write post-init user code here
		}//GEN-BEGIN:|59-getter|2|
		return maxTextVal;
	}
	//</editor-fold>//GEN-END:|59-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: minTextVal ">//GEN-BEGIN:|58-getter|0|58-preInit
	/**
	 * Returns an initiliazed instance of minTextVal component.
	 * @return the initialized component instance
	 */
	public TextField getMinTextVal() {
		if (minTextVal == null) {//GEN-END:|58-getter|0|58-preInit
			// write pre-init user code here
			minTextVal = new TextField("Minimal Cell Value: ", "undefined", 32, TextField.ANY);//GEN-LINE:|58-getter|1|58-postInit
			// write post-init user code here
		}//GEN-BEGIN:|58-getter|2|
		return minTextVal;
	}
	//</editor-fold>//GEN-END:|58-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: wrapPolicy ">//GEN-BEGIN:|61-getter|0|61-preInit
	/**
	 * Returns an initiliazed instance of wrapPolicy component.
	 * @return the initialized component instance
	 */
	public ChoiceGroup getWrapPolicy() {
		if (wrapPolicy == null) {//GEN-END:|61-getter|0|61-preInit
			// write pre-init user code here
			wrapPolicy = new ChoiceGroup("Wrap Policy: ", Choice.EXCLUSIVE);//GEN-BEGIN:|61-getter|1|61-postInit
			wrapPolicy.append("Do wrap", null);
			wrapPolicy.append("Don\'t wrap", null);
			wrapPolicy.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
			wrapPolicy.setSelectedFlags(new boolean[] { true, !settings.isWrap() });
			wrapPolicy.setFont(0, null);
			wrapPolicy.setFont(1, null);//GEN-END:|61-getter|1|61-postInit
			// write post-init user code here
		}//GEN-BEGIN:|61-getter|2|
		return wrapPolicy;
	}
	//</editor-fold>//GEN-END:|61-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: storeSettingsCommand ">//GEN-BEGIN:|74-getter|0|74-preInit
	/**
	 * Returns an initiliazed instance of storeSettingsCommand component.
	 * @return the initialized component instance
	 */
	public Command getStoreSettingsCommand() {
		if (storeSettingsCommand == null) {//GEN-END:|74-getter|0|74-preInit
			storeSettingsCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|74-getter|1|74-postInit
			// write post-init user code here
		}//GEN-BEGIN:|74-getter|2|
		return storeSettingsCommand;
	}
	//</editor-fold>//GEN-END:|74-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: storeSettings ">//GEN-BEGIN:|85-entry|0|86-preAction
	/**
	 * Performs an action assigned to the storeSettings entry-point.
	 */
	public void storeSettings() {//GEN-END:|85-entry|0|86-preAction
		// write pre-action user code here
		settings.setWrap(wrapPolicy.getSelectedIndex()==0);
		/*settings.setMinValue(Long.parseLong(minTextVal.getString()));
		settings.setMaxValue(Long.parseLong(minTextVal.getString()));*/
		settings.setCorrectMinMaxValue(Long.parseLong(minTextVal.getString()), Long.parseLong(maxTextVal.getString()));
		settings.setMapping((Mapping) mappings.elementAt(mappingChoiceGroup.getSelectedIndex()));
		
		switchDisplayable(null, getCodeForm());//GEN-LINE:|85-entry|1|86-postAction
		// write post-action user code here
	}//GEN-BEGIN:|85-entry|2|
	//</editor-fold>//GEN-END:|85-entry|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: readSettings ">//GEN-BEGIN:|92-entry|0|93-preAction
	/**
	 * Performs an action assigned to the readSettings entry-point.
	 */
	public void readSettings() {//GEN-END:|92-entry|0|93-preAction
		// write pre-action user code here
		
		switchDisplayable(null, getSettingsForm());//GEN-LINE:|92-entry|1|93-postAction
		
		// write post-action user code here
		wrapPolicy.setSelectedIndex(0, settings.isWrap());
		wrapPolicy.setSelectedIndex(1, !settings.isWrap());
		minTextVal.setString(String.valueOf(settings.getMinValue()));
		maxTextVal.setString(String.valueOf(settings.getMaxValue()));
		mappingChoiceGroup.setSelectedIndex(mappings.indexOf(settings.getMapping()), true);
	}//GEN-BEGIN:|92-entry|2|
	//</editor-fold>//GEN-END:|92-entry|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: inputField ">//GEN-BEGIN:|98-getter|0|98-preInit
	/**
	 * Returns an initiliazed instance of inputField component.
	 * @return the initialized component instance
	 */
	public TextField getInputField() {
		if (inputField == null) {//GEN-END:|98-getter|0|98-preInit
			// write pre-init user code here
			inputField = new TextField("Input:", "", 32, TextField.ANY);//GEN-LINE:|98-getter|1|98-postInit
			// write post-init user code here
		}//GEN-BEGIN:|98-getter|2|
		return inputField;
	}
	//</editor-fold>//GEN-END:|98-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: outputString ">//GEN-BEGIN:|100-getter|0|100-preInit
	/**
	 * Returns an initiliazed instance of outputString component.
	 * @return the initialized component instance
	 */
	public StringItem getOutputString() {
		if (outputString == null) {//GEN-END:|100-getter|0|100-preInit
			// write pre-init user code here
			outputString = new StringItem("Output:", "");//GEN-LINE:|100-getter|1|100-postInit
			// write post-init user code here
		}//GEN-BEGIN:|100-getter|2|
		return outputString;
	}
	//</editor-fold>//GEN-END:|100-getter|2|



	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: cancelSettingsCommand ">//GEN-BEGIN:|104-getter|0|104-preInit
	/**
	 * Returns an initiliazed instance of cancelSettingsCommand component.
	 * @return the initialized component instance
	 */
	public Command getCancelSettingsCommand() {
		if (cancelSettingsCommand == null) {//GEN-END:|104-getter|0|104-preInit
			// write pre-init user code here
			cancelSettingsCommand = new Command("Cancel", Command.CANCEL, 0);//GEN-LINE:|104-getter|1|104-postInit
			// write post-init user code here
		}//GEN-BEGIN:|104-getter|2|
		return cancelSettingsCommand;
	}
	//</editor-fold>//GEN-END:|104-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: definputField ">//GEN-BEGIN:|108-getter|0|108-preInit
	/**
	 * Returns an initiliazed instance of definputField component.
	 * @return the initialized component instance
	 */
	public TextField getDefinputField() {
		if (definputField == null) {//GEN-END:|108-getter|0|108-preInit
			// write pre-init user code here
			definputField = new TextField("Default input:", null, 32, TextField.ANY);//GEN-LINE:|108-getter|1|108-postInit
			// write post-init user code here
		}//GEN-BEGIN:|108-getter|2|
		return definputField;
	}
	//</editor-fold>//GEN-END:|108-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|109-getter|0|109-preInit
	/**
	 * Returns an initiliazed instance of spacer component.
	 * @return the initialized component instance
	 */
	public Spacer getSpacer() {
		if (spacer == null) {//GEN-END:|109-getter|0|109-preInit
			// write pre-init user code here
			spacer = new Spacer(16, 20);//GEN-LINE:|109-getter|1|109-postInit
			// write post-init user code here
		}//GEN-BEGIN:|109-getter|2|
		return spacer;
	}
	//</editor-fold>//GEN-END:|109-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: mappingChoiceGroup ">//GEN-BEGIN:|112-getter|0|112-preInit
	/**
	 * Returns an initiliazed instance of mappingChoiceGroup component.
	 * @return the initialized component instance
	 */
	public ChoiceGroup getMappingChoiceGroup() {
		if (mappingChoiceGroup == null) {//GEN-END:|112-getter|0|112-preInit
			// write pre-init user code here
			mappingChoiceGroup = new ChoiceGroup("Mapping: ", Choice.EXCLUSIVE);//GEN-BEGIN:|112-getter|1|112-postInit
			mappingChoiceGroup.setSelectedFlags(new boolean[] {  });//GEN-END:|112-getter|1|112-postInit
			// write post-init user code here
			for (Enumeration e = mappings.elements(); e.hasMoreElements();) {
				Mapping m = (Mapping) e.nextElement();
				mappingChoiceGroup.append(m.getName(), null);
			}
		}//GEN-BEGIN:|112-getter|2|
		return mappingChoiceGroup;
	}
	//</editor-fold>//GEN-END:|112-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: codeBox ">//GEN-BEGIN:|113-getter|0|113-preInit
	/**
	 * Returns an initiliazed instance of codeBox component.
	 * @return the initialized component instance
	 */
	public TextBox getCodeBox() {
		if (codeBox == null) {//GEN-END:|113-getter|0|113-preInit
			// write pre-init user code here
			codeBox = new TextBox("Enter code here.", null, 1024, TextField.URL | TextField.NON_PREDICTIVE);//GEN-LINE:|113-getter|1|113-postInit
			// write post-init user code here
		}//GEN-BEGIN:|113-getter|2|
		return codeBox;
	}
	//</editor-fold>//GEN-END:|113-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Getter: menuList ">//GEN-BEGIN:|114-getter|0|114-preInit
	/**
	 * Returns an initiliazed instance of menuList component.
	 * @return the initialized component instance
	 */
	public List getMenuList() {
		if (menuList == null) {//GEN-END:|114-getter|0|114-preInit
			// write pre-init user code here
			menuList = new List("list", Choice.IMPLICIT);//GEN-BEGIN:|114-getter|1|114-postInit
			menuList.append("Code", null);
			menuList.append("Debug", null);
			menuList.append("Exit", null);
			menuList.setCommandListener(this);
			menuList.setSelectedFlags(new boolean[] { false, false, false });//GEN-END:|114-getter|1|114-postInit
			// write post-init user code here
		}//GEN-BEGIN:|114-getter|2|
		return menuList;
	}
	//</editor-fold>//GEN-END:|114-getter|2|

	//<editor-fold defaultstate="collapsed" desc=" Generated Method: menuListAction ">//GEN-BEGIN:|114-action|0|114-preAction
	/**
	 * Performs an action assigned to the selected list element in the menuList component.
	 */
	public void menuListAction() {//GEN-END:|114-action|0|114-preAction
		// enter pre-action user code here
		String __selectedString = getMenuList().getString(getMenuList().getSelectedIndex());//GEN-BEGIN:|114-action|1|117-preAction
		if (__selectedString != null) {
			if (__selectedString.equals("Code")) {//GEN-END:|114-action|1|117-preAction
				// write pre-action user code here
				switchDisplayable(null, getCodeBox());//GEN-LINE:|114-action|2|117-postAction
				// write post-action user code here
			} else if (__selectedString.equals("Debug")) {//GEN-LINE:|114-action|3|118-preAction
				// write pre-action user code here
				executionPreparations();//GEN-LINE:|114-action|4|118-postAction
				// write post-action user code here
			} else if (__selectedString.equals("Exit")) {//GEN-LINE:|114-action|5|121-preAction
				// write pre-action user code here
				exitMIDlet();//GEN-LINE:|114-action|6|121-postAction
				// write post-action user code here
			}//GEN-BEGIN:|114-action|7|114-postAction
		}//GEN-END:|114-action|7|114-postAction
		// enter post-action user code here
	}//GEN-BEGIN:|114-action|8|
	//</editor-fold>//GEN-END:|114-action|8|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

	public void step() {
	executionForm.setTitle("Debug, step "+intie.getStep()+".");
		try {
			codeString.setText(getPositionedCode());
			StepResult res = intie.step(inputField.getString());
			if (res.isExecuted())
			{
				inputField.setString(inputField.getString().substring(res.getCharactersEatenFromInput()));
				outputString.setText(outputString.getText()+res.getOutput());
				dumpString.setText(intie.dump());
			}
			else
			{
				executionForm.setTitle("Finished in "+intie.getStep()+" steps.");
			}
		} catch (OutOfCellValueLimits ex) {
			dumpString.setLabel("Damn, an overflow!");
		}
	}
	
	public String getPositionedCode() {
		int pos = intie.getPos();
		String res = "";
		if (code.length()!=0 && pos<code.length())
		{
			res = "(" + code.charAt(pos) + ")";
			if(pos>0)
				res = code.substring(0, pos) + res;
			if (pos<code.length()-1)
				res += code.substring(pos+1);
		}
		else
			res = code;
		return res;
	}
}