package com.jwebmp.plugins.jqueryui.resizable;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.IJQUIResizable;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableChildren;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableFeatures;
import com.jwebmp.plugins.jqueryui.resizable.options.JQUIResizableOptions;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
@SuppressWarnings("MissingClassJavaDoc")
@ComponentInformation(name = "JQuery UI Resizable",
		description = "Enable any DOM element to be resizable. With the cursor grab the " + "right" + " or bottom border and drag to the desired width or " + "height.",
		url = "http://jqueryui.com/resizable/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIResizable<J extends JQUIResizable<J>>
		extends Div<JQUIResizableChildren, NoAttributes, JQUIResizableFeatures, JQUIResizableEvents, J>
		implements IJQUIResizable
{
	/**
	 * The resizable feature
	 */
	private JQUIResizableFeature<?> feature;

	/**
	 * Adds the feature to the resizable
	 */
	public JQUIResizable()
	{
		feature = new JQUIResizableFeature<>(this);
		addFeature(feature);
	}

	/**
	 * Returns the features options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIResizableOptions<?> getOptions()
	{
		return feature.getOptions();
	}

	/**
	 * Returns this feature
	 *
	 * @return
	 */
	public JQUIResizableFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIResizableFeature<>(this);
		}
		return feature;
	}

	/**
	 * Sets this feature
	 *
	 * @param feature
	 */
	public void setFeature(JQUIResizableFeature<?> feature)
	{
		this.feature = feature;
	}

	/**
	 * A neater representation
	 *
	 * @return
	 */
	public IJQUIResizable asMe()
	{
		return this;
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
