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
package com.jwebmp.plugins.jqueryui.tooltips.options;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.easingeffects.JQEasingAnimationEffectsPart;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;
import jakarta.validation.constraints.NotNull;

/**
 * All the options for the tooltip library
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 4, 2015
 */
public class JQUITooltipOptions<J extends JQUITooltipOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The position of the tooltip
	 */
	private PositionOptions<?> position;
	/**
	 * The content for the tooltip
	 */
	private String content;
	/**
	 * If the tooltip is disabled or not
	 */
	private Boolean disabled;
	/**
	 * The animation to apply on hide
	 */
	private JQEasingAnimationEffectsPart<?> hide;
	/**
	 * The component type that makes up a tooltip. E.G. img[alt] or *[title]
	 */
	private String items;
	/**
	 * The animation to apply on show
	 */
	private JQEasingAnimationEffectsPart<?> show;
	/**
	 * A class to add to the widget, can be used to display various tooltip types, like warnings or errors.
	 * <p>
	 * This may get replaced by the classes option.
	 */
	private String tooltipClass;
	/**
	 * Whether the tooltip should track (follow) the mouse.
	 */
	private Boolean track;

	/**
	 * Constructs a new tooltip options
	 */
	public JQUITooltipOptions()
	{
		//nothing needed here
	}

	/**
	 * The position of the tooltip
	 * <p>
	 *
	 * @return
	 */
	public PositionOptions<?> getPosition()
	{
		if (position == null)
		{
			position = new PositionOptions<>();
		}
		return position;
	}

	/**
	 * The position of the tooltip
	 * <p>
	 *
	 * @param position
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPosition(PositionOptions<?> position)
	{
		this.position = position;
		return (J) this;
	}

	/**
	 * The content for the tooltip
	 * <p>
	 *
	 * @return
	 */
	public String getContent()
	{
		return content;
	}

	/**
	 * The content for the tooltip
	 * <p>
	 *
	 * @param content
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContent(IComponentHierarchyBase<?,?> content)
	{
		content.setTiny(true);
		this.content = content.toString(true);
		return (J) this;
	}

	/**
	 * If the tooltip is disabled or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * *
	 * If the tooltip is disabled or not
	 * <p>
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
	 * The animation to apply on hide
	 * <p>
	 *
	 * @return
	 */
	public JQEasingAnimationEffectsPart<?> getHide()
	{
		if (hide == null)
		{
			hide = new JQEasingAnimationEffectsPart<>();
		}
		return hide;
	}

	/**
	 * The animation to apply on hide
	 * <p>
	 *
	 * @param hide
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHide(JQEasingAnimationEffectsPart<?> hide)
	{
		this.hide = hide;
		return (J) this;
	}

	/**
	 * The component type that makes up a tooltip. E.G. img[alt] or *[title]
	 * <p>
	 *
	 * @return
	 */
	public String getItems()
	{
		return items;
	}

	/**
	 * The component type that makes up a tooltip. E.G. img[alt] or *[title]
	 * <p>
	 *
	 * @param items
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setItems(String items)
	{
		this.items = items;
		return (J) this;
	}

	/**
	 * The animation to apply on show
	 * <p>
	 *
	 * @return
	 */
	public JQEasingAnimationEffectsPart<?> getShow()
	{
		if (show == null)
		{
			show = new JQEasingAnimationEffectsPart<>();
		}
		return show;
	}

	/**
	 * The animation to apply on show
	 * <p>
	 *
	 * @param show
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShow(JQEasingAnimationEffectsPart<?> show)
	{
		this.show = show;
		return (J) this;
	}

	/**
	 * A class to add to the widget, can be used to display various tooltip types, like warnings or errors.
	 * <p>
	 * This may get replaced by the classes option.
	 * <p>
	 *
	 * @return
	 */
	public String getTooltipClass()
	{
		return tooltipClass;
	}

	/**
	 * A class to add to the widget, can be used to display various tooltip types, like warnings or errors.
	 * <p>
	 * This may get replaced by the classes option.
	 * <p>
	 *
	 * @param tooltipClass
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTooltipClass(String tooltipClass)
	{
		this.tooltipClass = tooltipClass;
		return (J) this;
	}

	/**
	 * Whether the tooltip should track (follow) the mouse.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getTrack()
	{
		return track;
	}

	/**
	 * Whether the tooltip should track (follow) the mouse.
	 * <p>
	 *
	 * @param track
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTrack(Boolean track)
	{
		this.track = track;
		return (J) this;
	}
}
