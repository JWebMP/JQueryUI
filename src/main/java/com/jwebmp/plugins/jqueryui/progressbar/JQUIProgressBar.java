package com.jwebmp.plugins.jqueryui.progressbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.IJQUIProgressBar;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarChildren;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarEvents;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarFeatures;
import com.jwebmp.plugins.jqueryui.progressbar.options.JQUIProgressBarOptions;

/**
 * The Query UI Implementation of a progress bar
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
@ComponentInformation(name = "JQuery UI Progress Bar",
		description = "The progress bar is designed to display the current percent " +
		              "complete for a process. The bar is coded to be flexibly " +
		              "sized through CSS and will scale to fit inside its parent " +
		              "container by default.",
		url = "http://jqueryui.com/progressbar/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIProgressBar<J extends JQUIProgressBar<J>>
		extends Div<JQUIProgressBarChildren, NoAttributes, JQUIProgressBarFeatures, JQUIProgressBarEvents, J>
		implements IJQUIProgressBar
{


	/**
	 * The feature for the progress bar
	 */
	private JQUIProgressBarFeature<?> feature;

	/**
	 *
	 */
	public JQUIProgressBar()
	{
		feature = new JQUIProgressBarFeature<>(this);
		addFeature(feature);
	}

	/**
	 * Returns the Progress bar options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIProgressBarOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the feature for this progress bar
	 * <p>
	 *
	 * @return
	 */
	public JQUIProgressBarFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIProgressBarFeature<>(this);
		}
		return feature;
	}

	/**
	 * A neater view
	 *
	 * @return
	 */
	public IJQUIProgressBar asMe()
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
