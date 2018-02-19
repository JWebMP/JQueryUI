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
package za.co.mmagon.jwebswing.plugins.jqueryui.spinner;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.globalize.cultures.GlobalizeCultures;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.IJQUISpinner;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.JQUISpinnerChildren;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.JQUISpinnerFeatures;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.options.JQUISpinnerOptions;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
@ComponentInformation(name = "JQuery UI Spinner",
		description = "The Spinner, or number stepper widget, is perfect for handling all kinds of numeric input. It allows users to type a value directly, or modify an existing value by spinning with the keyboard, mouse or scrollwheel. When combined with Globalize, you can even spin currencies and dates in a variety of locales.",
		url = "http://jqueryui.com/spinner/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUISpinner extends Div<JQUISpinnerChildren, NoAttributes, JQUISpinnerFeatures, JQUISpinnerEvents, JQUISpinner>
		implements IJQUISpinner
{

	private static final long serialVersionUID = 1L;
	/**
	 * The header text for the spinner
	 */
	private String headerText = "JQuery UI Spinner Demo";
	/**
	 * The actual input
	 */
	private JQUISpinnerInput input;

	/**
	 * The pre-child labour
	 */
	private JQUISpinnerLabel label;
	/**
	 * The spinner feature
	 */
	private JQUISpinnerFeature feature;

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 */
	public JQUISpinner()
	{
		this(null);
	}

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 *
	 * @param labelText
	 * 		THe label of the Spinner
	 */
	public JQUISpinner(String labelText)
	{
		input = new JQUISpinnerInput();
		input.addFeature(getFeature());
		input.setID(getID() + "_spinnerInput");
		if (labelText != null)
		{
			label = new JQUISpinnerLabel(labelText);
			label.setForInputComponent(input);
		}
	}

	/**
	 * Returns the label object with this spinner
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerLabel getLabel()
	{
		return label;
	}

	/**
	 * Sets the entry label with this spinner
	 * <p>
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	public JQUISpinner setLabel(JQUISpinnerLabel label)
	{
		this.label = label;
		return this;
	}

	/**
	 * Returns the options associated with this spinner
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerOptions getOptions()
	{
		return feature.getOptions();
	}

	public final JQUISpinnerFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUISpinnerFeature(input);
		}
		return feature;
	}

	/**
	 * Adds the specific culture to the options
	 *
	 * @param culture
	 *
	 * @return
	 */
	@Override
	public JQUISpinner addGlobalization(GlobalizeCultures culture)
	{
		getJavascriptReferences().add(GlobalizeCultures.getJavascriptReference());
		getOptions().setCulture(culture.toString());
		return this;
	}

	/**
	 * Sets the header text
	 *
	 * @return
	 */
	@Override
	public String getHeaderText()
	{
		return headerText;
	}

	/**
	 * Gets the header text
	 *
	 * @param headerText
	 *
	 * @return
	 */
	@Override
	public JQUISpinner setHeaderText(String headerText)
	{
		this.headerText = headerText;
		return this;
	}

	/**
	 * Returns the input option
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerInput getInput()
	{
		return input;
	}

	/**
	 * Sets the Input Object
	 *
	 * @param input
	 *
	 * @return
	 */
	@Override
	public JQUISpinner setInput(JQUISpinnerInput input)
	{
		this.input = input;
		return this;
	}

	@Override
	protected StringBuilder renderBeforeTag()
	{
		if (getLabel() != null)
		{
			return new StringBuilder().append(getCurrentTabIndentString()).append(getLabel().toString(true)).append(getNewLine());
		}
		else
		{
			return null;
		}
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(getInput());
		}
		super.preConfigure();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUISpinner))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUISpinner that = (JQUISpinner) o;

		if (getHeaderText() != null ? !getHeaderText().equals(that.getHeaderText()) : that.getHeaderText() != null)
		{
			return false;
		}
		if (getInput() != null ? !getInput().equals(that.getInput()) : that.getInput() != null)
		{
			return false;
		}
		if (getLabel() != null ? !getLabel().equals(that.getLabel()) : that.getLabel() != null)
		{
			return false;
		}
		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getHeaderText() != null ? getHeaderText().hashCode() : 0);
		result = 31 * result + (getInput() != null ? getInput().hashCode() : 0);
		result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
