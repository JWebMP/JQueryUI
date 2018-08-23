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

import com.jwebmp.core.base.html.OptionGroup;
import com.jwebmp.core.base.html.interfaces.children.SelectChildren;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISelectMenuGroup<J extends JQUISelectMenuGroup<J>>
		extends OptionGroup<J>
		implements JQUISelectMenuChildren<SelectChildren, J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * A option group
	 */
	public JQUISelectMenuGroup()
	{
		this("Group");
	}

	/**
	 * Constructs a new select menu group
	 *
	 * @param label
	 */
	public JQUISelectMenuGroup(String label)
	{
		super(label);
	}

}
