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

import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderFeatures;
import com.jwebmp.plugins.jqueryui.slider.options.JQUISliderOptions;
import com.jwebmp.plugins.pools.jqueryui.JQUIReferencePool;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISliderFeature<J extends JQUISliderFeature<J>>
		extends Feature<JQUISliderOptions, J>
		implements JQUISliderFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The actual slider for the menu
	 */
	private final JQUISlider<?> selectMenu;
	/**
	 * The options for the select menu
	 */
	private JQUISliderOptions<?> options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISliderFeature(JQUISlider selectMenu)
	{
		super("JWPSelectMenuFeature");
		this.selectMenu = selectMenu;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Slider.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Slider.getCssReference());
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

	@Override
	public JQUISliderOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUISliderOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "slider(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}