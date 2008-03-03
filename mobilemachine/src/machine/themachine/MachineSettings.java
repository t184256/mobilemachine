/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package machine.themachine;

/**
 *
 * @author lantern
 */
public class MachineSettings {
	private boolean wrap = true;
	private long minValue = 0;
	private long maxValue = 255;
	private Mapping mapping;

	public boolean isWrap() {
		return wrap;
	}

	public void setWrap(boolean wrap) {
		this.wrap = wrap;
	}

	public long getMinValue() {
		return minValue;
	}

	public void setMinValue(long minValue) {
		this.minValue = minValue;
	}

	public long getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}

	public void setCorrectMinMaxValue(long minValue, long maxValue) {
		this.minValue=minValue;
		this.maxValue=maxValue;
		makeBoundsCorrect();
	}

	private void makeBoundsCorrect() {
		if(minValue>0)
			minValue=0;
		if(maxValue<0)
			maxValue=0;
		if(minValue>maxValue)
			maxValue=minValue;
	}

	public Mapping getMapping() {
		return mapping;
	}

	public void setMapping(Mapping mapping) {
		this.mapping = mapping;
	}
}
