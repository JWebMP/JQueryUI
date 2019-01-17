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
package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.core.utilities.StaticStrings;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;

/**
 * @author GedMarc
 * @version 1.0
 * @since 30 Oct 2015
 */
public class JQUIMenuItemDivider<J extends JQUIMenuItemDivider<J>>
		extends ListItem<J>
		implements JQUIMenuChildren<ListItemChildren, J>
{


	/**
	 * Creates a menu item divider
	 */
	public JQUIMenuItemDivider()
	{
		super(StaticStrings.STRING_DASH);
	}

}
