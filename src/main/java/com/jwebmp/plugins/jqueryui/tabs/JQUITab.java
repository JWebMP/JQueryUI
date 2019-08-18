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
package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;

import javax.validation.constraints.NotNull;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * A specific tab for the JWAccordion
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITab<J extends JQUITab<J>>

{


	/**
	 * The header for a tab
	 */
	private ListItem tabHeader;
	/**
	 * The child component for a tab
	 */
	private JQUITabContent tabDisplayComponent;

	/**
	 * Any tab to be displayed
	 *
	 * @param tabHeader
	 * @param tabDisplayComponent
	 */
	public JQUITab(ListItem<?> tabHeader, JQUITabContent<?> tabDisplayComponent)
	{
		if (tabDisplayComponent != null)
		{
			Link tabLink = new Link(STRING_HASH + tabDisplayComponent
					                                      .getID(), null, tabHeader.getText(0)
			                                                                       .toString());
			tabHeader.setText((String) null);
			tabHeader.add(tabLink);
		}
		this.tabHeader = tabHeader;
		this.tabDisplayComponent = tabDisplayComponent;
		if (tabDisplayComponent != null)
		{
			tabDisplayComponent
					.addClass(JQUIThemeBlocks.UI_Widget_Content.toString());
		}
	}

	/**
	 * Returns the tab header
	 *
	 * @return
	 */
	public ListItem getTabHeader()
	{
		return tabHeader;
	}

	/**
	 * Sets the tab header
	 *
	 * @param tabHeader
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabHeader(ListItem tabHeader)
	{
		this.tabHeader = tabHeader;
		return (J) this;
	}

	/**
	 * Returns the children of the tab
	 *
	 * @return
	 */
	public JQUITabContent getTabDisplayComponent()
	{
		return tabDisplayComponent;
	}

	/**
	 * Sets the children of the display
	 *
	 * @param tabDisplayComponent
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabDisplayComponent(JQUITabContent tabDisplayComponent)
	{
		this.tabDisplayComponent = tabDisplayComponent;
		return (J) this;
	}
}
