package com.jwebmp.plugins.jqueryui.checkboxradio.interfaces;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public interface IJQUICheckBox
{

	/**
	 * Sets the label of this checkbox
	 *
	 * @return
	 */
	String getLabel();

	/**
	 * Sets the label of this checkbox
	 *
	 * @param label
	 */
	void setLabel(String label);

	JQUICheckBoxRadioOptions getOptions();

	/**
	 * Gets the value of this checkbox
	 *
	 * @return
	 */
	String getValue();

	Input setValue(String value);

}
