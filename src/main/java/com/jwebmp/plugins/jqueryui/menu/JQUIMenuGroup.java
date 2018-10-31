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
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.themes.JQUIThemeBlocks;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 30 Oct 2015
 */
public class JQUIMenuGroup<J extends JQUIMenuGroup<J>>
		extends List<JQUIMenuChildren, NoAttributes, JQUIMenuEvents, J>
		implements JQUIMenuChildren<JQUIMenuChildren, J>
{


	public JQUIMenuGroup()
	{
		addClass(JQUIThemeBlocks.UI_Widget_Header.toString());
	}

}
