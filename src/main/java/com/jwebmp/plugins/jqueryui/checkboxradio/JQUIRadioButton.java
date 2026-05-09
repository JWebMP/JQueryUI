package com.jwebmp.plugins.jqueryui.checkboxradio;

import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.inputs.InputRadioType;
import com.jwebmp.core.base.html.interfaces.children.FieldSetChildren;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.checkboxradio.interfaces.IJQUICheckBox;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
@ComponentInformation(name = "JQuery UI Radio Button",
		description = "Enhances standard checkbox and radio input element to themeable " + "buttons with appropriate hover and active " + "styles.",
		url = "http://jqueryui.com/button/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")

public class JQUIRadioButton<J extends JQUIRadioButton<J>>
		extends InputRadioType<J>
		implements IJQUICheckBox, FieldSetChildren
{
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
		feature = new JQUICheckBoxRadioFeature<>(this);
		addFeature(feature);
	}

	public JQUIRadioButton(String label)
	{
		feature = new JQUICheckBoxRadioFeature<>(this);
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
	public JQUICheckBoxRadioOptions<?> getOptions()
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
	protected StringBuilder renderBeforeTag()
	{
		Label<?> legend = new Label<>();
		legend.setText(label);
		legend.setTiny(true);
		legend.setForInputComponent(this);

		return new StringBuilder().append(getCurrentTabIndentString())
		                          .append(legend.toString(true))
		                          .append(getNewLine());
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
}
