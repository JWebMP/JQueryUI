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
package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuFeatures;
import com.jwebmp.plugins.jqueryui.selectmenu.options.JQUISelectMenuOptions;

import static com.jwebmp.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISelectMenuFeature<J extends JQUISelectMenuFeature<J>>
		extends Feature<JQUISelectMenuOptions, J>
		implements JQUISelectMenuFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The select menu's component
	 */
	private final Component selectMenu;
	/**
	 * The options associated
	 */
	private JQUISelectMenuOptions<?> options;

	/**
	 * Constructs a new Select Menu Add Options or Option Groups to configure
	 *
	 * @param selectMenu
	 * 		Because off css classing
	 */
	public JQUISelectMenuFeature(Component selectMenu)
	{
		super("JWSelectMenuFeature");
		this.selectMenu = selectMenu;
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
	public JQUISelectMenuOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISelectMenuOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "selectmenu(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
