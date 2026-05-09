package com.jwebmp.plugins.jqueryui.datepicker.interfaces;

import com.jwebmp.plugins.jqueryui.datepicker.JQUIDatePickerFeature;
import com.jwebmp.plugins.jqueryui.datepicker.options.JQUIDatePickerOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public interface IJQUIDatePicker
{

	/**
	 * Returns the feature of this date picker
	 * <p>
	 *
	 * @return
	 */
	JQUIDatePickerFeature<?> getInputFeature();

	/**
	 * Returns the options of an item
	 * <p>
	 *
	 * @return
	 */
	JQUIDatePickerOptions<?> getOptions();

}
