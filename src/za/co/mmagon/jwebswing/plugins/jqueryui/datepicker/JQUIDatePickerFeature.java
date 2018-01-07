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
package za.co.mmagon.jwebswing.plugins.jqueryui.datepicker;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author mmagon
 */
public class JQUIDatePickerFeature extends Feature<JQUIDatePickerOptions, JQUIDatePickerFeature> implements JQUIDatePickerFeatures
{

	private static final long serialVersionUID = 1L;

	/**
	 * The circular reference for the Date Picker
	 */
	private final JQUIDatePicker dateInput;
	/**
	 * The date picker options
	 */
	private JQUIDatePickerOptions options;

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
		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.DatePicker.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.DatePicker.getCssReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(dateInput.getJQueryID() + "datepicker("
				         + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());

	}

	/**
	 * Return the options available for the Date Picker
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDatePickerOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUIDatePickerOptions();
		}
		return options;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIDatePickerFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIDatePickerFeature that = (JQUIDatePickerFeature) o;

		if (!dateInput.equals(that.dateInput))
		{
			return false;
		}
		return getOptions() != null ? getOptions().equals(that.getOptions()) : that.getOptions() == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + dateInput.hashCode();
		result = 31 * result + (getOptions() != null ? getOptions().hashCode() : 0);
		return result;
	}
}
