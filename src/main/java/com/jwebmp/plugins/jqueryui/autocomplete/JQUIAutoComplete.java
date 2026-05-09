package com.jwebmp.plugins.jqueryui.autocomplete;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.attributes.LabelAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteChildren;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteFeatures;
import com.jwebmp.plugins.jqueryui.autocomplete.options.JQUIAutoCompleteOptions;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;

/**
 * Description: Autocomplete enables users to quickly find and select from a pre-populated list of values as they type, leveraging
 * searching and filtering.
 *
 * @author GedMarc
 * @version 1.0
 * @since 06 Aug 2015
 */
@SuppressWarnings("MissingClassJavaDoc")
@ComponentInformation(name = "JQuery UI Auto Complete",
		description = "Enables users to quickly find and select from a pre-populated " +
		              "list of values as they type, leveraging " +
		              "searching and  filtering" +
		              ".",
		url = "http://jqueryui.com/autocomplete/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIAutoComplete<J extends JQUIAutoComplete<J>>
		extends Div<JQUIAutoCompleteChildren, NoAttributes, JQUIAutoCompleteFeatures, JQUIAutoCompleteEvents, J>
{
	/**
	 * The feature for the input
	 */
	private JQUIAutoCompleteFeature<?> feature;

	/**
	 * The input label for the auto complete
	 */
	private JQUIAutoCompleteLabel<?> label;
	/**
	 * The actual label for the input
	 */
	private JQUIAutoCompleteInput<?> input;

	/**
	 * Description: Autocomplete enables users to quickly find and select from a pre-populated list of values as they type, leveraging
	 * searching and filtering.
	 *
	 * @param label
	 */
	public JQUIAutoComplete(String label)
	{
		input = new JQUIAutoCompleteInput<>();
		this.label = new JQUIAutoCompleteLabel<>(label, input);
		add(this.label);
		add(input);
		feature = new JQUIAutoCompleteFeature<>(input);
		addFeature(feature);
		addClass(JQUIThemeBlocks.UI_Widget.toString());
	}

	/**
	 * Gets the label object for the auto complete
	 *
	 * @return
	 */
	public JQUIAutoCompleteLabel<?> getLabel()
	{
		return label;
	}

	/**
	 * Sets the label object for the auto complete
	 *
	 * @param label
	 */
	public void setLabel(JQUIAutoCompleteLabel<?> label)
	{
		this.label = label;
		label.addAttribute(LabelAttributes.For, getInput().getID());
	}

	/**
	 * Gets the input object for this auto complete
	 *
	 * @return
	 */
	public Input<?,?> getInput()
	{
		return input;
	}

	/**
	 * Sets the input object
	 *
	 * @param input
	 */
	public void setInput(JQUIAutoCompleteInput<?> input)
	{
		remove(input);
		feature = new JQUIAutoCompleteFeature<>(input);
		input.addFeature(feature);
		this.input = input;
	}

	/**
	 * Returns the options supported for the auto complete
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIAutoCompleteOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the feature attached to this component
	 * <p>
	 *
	 * @return
	 */
	public JQUIAutoCompleteFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIAutoCompleteFeature<>(input);
		}
		return feature;
	}

	/**
	 * Sets the feature for the Auto Complete Function
	 * <p>
	 *
	 * @param feature
	 */
	public void setFeature(JQUIAutoCompleteFeature<?> feature)
	{
		this.feature = feature;
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
