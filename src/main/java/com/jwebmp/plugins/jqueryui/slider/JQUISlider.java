package com.jwebmp.plugins.jqueryui.slider;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.slider.interfaces.IJQUISlider;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderChildren;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderEvents;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderFeatures;
import com.jwebmp.plugins.jqueryui.slider.options.JQUISliderOptions;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 9, 2015
 */
@SuppressWarnings("MissingClassJavaDoc")
@ComponentInformation(name = "JQuery UI Slider",
		description = "The jQuery UI Slider plugin makes selected elements into sliders. There " +
		              "are various options such as multiple handles and ranges. The " +
		              "handle can be moved with the mouse or the arrow keys.",
		url = "http://jqueryui.com/slider/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUISlider<J extends JQUISlider<J>>
		extends Div<JQUISliderChildren, NoAttributes, JQUISliderFeatures, JQUISliderEvents, J>
		implements IJQUISlider
{
	/**
	 * The feature for this component
	 */
	private final JQUISliderFeature<?> slider;
	/**
	 * The options for this component
	 */
	private JQUISliderOptions<?> options;

	/**
	 *
	 */
	public JQUISlider()
	{
		slider = new JQUISliderFeature<>(this);
		addFeature(slider);
	}

	/**
	 * Returns the actual slider
	 *
	 * @return
	 */
	public JQUISliderFeature<?> getSlider()
	{
		return slider;
	}

	/**
	 * Returns the slider options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISliderOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISliderOptions<>();
		}
		return options;
	}

	/**
	 * The slider as me
	 *
	 * @return
	 */
	public IJQUISlider asMe()
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
