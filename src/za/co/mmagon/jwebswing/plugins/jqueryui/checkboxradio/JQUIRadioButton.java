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
package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.inputs.InputRadioType;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio.interfaces.IJQUICheckBox;
import za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
@ComponentInformation(name = "JQuery UI Radio Button",
		description = "Enhances standard checkbox and radio input element to themeable " + "buttons with appropriate hover and active " +
				              "styles.",
		url = "http://jqueryui.com/button/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")

public class JQUIRadioButton
		extends InputRadioType
		implements IJQUICheckBox
{

	private static final long serialVersionUID = 1L;
	/**
	 * The feature
	 */
	private final JQUICheckBoxRadioFeature<?> feature;
	/**
	 * The label of this checkbox
	 */
	private String label;

	/**
	 * Constructs a new Check Box with the Button feature applied
	 */
	public JQUIRadioButton()
	{
		feature = new JQUICheckBoxRadioFeature(this);
		addFeature(feature);
	}

	public JQUIRadioButton(String label)
	{
		feature = new JQUICheckBoxRadioFeature(this);
		addFeature(feature);
		this.label = label;
	}

	/**
	 * Sets the label of this checkbox
	 *
	 * @return
	 */
	@Override
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label of this checkbox
	 *
	 * @param label
	 */
	@Override
	public void setLabel(String label)
	{
		this.label = label;
	}

	/**
	 * Gets the value of this checkbox
	 *
	 * @return
	 */
	@Override
	public String getValue()
	{
		return super.getAttribute(GlobalAttributes.Value);
	}

	/**
	 * A cleaner view of the check box
	 *
	 * @return
	 */
	public IJQUICheckBox asMe()
	{
		return this;
	}

	@Override
	public JQUICheckBoxRadioOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the feature
	 *
	 * @return
	 */
	public JQUICheckBoxRadioFeature<?> getFeature()
	{
		return feature;
	}

	@Override
	@SuppressWarnings("all")
	protected StringBuilder renderBeforeTag()
	{
		Label legend = new Label();
		legend.setText(label);
		legend.setTiny(true);
		legend.setForInputComponent(this);

		return new StringBuilder().append(getCurrentTabIndentString())
		                          .append(legend.toString(true))
		                          .append(getNewLine());
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
