/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqueryui.datepicker;

import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.datepicker.interfaces.JQUIDatePickerFeatures;
import com.jwebmp.plugins.jqueryui.datepicker.options.JQUIDatePickerOptions;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author mmagon
 */
public class JQUIDatePickerFeature<J extends JQUIDatePickerFeature<J>>
		extends Feature<JQUIDatePickerOptions, J>
		implements JQUIDatePickerFeatures
{

	private static final long serialVersionUID = 1L;

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
	public JQUIDatePickerFeature(JQUIDatePicker dateInput)
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
