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
package com.jwebmp.plugins.jqueryui.menu.options;

import com.jwebmp.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIMenuOptions<J extends JQUIMenuOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * If the item is disabled or not
	 */
	private Boolean disabled;
	/**
	 * The menu icon set available
	 */
	private JQUIMenuIconSet<?> icons;
	/**
	 * The menus
	 */
	private String menus;
	/**
	 * The actual position
	 */
	private PositionOptions positionOptions;
	/**
	 * Customize the ARIA roles used for the menu and menu items.
	 * <p>
	 * The default uses "menuitem" for items.
	 * <p>
	 * Setting the role option to "listbox" will use "option" for items.<p>
	 * If set to null, no roles will be set, which is useful if the menu is being controlled by another element that is maintaining focus.
	 */
	private String role;

	/**
	 * Disables the menu if set to true
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Disables the menu if set to true
	 *
	 * @param disabled
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Icons to use for submenus, matching an icon provided by the jQuery UI CSS Framework.
	 * <p>
	 * submenu (string, default: "ui-icon-carat-1-e")
	 *
	 * @return
	 */
	public JQUIMenuIconSet<?> getIcons()
	{
		return icons;
	}

	/**
	 * Icons to use for submenus, matching an icon provided by the jQuery UI CSS Framework.
	 * <p>
	 * submenu (string, default: "ui-icon-carat-1-e")
	 *
	 * @param icons
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcons(JQUIMenuIconSet<?> icons)
	{
		this.icons = icons;
		return (J) this;
	}

	/**
	 * Selector for the elements that serve as the menu container, including sub-menus.
	 *
	 * @return
	 */
	public String getMenus()
	{
		return menus;
	}

	/**
	 * Selector for the elements that serve as the menu container, including sub-menus.
	 *
	 * @param menus
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMenus(ComponentTypes menus)
	{
		this.menus = menus.getComponentTag();
		return (J) this;
	}

	/**
	 * <p>
	 * Identifies the position of submenus in relation to the associated parent menu item.<p>
	 * The of option defaults to the parent menu item, but you can specify another element to position against.<p>
	 * You can refer to the jQuery UI Position utility for more details about the various options.
	 *
	 * @return
	 */
	public PositionOptions getPositionOptions()
	{
		return positionOptions;
	}

	/**
	 * <p>
	 * Identifies the position of submenus in relation to the associated parent menu item.<p>
	 * The of option defaults to the parent menu item, but you can specify another element to position against.<p>
	 * You can refer to the jQuery UI Position utility for more details about the various options.
	 *
	 * @param positionOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPositionOptions(PositionOptions positionOptions)
	{
		this.positionOptions = positionOptions;
		return (J) this;
	}

	/**
	 * Customize the ARIA roles used for the menu and menu items.<p>
	 * The default uses "menuitem" for items. Setting the role option to "listbox" will use "option" for items.
	 * <p>
	 * If set to null, no roles will be set, which is useful if the menu is being controlled by another element that is maintaining focus.
	 *
	 * @return
	 */
	public String getRole()
	{
		return role;
	}

	/**
	 * Customize the ARIA roles used for the menu and menu items.<p>
	 * The default uses "menuitem" for items. Setting the role option to "listbox" will use "option" for items.
	 * <p>
	 * If set to null, no roles will be set, which is useful if the menu is being controlled by another element that is maintaining focus.
	 *
	 * @param role
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRole(String role)
	{
		this.role = role;
		return (J) this;
	}
}
