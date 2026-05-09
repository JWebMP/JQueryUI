package com.jwebmp.plugins.jqueryui.button;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.html.attributes.ButtonAttributes;
import com.jwebmp.core.base.html.interfaces.NoNewLineBeforeClosingTag;
import com.jwebmp.core.base.html.interfaces.NoNewLineForRawText;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionChildren;
import com.jwebmp.plugins.jqueryui.button.interfaces.JQUIButtonChildren;
import com.jwebmp.plugins.jqueryui.button.interfaces.JQUIButtonEvents;
import com.jwebmp.plugins.jqueryui.button.interfaces.JQUIButtonFeatures;
import com.jwebmp.plugins.jqueryui.button.options.JQUIButtonOptions;

import jakarta.validation.constraints.NotNull;

/**
 * This class implements the JQuery UI implementation of a normal button
 *
 * @param <J>
 *
 * @author MMagon
 * @version 1.0
 * 		<p>
 * 		Update 2014/07/09 - Added attribute for identification in JQuery. Minimizing the JavaScript being sent through.
 * @since 09 Mar 2013
 */
@ComponentInformation(name = "JQuery UI Button",
		description = "Enhances standard form elements like buttons, inputs and anchors to " + "themeable buttons with appropriate hover and active styles.",
		url = "http://jqueryui.com/button/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIButton<J extends JQUIButton<J>>
		extends Component<JQUIButtonChildren, ButtonAttributes, JQUIButtonFeatures, JQUIButtonEvents, J>
		implements NoNewLineBeforeClosingTag, NoNewLineForRawText, JQUIAccordionChildren
{


	private JQUIButtonFeature<?> feature;

	/**
	 * Constructs a new JWButton
	 */
	public JQUIButton()
	{
		this(null);
	}

	/**
	 * Constructs a new Button of type button
	 *
	 * @param text
	 */
	public JQUIButton(String text)
	{
		super(ComponentTypes.Button);
		setText(text);
		getFeature();
	}

	/**
	 * Returns the feature associated with this object
	 *
	 * @return
	 */
	public final JQUIButtonFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIButtonFeature<>(this);
			addFeature(feature);
		}
		return feature;
	}

	/**
	 * Returns the button options from the feature
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIButtonOptions<?> getOptions()
	{
		return getFeature().getOptions();
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
