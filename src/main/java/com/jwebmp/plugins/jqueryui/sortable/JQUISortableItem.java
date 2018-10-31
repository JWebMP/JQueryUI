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
package com.jwebmp.plugins.jqueryui.sortable;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.JQUISortableChildren;
import com.jwebmp.plugins.jqueryui.themes.JQUIThemeBlocks;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISortableItem<J extends JQUISortableItem<J>>
		extends ListItem<J>
		implements JQUISortableChildren<ListItemChildren, J>
{


	/**
	 * Constructs a new sortable item with any children available
	 */
	public JQUISortableItem()
	{

	}

	/**
	 * Constructs a new sortable item with any children available and the given raw text
	 *
	 * @param text
	 */
	public JQUISortableItem(String text)
	{
		super(text);
	}

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addClass(JQUIThemeBlocks.UI_State_Default.toString());
		}
		else
		{
			removeClass(JQUIThemeBlocks.UI_State_Default.toString());
		}
		return (J) this;
	}
}
