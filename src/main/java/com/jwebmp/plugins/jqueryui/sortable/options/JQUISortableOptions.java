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
package com.jwebmp.plugins.jqueryui.sortable.options;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.draggable.enumerations.Axis;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;
import com.jwebmp.plugins.jqueryui.sortable.enumerations.SortableHelpers;

import javax.validation.constraints.NotNull;

/**
 * The jQuery UI Sortable plugin makes selected elements sortable by dragging with the mouse.
 * <p>
 * Note: In order to sort table rows, the tbody must be made sortable, not the table.
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 17, 2015
 */
public class JQUISortableOptions<J extends JQUISortableOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Defines where the helper that moves with the mouse is being appended to during the drag (for example, to resolve overlap/zIndex
	 * issues). Multiple types supported:
	 * <p>
	 * jQuery: A jQuery object containing the element to append the helper to. Element: The element to append the helper to. Selector: A
	 * selector specifying which element to append the helper to.
	 * String: The string "parent" will cause the helper to be a sibling of the sortable item
	 */
	private String appendTo;
	/**
	 * If defined, the items can be dragged only horizontally or vertically. Possible values: "x", "y".
	 */
	private Axis axis;
	/**
	 * Prevents sorting if you start on elements matching the selector.
	 */
	private ComponentTypes cancel;
	/**
	 * A selector of other sortable elements that the items from this list should be connected to. This is a one-way relationship, if you
	 * want the items to be connected in both directions, the
	 * connectWith option must be set on both sortable elements.
	 */
	private String connectWith;
	/**
	 * <p>
	 * Defines a bounding box that the sortable items are constrained to while dragging.
	 * <p>
	 * Note: The element specified for containment must have a calculated width and height (though it need not be explicit). For example,
	 * if you have float: left sortable children and specify
	 * containment: "parent" be sure to have float: left on the sortable/parent container as well or it will have height: 0, causing
	 * undefined behavior.
	 * <p>
	 */
	private String containment;
	/**
	 * Defines the cursor that is being shown while sorting.
	 */
	private Cursors cursor;
	/**
	 * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash
	 * using a combination of one or two keys: { top, left, right,
	 * bottom }.
	 */
	private PositionOptions cursorAt;
	/**
	 * Time in milliseconds to define when the sorting should start. Adding a delay helps preventing unwanted drags when clicking on an
	 * element.
	 */
	private Integer delay;
	/**
	 * Disables the sortable if set to true.
	 */
	private Boolean disabled;
	/**
	 * Tolerance, in pixels, for when sorting should start. If specified, sorting will not start until after mouse is dragged beyond
	 * distance. Can be used to allow for clicks on elements within a
	 * handle.
	 */
	private Integer distance;
	/**
	 * If false, items from this sortable can't be dropped on an empty connect sortable (see the connectWith option.
	 */
	private Boolean dropOnEmpty;
	/**
	 * If true, forces the helper to have a size. Code examples:
	 * <p>
	 * Initialize the sortable with the forceHelperSize option specified:
	 */
	private Boolean forceHelperSize;
	/**
	 * If true, forces the placeholder to have a size.
	 */
	private Integer forcePlaceholderSize;
	/**
	 * Snaps the sorting element or helper to a grid, every x and y pixels. Array values: [ x, y ].
	 */
	private Integer[] grid;
	/**
	 * Restricts sort start click to the specified element.
	 */
	private String handle;
	/**
	 * Default: "original" Allows for a helper element to be used for dragging display.
	 */
	private SortableHelpers helper;
	/**
	 * Specifies which items inside the element should be sortable.
	 */
	private ComponentTypes items;
	/**
	 * Defines the opacity of the helper while sorting. From 0.01 to 1.
	 */
	private Double opacity;
	/**
	 * A class name that gets applied to the otherwise white space.
	 */
	private String placeholder;
	/**
	 * Whether the sortable items should revert to their new positions using a smooth animation. Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the items will animate with the default duration. Number: The duration for the animation, in
	 * milliseconds.
	 * <p>
	 */
	private Boolean revert;
	/**
	 * If set to true, the page scrolls when coming to an edge.
	 */
	private Boolean scroll;
	/**
	 * Defines how near the mouse must be to an edge to start scrolling.
	 */
	private Integer scrollSensitivity;
	/**
	 * Default: 20 The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance.
	 */
	private Integer scrollSpeed;
	/**
	 * Specifies which mode to use for testing whether the item being moved is hovering over another item. Possible values:
	 * <p>
	 * "intersect": The item overlaps the other item by at least 50%. "pointer": The mouse pointer overlaps the other item.
	 * <p>
	 */
	private Integer tolerance;
	/**
	 * <p>
	 * Z-index for element/helper while being sorted. Default: 1000
	 */
	private Integer zIndex;

	/**
	 * Constructs a new instance of the JWSortable Options
	 */
	public JQUISortableOptions()
	{
		//Nothing needed here
	}

	/**
	 * Defines where the helper that moves with the mouse is being appended to during the drag (for example, to resolve overlap/zIndex
	 * issues). Multiple types supported:
	 * <p>
	 * jQuery: A jQuery object containing the element to append the helper to. Element: The element to append the helper to. Selector: A
	 * selector specifying which element to append the helper to.
	 * String: The string "parent" will cause the helper to be a sibling of the sortable item
	 * <p>
	 *
	 * @return
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * Defines where the helper that moves with the mouse is being appended to during the drag (for example, to resolve overlap/zIndex
	 * issues). Multiple types supported:
	 * <p>
	 * jQuery: A jQuery object containing the element to append the helper to. Element: The element to append the helper to. Selector: A
	 * selector specifying which element to append the helper to.
	 * String: The string "parent" will cause the helper to be a sibling of the sortable item
	 * <p>
	 *
	 * @param appendTo
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(Component appendTo)
	{
		this.appendTo = appendTo.getID(true);
		return (J) this;
	}

	/**
	 * If defined, the items can be dragged only horizontally or vertically. Possible values: "x", "y".
	 * <p>
	 *
	 * @return
	 */
	public Axis getAxis()
	{
		return axis;
	}

	/**
	 * If defined, the items can be dragged only horizontally or vertically. Possible values: "x", "y".
	 * <p>
	 *
	 * @param axis
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAxis(Axis axis)
	{
		this.axis = axis;
		return (J) this;
	}

	/**
	 * Prevents sorting if you start on elements matching the selector.
	 * <p>
	 *
	 * @return
	 */
	public ComponentTypes getCancel()
	{
		return cancel;
	}

	/**
	 * Prevents sorting if you start on elements matching the selector.
	 * <p>
	 *
	 * @param cancel
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCancel(ComponentTypes cancel)
	{
		this.cancel = cancel;
		return (J) this;
	}

	/**
	 * A selector of other sortable elements that the items from this list should be connected to. This is a one-way relationship, if you
	 * want the items to be connected in both directions, the
	 * connectWith option must be set on both sortable elements.
	 * <p>
	 *
	 * @return
	 */
	public String getConnectWith()
	{
		return connectWith;
	}

	/**
	 * A selector of other sortable elements that the items from this list should be connected to. This is a one-way relationship, if you
	 * want the items to be connected in both directions, the
	 * connectWith option must be set on both sortable elements.
	 * <p>
	 *
	 * @param connectWith
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setConnectWith(Component connectWith)
	{
		this.connectWith = connectWith.getID(true);
		return (J) this;
	}

	/**
	 * <p>
	 * Defines a bounding box that the sortable items are constrained to while dragging.
	 * <p>
	 * Note: The element specified for containment must have a calculated width and height (though it need not be explicit). For example,
	 * if you have float: left sortable children and specify
	 * containment: "parent" be sure to have float: left on the sortable/parent container as well or it will have height: 0, causing
	 * undefined behavior.
	 * <p>
	 *
	 * @return
	 */
	public String getContainment()
	{
		return containment;
	}

	/**
	 * <p>
	 * Defines a bounding box that the sortable items are constrained to while dragging.
	 * <p>
	 * Note: The element specified for containment must have a calculated width and height (though it need not be explicit). For example,
	 * if you have float: left sortable children and specify
	 * containment: "parent" be sure to have float: left on the sortable/parent container as well or it will have height: 0, causing
	 * undefined behavior.
	 * <p>
	 *
	 * @param containment
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setContainment(Component containment)
	{
		this.containment = containment.getID(true);
		return (J) this;
	}

	/**
	 * Defines the cursor that is being shown while sorting.
	 * <p>
	 *
	 * @return
	 */
	public Cursors getCursor()
	{
		return cursor;
	}

	/**
	 * Defines the cursor that is being shown while sorting.
	 * <p>
	 *
	 * @param cursor
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCursor(Cursors cursor)
	{
		this.cursor = cursor;
		return (J) this;
	}

	/**
	 * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash
	 * using a combination of one or two keys: { top, left, right,
	 * bottom }.
	 * <p>
	 *
	 * @return
	 */
	public PositionOptions getCursorAt()
	{
		return cursorAt;
	}

	/**
	 * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash
	 * using a combination of one or two keys: { top, left, right,
	 * bottom }. TODO Redo this implementation
	 * <p>
	 *
	 * @param cursorAt
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCursorAt(PositionOptions cursorAt)
	{
		this.cursorAt = cursorAt;
		return (J) this;
	}

	/**
	 * Time in milliseconds to define when the sorting should start. Adding a delay helps preventing unwanted drags when clicking on an
	 * element.
	 * <p>
	 *
	 * @return
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * Time in milliseconds to define when the sorting should start. Adding a delay helps preventing unwanted drags when clicking on an
	 * element.
	 * <p>
	 *
	 * @param delay
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDelay(Integer delay)
	{
		this.delay = delay;
		return (J) this;
	}

	/**
	 * Disables the sortable if set to true.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Disables the sortable if set to true.
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
	 * Tolerance, in pixels, for when sorting should start. If specified, sorting will not start until after mouse is dragged beyond
	 * distance. Can be used to allow for clicks on elements within a
	 * handle.
	 * <p>
	 *
	 * @return
	 */
	public Integer getDistance()
	{
		return distance;
	}

	/**
	 * Tolerance, in pixels, for when sorting should start. If specified, sorting will not start until after mouse is dragged beyond
	 * distance. Can be used to allow for clicks on elements within a
	 * handle.
	 * <p>
	 *
	 * @param distance
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * If false, items from this sortable can't be dropped on an empty connect sortable (see the connectWith option.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDropOnEmpty()
	{
		return dropOnEmpty;
	}

	/**
	 * If false, items from this sortable can't be dropped on an empty connect sortable (see the connectWith option.
	 * <p>
	 *
	 * @param dropOnEmpty
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDropOnEmpty(Boolean dropOnEmpty)
	{
		this.dropOnEmpty = dropOnEmpty;
		return (J) this;
	}

	/**
	 * If true, forces the helper to have a size. Code examples:
	 * <p>
	 * Initialize the sortable with the forceHelperSize option specified:
	 * <p>
	 *
	 * @return
	 */
	public Boolean getForceHelperSize()
	{
		return forceHelperSize;
	}

	/**
	 * If true, forces the helper to have a size. Code examples:
	 * <p>
	 * Initialize the sortable with the forceHelperSize option specified:
	 * <p>
	 *
	 * @param forceHelperSize
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setForceHelperSize(Boolean forceHelperSize)
	{
		this.forceHelperSize = forceHelperSize;
		return (J) this;
	}

	/**
	 * If true, forces the placeholder to have a size.
	 * <p>
	 *
	 * @return
	 */
	public Integer getForcePlaceholderSize()
	{
		return forcePlaceholderSize;
	}

	/**
	 * If true, forces the placeholder to have a size.
	 * <p>
	 *
	 * @param forcePlaceholderSize
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setForcePlaceholderSize(Integer forcePlaceholderSize)
	{
		this.forcePlaceholderSize = forcePlaceholderSize;
		return (J) this;
	}

	/**
	 * Snaps the sorting element or helper to a grid, every x and y pixels. Array values: [ x, y ].
	 * <p>
	 *
	 * @return
	 */
	public Integer[] getGrid()
	{
		return grid;
	}

	/**
	 * Snaps the sorting element or helper to a grid, every x and y pixels. Array values: [ x, y ].
	 * <p>
	 *
	 * @param grid
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGrid(Integer[] grid)
	{
		this.grid = grid;
		return (J) this;
	}

	/**
	 * Restricts sort start click to the specified element.
	 * <p>
	 *
	 * @return
	 */
	public String getHandle()
	{
		return handle;
	}

	/**
	 * Restricts sort start click to the specified element.
	 * <p>
	 *
	 * @param handle
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHandle(Component handle)
	{
		this.handle = handle.getID(true);
		return (J) this;
	}

	/**
	 * Default: "original" Allows for a helper element to be used for dragging display.
	 * <p>
	 *
	 * @return
	 */
	public SortableHelpers getHelper()
	{
		return helper;
	}

	/**
	 * Default: "original" Allows for a helper element to be used for dragging display.
	 * <p>
	 *
	 * @param helper
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHelper(SortableHelpers helper)
	{
		this.helper = helper;
		return (J) this;
	}

	/**
	 * Specifies which items inside the element should be sortable.
	 * <p>
	 *
	 * @return
	 */
	public ComponentTypes getItems()
	{
		return items;
	}

	/**
	 * Specifies which items inside the element should be sortable.
	 * <p>
	 *
	 * @param items
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setItems(ComponentTypes items)
	{
		this.items = items;
		return (J) this;
	}

	/**
	 * Defines the opacity of the helper while sorting. From 0.01 to 1.
	 * <p>
	 *
	 * @return
	 */
	public Double getOpacity()
	{
		return opacity;
	}

	/**
	 * Defines the opacity of the helper while sorting. From 0.01 to 1.
	 * <p>
	 *
	 * @param opacity
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * A class name that gets applied to the otherwise white space.
	 * <p>
	 *
	 * @return
	 */
	public String getPlaceholder()
	{
		return placeholder;
	}

	/**
	 * A class name that gets applied to the otherwise white space.
	 * <p>
	 *
	 * @param placeholder
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPlaceholder(String placeholder)
	{
		this.placeholder = placeholder;
		return (J) this;
	}

	/**
	 * Whether the sortable items should revert to their new positions using a smooth animation. Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the items will animate with the default duration. Number: The duration for the animation, in
	 * milliseconds.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getRevert()
	{
		return revert;
	}

	/**
	 * Whether the sortable items should revert to their new positions using a smooth animation. Multiple types supported:
	 * <p>
	 * Boolean: When set to true, the items will animate with the default duration. Number: The duration for the animation, in
	 * milliseconds.
	 * <p>
	 *
	 * @param revert
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRevert(Boolean revert)
	{
		this.revert = revert;
		return (J) this;
	}

	/**
	 * If set to true, the page scrolls when coming to an edge.
	 * <p>
	 *
	 * @return
	 */
	public Boolean getScroll()
	{
		return scroll;
	}

	/**
	 * If set to true, the page scrolls when coming to an edge.
	 * <p>
	 *
	 * @param scroll
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setScroll(Boolean scroll)
	{
		this.scroll = scroll;
		return (J) this;
	}

	/**
	 * Defines how near the mouse must be to an edge to start scrolling.
	 * <p>
	 *
	 * @return
	 */
	public Integer getScrollSensitivity()
	{
		return scrollSensitivity;
	}

	/**
	 * Defines how near the mouse must be to an edge to start scrolling.
	 * <p>
	 *
	 * @param scrollSensitivity
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setScrollSensitivity(Integer scrollSensitivity)
	{
		this.scrollSensitivity = scrollSensitivity;
		return (J) this;
	}

	/**
	 * Default: 20 The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance.
	 * <p>
	 *
	 * @return
	 */
	public Integer getScrollSpeed()
	{
		return scrollSpeed;
	}

	/**
	 * Default: 20 The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance.
	 * <p>
	 *
	 * @param scrollSpeed
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setScrollSpeed(Integer scrollSpeed)
	{
		this.scrollSpeed = scrollSpeed;
		return (J) this;
	}

	/**
	 * Specifies which mode to use for testing whether the item being moved is hovering over another item. Possible values:
	 * <p>
	 * "intersect": The item overlaps the other item by at least 50%. "pointer": The mouse pointer overlaps the other item.
	 * <p>
	 *
	 * @return
	 */
	public Integer getTolerance()
	{
		return tolerance;
	}

	/**
	 * Specifies which mode to use for testing whether the item being moved is hovering over another item. Possible values:
	 * <p>
	 * "intersect": The item overlaps the other item by at least 50%. "pointer": The mouse pointer overlaps the other item.
	 * <p>
	 *
	 * @param tolerance
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTolerance(Integer tolerance)
	{
		this.tolerance = tolerance;
		return (J) this;
	}

	/**
	 * <p>
	 * Z-index for element/helper while being sorted. Default: 1000
	 * <p>
	 *
	 * @return
	 */
	public Integer getzIndex()
	{
		return zIndex;
	}

	/**
	 * <p>
	 * Z-index for element/helper while being sorted. Default: 1000
	 * <p>
	 *
	 * @param zIndex
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setzIndex(Integer zIndex)
	{
		this.zIndex = zIndex;
		return (J) this;
	}
}
