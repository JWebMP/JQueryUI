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
package com.jwebmp.plugins.jqueryui.tabs.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.easingeffects.JQEasingAnimationEffectsPart;
import com.jwebmp.plugins.jqueryui.accordion.enumerations.JQUIAccordionHeightStyle;

import jakarta.validation.constraints.NotNull;

/**
 * The options for the tab component
 * <p>
 *
 * @author GedMarc
 * @since 2014/04/27
 */
public class JQUITabOptions<J extends JQUITabOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The panel to show as active
	 */
	private Integer active;
	/**
	 * Whether or not the tab is collapsible
	 */
	private Boolean collapsible;
	/**
	 * The disabled value of the
	 */
	private Boolean disabled;
	/**
	 * The mouse event to activate on
	 */
	private EventTypes event;
	/**
	 * The height style
	 */
	private JQUIAccordionHeightStyle heightStyle;
	/**
	 * The animation effect for hide
	 */
	private JQEasingAnimationEffectsPart<?> hide;
	/**
	 * The animation effect for show
	 */
	private JQEasingAnimationEffectsPart<?> show;

	/**
	 * Construct a new instance of tab options
	 */
	public JQUITabOptions()
	{
		//Nothing needed
	}

	/**
	 * Which panel is currently open. Multiple types supported:
	 * <p>
	 * Boolean: Setting active to false will collapse all panels. This requires the collapsible option to be true. Integer: The zero-based
	 * index of the panel that is active (open). A negative value
	 * selects panels going backward from the last panel.
	 * <p>
	 *
	 * @return
	 */
	public Integer getActive()
	{
		return active;
	}

	/**
	 * Which panel is currently open. Multiple types supported:
	 * <p>
	 * Boolean: Setting active to false will collapse all panels. This requires the collapsible option to be true. Integer: The zero-based
	 * index of the panel that is active (open). A negative value
	 * selects panels going backward from the last panel.
	 * <p>
	 *
	 * @param active
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setActive(Integer active)
	{
		this.active = active;
		return (J) this;
	}

	/**
	 * When set to true, the active panel can be closed. Code examples:
	 * <p>
	 * Initialize the tabs with the collapsible option specified:
	 * <p>
	 *
	 * @return
	 */
	public Boolean getCollapsible()
	{
		return collapsible;
	}

	/**
	 * When set to true, the active panel can be closed. Code examples:
	 * <p>
	 * Initialize the tabs with the collapsible option specified:
	 * <p>
	 *
	 * @param collapsible
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCollapsible(Boolean collapsible)
	{
		this.collapsible = collapsible;
		return (J) this;
	}

	/**
	 * Which tabs are disabled. Multiple types supported:
	 * <p>
	 * Boolean: Enable or disable all tabs.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Which tabs are disabled. Multiple types supported:
	 * <p>
	 * Boolean: Enable or disable all tabs.
	 * <p>
	 *
	 * @param disabled
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * The type of event that the tabs should react to in order to activate the tab. To activate on hover, use "mouseover".
	 * <p>
	 *
	 * @return
	 */
	public EventTypes getEvent()
	{
		return event;
	}

	/**
	 * The type of event that the tabs should react to in order to activate the tab. To activate on hover, use "mouseover".
	 * <p>
	 *
	 * @param event
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setEvent(EventTypes event)
	{
		this.event = event;
		return (J) this;
	}

	/**
	 * Controls the height of the tabs widget and each panel. Possible values:
	 * <p>
	 * "auto": All panels will be set to the height of the tallest panel. "fill": Expand to the available height based on the tabs' parent
	 * height. "content": Each panel will be only as tall as its
	 * content.
	 * <p>
	 *
	 * @return
	 */
	public JQUIAccordionHeightStyle getHeightStyle()
	{
		return heightStyle;
	}

	/**
	 * Controls the height of the tabs widget and each panel. Possible values:
	 * <p>
	 * "auto": All panels will be set to the height of the tallest panel. "fill": Expand to the available height based on the tabs' parent
	 * height. "content": Each panel will be only as tall as its
	 * content.
	 * <p>
	 *
	 * @param heightStyle
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHeightStyle(JQUIAccordionHeightStyle heightStyle)
	{
		this.heightStyle = heightStyle;
		return (J) this;
	}

	/**
	 * If and how to animate the hiding of the panel.
	 * <p>
	 *
	 * @return
	 */
	public JQEasingAnimationEffectsPart<?> getHide()
	{
		return hide;
	}

	/**
	 * If and how to animate the hiding of the panel.
	 * <p>
	 *
	 * @param hide
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHide(JQEasingAnimationEffectsPart<?> hide)
	{
		this.hide = hide;
		return (J) this;
	}

	/**
	 * If and how to animate the showing of the panel.
	 * <p>
	 *
	 * @return
	 */
	public JQEasingAnimationEffectsPart<?> getShow()
	{
		return show;
	}

	/**
	 * If and how to animate the showing of the panel.
	 * <p>
	 *
	 * @param show
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShow(JQEasingAnimationEffectsPart<?> show)
	{
		this.show = show;
		return (J) this;
	}
}
