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
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.InputTextType;
import za.co.mmagon.jwebswing.base.html.attributes.LabelAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.servlets.interfaces.IDataComponent;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqueryui.themes.JQUIThemeBlocks;

/**
 * Description: Autocomplete enables users to quickly find and select from a pre-populated list of values as they type, leveraging searching and filtering.
 *
 * @author Marc Magon
 * @version 1.0
 * @since 06 Aug 2015
 */
@ComponentInformation(name = "JQuery UI Auto Complete", description = "Enables users to quickly find and select from a pre-populated list of values as they type, leveraging searching and filtering.",
		url = "http://jqueryui.com/autocomplete/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIAutoComplete
		extends Div<JQUIAutoCompleteChildren, NoAttributes, JQUIAutoCompleteFeatures, JQUIAutoCompleteEvents, JQUIAutoComplete>
		implements IDataComponent
{

	/**
	 * Version 1
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The feature for the input
	 */
	private JQUIAutoCompleteFeature feature;

	/**
	 * The input label for the auto complete
	 */
	private JQUIAutoCompleteLabel label;
	/**
	 * The actual label for the input
	 */
	private Input input;

	/**
	 * Description: Autocomplete enables users to quickly find and select from a pre-populated list of values as they type, leveraging searching and filtering.
	 *
	 * @param label
	 */
	public JQUIAutoComplete(String label)
	{
		input = new InputTextType();
		this.label = new JQUIAutoCompleteLabel(label, input);
		getChildren().add(this.label);
		getChildren().add(input);
		feature = new JQUIAutoCompleteFeature(input);
		addFeature(feature);
		addClass(JQUIThemeBlocks.UI_Widget.toString());
	}

	/**
	 * Gets the label object for the auto complete
	 *
	 * @return
	 */
	public JQUIAutoCompleteLabel getLabel()
	{
		return label;
	}

	/**
	 * Sets the label object for the auto complete
	 *
	 * @param label
	 */
	public void setLabel(JQUIAutoCompleteLabel label)
	{
		this.label = label;
		label.addAttribute(LabelAttributes.For, getInput().getID());
	}

	/**
	 * Gets the input object for this auto complete
	 *
	 * @return
	 */
	public Input getInput()
	{
		return input;
	}

	/**
	 * Sets the input object
	 *
	 * @param input
	 */
	public void setInput(Input input)
	{
		getChildren().remove(input);
		feature = new JQUIAutoCompleteFeature(input);
		input.addFeature(feature);
		this.input = input;
	}

	/**
	 * Returns the feature attached to this component
	 * <p>
	 *
	 * @return
	 */
	public JQUIAutoCompleteFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIAutoCompleteFeature(input);
		}
		return feature;
	}

	/**
	 * Sets the feature for the Auto Complete Function
	 * <p>
	 *
	 * @param feature
	 */
	public void setFeature(JQUIAutoCompleteFeature feature)
	{
		this.feature = feature;
	}

	/**
	 * Returns the options supported for the auto complete
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIAutoCompleteOptions getOptions()
	{
		return getFeature().getOptions();
	}

	@Override
	public AutoCompleteEntrySet getData(java.util.Map params)
	{
		AutoCompleteEntrySet entrySet = new AutoCompleteEntrySet();
		String searchTerm = params.get("term").toString();
		getOptions().getSource().forEach(next->{
			if(next.toString().toLowerCase().startsWith(searchTerm.toLowerCase()))
			{
				entrySet.getSource().add(next);
			}
		});
		return entrySet;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIAutoComplete that = (JQUIAutoComplete) o;

		if (!getFeature().equals(that.getFeature()))
		{
			return false;
		}
		if (getLabel() != null ? !getLabel().equals(that.getLabel()) : that.getLabel() != null)
		{
			return false;
		}
		return getInput().equals(that.getInput());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
		result = 31 * result + getInput().hashCode();
		return result;
	}
}
