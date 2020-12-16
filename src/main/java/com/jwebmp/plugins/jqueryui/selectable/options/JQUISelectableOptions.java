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
package com.jwebmp.plugins.jqueryui.selectable.options;

import com.jwebmp.core.base.html.interfaces.CssClass;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 17, 2015
 */
public class JQUISelectableOptions<J extends JQUISelectableOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Prevents selecting if you start on elements matching the selector
	 */
	private List<CssClass> cancel;
	/**
	 * The matching child elements will be made selectees (able to be selected).
	 */
	private List<ComponentTypes> filter;
	/**
	 * Which element the selectable helper should be appended to while dragging.
	 */
	private String appendTo;
	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation.
	 * If you have many items, you may want to set this to false and
	 * call the refresh() method manually. Default is true
	 */
	private Boolean autoRefresh = true;
	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 */
	private Integer delay;
	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged
	 * beyond the specified distance.
	 */
	private Integer distance;

	/**
	 *
	 */
	public JQUISelectableOptions()
	{
		//Nothing Needed
	}

	/**
	 * Which element the selectable helper should be appended to while dragging.
	 *
	 * @return The component that the selectable helper should be appended to while dragging.
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * Sets the append to string
	 *
	 * @param appendTo
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(String appendTo)
	{
		this.appendTo = appendTo;
		return (J) this;
	}

	/**
	 * Which element the selectable helper should be appended to while dragging.
	 *
	 * @param appendTo
	 * 		Which element the selectable helper should be appended to while dragging.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(IComponentHierarchyBase<?,?> appendTo)
	{
		this.appendTo = appendTo.asBase().getID(true);
		return (J) this;
	}

	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation.
	 * If you have many items, you may want to set this to false and
	 * call the refresh() method manually. Default is true
	 *
	 * @return Is Auto Refresh
	 */
	public Boolean isAutoRefresh()
	{
		return autoRefresh;
	}

	/**
	 * Prevents selecting if you start on elements matching the selector
	 *
	 * @return The list of CssClasses that don't start on the selector
	 */
	@NotNull
	public List<CssClass> getCancel()
	{
		if (cancel == null)
		{
			cancel = new ArrayList<>();
		}
		return cancel;
	}

	/**
	 * Sets the cancel list
	 *
	 * @param cancel
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCancel(List<CssClass> cancel)
	{
		this.cancel = cancel;
		return (J) this;
	}

	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 *
	 * @return The Delay
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 *
	 * @param delay
	 * 		The delay to set
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDelay(Integer delay)
	{
		this.delay = delay;
		return (J) this;
	}

	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged
	 * beyond the specified distance.
	 *
	 * @return The distance in pixels
	 */
	public Integer getDistance()
	{
		return distance;
	}

	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged
	 * beyond the specified distance.
	 *
	 * @param distance
	 * 		Sets the distance in pixels
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * Returns the list of filters
	 *
	 * @return
	 */
	@NotNull
	public List<ComponentTypes> getFilter()
	{
		if (filter == null)
		{
			filter = new ArrayList<>();
		}
		return filter;
	}

	/**
	 * Sets the filter list
	 *
	 * @param filter
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFilter(List<ComponentTypes> filter)
	{
		this.filter = filter;
		return (J) this;
	}

	/**
	 * Return if auto refresh is enabled
	 *
	 * @return
	 */
	public Boolean getAutoRefresh()
	{
		return autoRefresh;
	}

	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation.
	 * If you have many items, you may want to set this to false and
	 * call the refresh() method manually.
	 *
	 * @param autoRefresh
	 * 		Whether to refresh on call
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoRefresh(Boolean autoRefresh)
	{
		this.autoRefresh = autoRefresh;
		return (J) this;
	}
}
