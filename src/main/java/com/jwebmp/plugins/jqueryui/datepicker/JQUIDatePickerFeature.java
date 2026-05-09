package com.jwebmp.plugins.jqueryui.datepicker;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.datepicker.options.JQUIDatePickerOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author mmagon
 */
public class JQUIDatePickerFeature<J extends JQUIDatePickerFeature<J>>
		extends Feature<GlobalFeatures, JQUIDatePickerOptions<?>, J>
{
	/**
	 * The circular reference for the Date Picker
	 */
	private final JQUIDatePicker<?> dateInput;
	/**
	 * The date picker options
	 */
	private JQUIDatePickerOptions<?> options;

	/**
	 * Constructs a new date picker JS for the given object
	 * <p>
	 *
	 * @param dateInput
	 */
	public JQUIDatePickerFeature(JQUIDatePicker<?> dateInput)
	{
		super("dateinput");
		this.dateInput = dateInput;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Return the options available for the Date Picker
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDatePickerOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIDatePickerOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(dateInput.getJQueryID() + "datepicker(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());

	}
}
