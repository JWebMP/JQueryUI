package com.jwebmp.plugins.jqueryui.spinner.interfaces;

import com.jwebmp.plugins.globalize.cultures.GlobalizeCultures;
import com.jwebmp.plugins.jqueryui.spinner.JQUISpinner;
import com.jwebmp.plugins.jqueryui.spinner.JQUISpinnerInput;
import com.jwebmp.plugins.jqueryui.spinner.JQUISpinnerLabel;
import com.jwebmp.plugins.jqueryui.spinner.options.JQUISpinnerOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public interface IJQUISpinner
{

	/**
	 * Adds the specific culture to the options
	 *
	 * @param culture
	 *
	 * @return
	 */
	JQUISpinner addGlobalization(GlobalizeCultures culture);

	/**
	 * Sets the header text
	 *
	 * @return
	 */
	String getHeaderText();

	/**
	 * Returns the input option
	 *
	 * @return
	 */
	JQUISpinnerInput<?, ?> getInput();

	/**
	 * Returns the label object with this spinner
	 * <p>
	 *
	 * @return
	 */
	JQUISpinnerLabel<?> getLabel();

	/**
	 * Returns the options associated with this spinner
	 * <p>
	 *
	 * @return
	 */
	JQUISpinnerOptions<?> getOptions();

	/**
	 * Gets the header text
	 *
	 * @param headerText
	 *
	 * @return
	 */
	JQUISpinner setHeaderText(String headerText);

	/**
	 * Sets the Input Object
	 *
	 * @param input
	 *
	 * @return
	 */
	JQUISpinner setInput(JQUISpinnerInput<?, ?> input);

	/**
	 * Sets the entry label with this spinner
	 * <p>
	 *
	 * @param label
	 *
	 * @return
	 */
	JQUISpinner setLabel(JQUISpinnerLabel<?> label);

}
