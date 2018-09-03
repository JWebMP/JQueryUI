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
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUISlider<J extends JQUISlider<J>>
		extends Div<JQUISliderChildren, NoAttributes, JQUISliderFeatures, JQUISliderEvents, J>
		implements IJQUISlider
{

	private static final long serialVersionUID = 1L;
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
			options = new JQUISliderOptions();
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
