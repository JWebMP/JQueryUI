/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.selectmenu.options.JQUISelectMenuOptions;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * @since Mar 8, 2015
 */
public class JQUISelectMenuFeature<J extends JQUISelectMenuFeature<J>>
		extends Feature<GlobalFeatures, JQUISelectMenuOptions<?>, J>
{
	/**
	 * The select menu's component
	 */
	private final IComponentHierarchyBase<?, ?> selectMenu;
	/**
	 * The options associated
	 */
	private JQUISelectMenuOptions<?> options;
	
	/**
	 * Constructs a new Select Menu Add Options or Option Groups to configure
	 *
	 * @param selectMenu Because off css classing
	 */
	public JQUISelectMenuFeature(IComponentHierarchyBase<?, ?> selectMenu)
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
		addQuery(selectMenu.asBase()
		                   .getJQueryID() + "selectmenu(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
