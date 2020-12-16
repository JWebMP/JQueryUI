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

import com.jwebmp.core.base.html.Option;
import com.jwebmp.core.base.html.attributes.InputAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.utilities.GUIDGenerator;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.IJQUISelectMenuItem;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISelectMenuItem<J extends JQUISelectMenuItem<J>>
		extends Option<J>
		implements JQUISelectMenuChildren, IJQUISelectMenuItem
{


	private static final String selectedString = "selected";

	/**
	 * Construct a new select menu item
	 */
	public JQUISelectMenuItem()
	{
		this(GUIDGenerator.generateGuid());
	}

	/**
	 * Constructs with a given value
	 *
	 * @param value
	 */
	public JQUISelectMenuItem(String value)
	{
		super(value);
	}

	/**
	 * A much neater view
	 *
	 * @return
	 */
	public IJQUISelectMenuItem asMe()
	{
		return this;
	}

	/**
	 * Sets the label
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(String label)
	{
		super.setLabel(label);
		return (J) this;
	}

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addAttribute(InputAttributes.Disabled.toString(), null);
		}
		return (J) this;
	}

	/**
	 * If the item is selected
	 *
	 * @param selected
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSelected(boolean selected)
	{
		if (selected)
		{
			addAttribute(JQUISelectMenuItem.selectedString, JQUISelectMenuItem.selectedString);
		}
		else
		{
			getAttributes().remove(JQUISelectMenuItem.selectedString);
		}

		return (J) this;
	}

}
