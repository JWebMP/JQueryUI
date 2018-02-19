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
package za.co.mmagon.jwebswing.plugins.jqueryui.tabs;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.jqueryui.themes.JQUIThemeBlocks;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_HASH;

/**
 * A specific tab for the JWAccordion
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITab<J extends JQUITab<J>> implements Serializable
{

	private static final long serialVersionUID = 1L;
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
	public JQUITab(ListItem tabHeader, JQUITabContent tabDisplayComponent)
	{
		if (tabDisplayComponent != null)
		{
			Link tabLink = new Link(STRING_HASH + Component.class.cast(tabDisplayComponent)
					                                      .getID(), null, tabHeader.getText(0)
							                                                      .toString());
			tabHeader.setText((String) null);
			tabHeader.add(tabLink);
		}
		this.tabHeader = tabHeader;
		this.tabDisplayComponent = tabDisplayComponent;
		if (tabDisplayComponent != null)
		{
			Component.class.cast(tabDisplayComponent)
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
