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

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.servlets.enumarations.Orientation;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.menu.interfaces.IJQUIMenu;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.menu.options.JQUIMenuOptions;

/**
 * A menu with the default configuration, disabled items and nested menus.
 * <p>
 * A list is transformed, adding theming, mouse and keyboard navigation support.
 * <p>
 * Try to tab to the menu then use the cursor keys to navigate.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
@ComponentInformation(name = "JQuery UI Menu",
		description = "A menu with the default configuration, disabled items and nested menus. A " +
		              "list is transformed, adding theming, mouse and keyboard " +
		              "navigation" +
		              " " +
		              "support. Try to tab to the menu then use the " +
		              "cursor keys to " +
		              "navigate" +
		              ".",
		url = "http://jqueryui.com/menu/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIMenu<J extends JQUIMenu<J>>
		extends List<JQUIMenuChildren, NoAttributes, JQUIMenuEvents, J>
		implements IJQUIMenu
{

	private static final long serialVersionUID = 1L;
	private Orientation orientation;
	private JQUIMenuFeature<?> feature;

	/**
	 * Creates an ordered list
	 *
	 * @param orientation
	 */
	public JQUIMenu(Orientation orientation)
	{
		this.orientation = orientation;
		addFeature(getFeature());

	}

	/**
	 * Returns an instance of this feature
	 * <p>
	 *
	 * @return
	 */
	public final JQUIMenuFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIMenuFeature<>(this);
		}
		return feature;
	}

	/**
	 * Gets the options of the menu
	 *
	 * @return
	 */
	@Override
	public JQUIMenuOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns a cleaner view of this object
	 *
	 * @return
	 */
	public IJQUIMenu asMe()
	{
		return this;
	}

	public Orientation getOrientation()
	{
		if (orientation == null)
		{
			orientation = Orientation.HORIZONTAL;
		}
		return orientation;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
