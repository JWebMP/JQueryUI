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
package com.jwebmp.plugins.jqueryui.selectmenu.options;

import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public class JQUISelectMenuOptions<J extends JQUISelectMenuOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Which element to append the menu to. When the value is null, the parents of the select are checked for a class name of ui-front. If
	 * an element with the ui-front class name is found, the menu is
	 * appended to that element.<p>
	 * Regardless of the value, if no element is found, the menu is appended to the body.
	 */
	private String appendTo;
	/**
	 * Disables the select menu if set to true.
	 */
	private Boolean disabled;
	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private JQUISelectMenuIconsOptions<?> icons;
	/**
	 * Identifies the position of the menu in relation to the associated button element. You can refer to the jQuery UI Position utility
	 * for more details about the various options.
	 */
	private PositionOptions<?> positionOptions;
	/**
	 * The width of the menu, in pixels. When the value is null, the width of the native select is used.
	 */
	private Integer width;

	/**
	 * Which element to append the menu to. When the value is null, the parents of the select are checked for a class name of ui-front. If
	 * an element with the ui-front class name is found, the menu is
	 * appended to that element.<p>
	 * Regardless of the value, if no element is found, the menu is appended to the body.
	 *
	 * @return
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * Which element to append the menu to. When the value is null, the parents of the select are checked for a class name of ui-front. If
	 * an element with the ui-front class name is found, the menu is
	 * appended to that element.<p>
	 * Regardless of the value, if no element is found, the menu is appended to the body.
	 *
	 * @param appendTo
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(ComponentHierarchyBase appendTo)
	{
		this.appendTo = appendTo.getID(true);
		return (J) this;
	}

	/**
	 * Disables the selectmenu if set to true.
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Disables the selectmenu if set to true.
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
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return
	 */
	public JQUISelectMenuIconsOptions<?> getIcons()
	{
		return icons;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param icons
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcons(JQUISelectMenuIconsOptions<?> icons)
	{
		this.icons = icons;
		return (J) this;
	}

	/**
	 * Identifies the position of the menu in relation to the associated button element. You can refer to the jQuery UI Position utility
	 * for more details about the various options.
	 *
	 * @return
	 */
	public PositionOptions<?> getPositionOptions()
	{
		return positionOptions;
	}

	/**
	 * Identifies the position of the menu in relation to the associated button element. You can refer to the jQuery UI Position utility
	 * for more details about the various options.
	 *
	 * @param positionOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPositionOptions(PositionOptions<?> positionOptions)
	{
		this.positionOptions = positionOptions;
		return (J) this;
	}

	/**
	 * The width of the menu, in pixels. When the value is null, the width of the native select is used.
	 *
	 * @return
	 */
	public int getWidth()
	{
		return width;
	}

	/**
	 * The width of the menu, in pixels. When the value is null, the width of the native select is used.
	 *
	 * @param width
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWidth(int width)
	{
		this.width = width;
		return (J) this;
	}
}
