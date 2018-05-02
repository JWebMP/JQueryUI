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
package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuFeatures;
import com.jwebmp.plugins.jqueryui.menu.options.JQUIMenuOptions;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIMenuFeature<J extends JQUIMenuFeature<J>>
		extends Feature<JQUIMenuOptions, J>
		implements JQUIMenuFeatures
{

	private static final long serialVersionUID = 1L;

	private JQUIMenu<?> menu;
	/**
	 * The options of the menu
	 */
	private JQUIMenuOptions<?> options;

	/**
	 * @param menu
	 * 		The menu creating for
	 */
	public JQUIMenuFeature(JQUIMenu menu)
	{
		super("JWMenuFeature");
		this.menu = menu;
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

	/**
	 * Gets the options of the menu
	 *
	 * @return
	 */
	@Override
	public JQUIMenuOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIMenuOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(menu.getJQueryID() + "menu(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
