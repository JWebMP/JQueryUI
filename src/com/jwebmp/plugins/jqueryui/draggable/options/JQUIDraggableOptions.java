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
package com.jwebmp.plugins.jqueryui.draggable.options;

import com.jwebmp.Component;
import com.jwebmp.htmlbuilder.css.displays.Cursors;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.draggable.enumerations.Axis;
import com.jwebmp.plugins.jqueryui.draggable.enumerations.JQUIDraggableRevertOptions;
import com.jwebmp.plugins.jqueryui.draggable.enumerations.JQUIDraggableSnapModes;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Provides all the options available to the Draggable Feature Implementation
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since 2014/09/09
 */
public class JQUIDraggableOptions<J extends JQUIDraggableOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * If set to false, will prevent the ui-draggable class from being added. This may be desired as a performance optimization when
	 * calling .draggable() on hundreds of elements.
	 */
	private Boolean addClasses = true;
	/**
	 * Which element the draggable helper should be appended to while dragging.
	 */
	private String appendTo;
	/**
	 * Constrains dragging to either the horizontal (x) or vertical (y) axis. Possible values: "x", "y".
	 */
	private Axis axis;
	/**
	 * Prevents dragging from starting on specified elements. Default: "input,textarea,button,select,option"
	 */
	private List<String> cancelObjects;
	/**
	 * Allows the draggable to be dropped onto the specified sortables. If this option is used, a draggable can be dropped onto a sortable
	 * list and then becomes part of it. Note: The helper option
	 * must be set to "clone" in order to work flawlessly.
	 */
	private String connectToSortableType;
	/**
	 * Constrains dragging to within the bounds of the specified element or region.
	 */
	private String containment;
	/**
	 * The CSS cursor during the drag operation.
	 */
	private String cursor;
	/**
	 * Placement of the cursor in relation to the attached object.
	 */
	private CursorAt cursorAt;
	/**
	 * Time in milliseconds after mousedown until dragging should start. This option can be used to prevent unwanted drags when clicking
	 * on an element.
	 */
	private Integer delay;
	/**
	 * Disables the draggable if set to true.
	 */
	private Boolean disabled;
	/**
	 * Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted
	 * drags when clicking on an element.
	 */
	private Integer distance;
	/**
	 * Snaps the dragging helper to a grid, every x and y pixels. The array must be of the form [ x, y ].
	 */
	private Integer[] grid;
	/**
	 * If specified, restricts dragging from starting unless the mousedown occurs on the specified element(s). Only elements that descend
	 * from the draggable element are permitted.
	 */
	private String handle;
	/**
	 * Allows for a helper element to be used for dragging display.
	 * <p>
	 * The element will be cloned and the clone will be dragged.
	 */
	private Boolean helper;
	/**
	 * Specify a component to use as a helper component. Warning : This component will be made invisible.
	 */
	private String helperComponent;

	/**
	 * Prevent iframes from capturing the mousemove events during a drag. Useful in combination with the cursorAt option, or in any case
	 * where the mouse cursor may not be over the helper.
	 */
	private Boolean iFrameFix;
	/**
	 * Opacity for the helper while being dragged.
	 */
	private Double opacity;
	/**
	 * If set to true, all droppable positions are calculated on every mousemove. Caution: This solves issues on highly dynamic pages, but
	 * dramatically decreases performance.
	 */
	private Boolean refreshPositions;
	/**
	 * Whether the element should revert to its start position when dragging stops.
	 * <p>
	 * Boolean: If set to true the element will always revert.
	 */
	private Boolean revert;
	/**
	 * If set to "invalid", revert will only occur if the draggable has not been dropped on a droppable. For "valid", it's the other way
	 * around.
	 */
	private JQUIDraggableRevertOptions revertOption;
	/**
	 * The duration of the revert animation, in milliseconds. Ignored if the revert option is false.
	 */
	private Integer revertDuration;
	/**
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope
	 * value as a droppable will be accepted by the droppable.
	 */
	private String scope;
	/**
	 * If set to true, container auto-scrolls while dragging.
	 */
	private Boolean scroll;
	/**
	 * Distance in pixels from the edge of the viewport after which the viewport should scroll. Distance is relative to pointer, not the
	 * draggable. Ignored if the scroll option is false.
	 */
	private Integer scrollSensitivity;
	/**
	 * The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance. Ignored if the
	 * scroll option is false.
	 */
	private Integer scrollSpeed;
	/**
	 * Whether the element should snap to other elements.
	 */
	private Boolean snap;
	/**
	 * A selector specifying which elements to snap to.
	 */
	private String snapComponent;
	/**
	 * Determines which edges of snap elements the draggable will snap to. Ignored if the snap option is false. Possible values: "inner",
	 * "outer", "both".
	 */
	private JQUIDraggableSnapModes snapMode;
	/**
	 * The distance in pixels from the snap element edges at which snapping should occur. Ignored if the snap option is false.
	 */
	private Integer snapTolerance;
	/**
	 * Controls the z-index of the set of elements that match the selector, always brings the currently dragged item to the front. Very
	 * useful in things like window managers.
	 */
	private Component stack;
	/**
	 * Z-index for the helper while being dragged.
	 */
	private Integer zIndex;

	/**
	 * Returns if Add Classes setting
	 *
	 * @return
	 */
	public Boolean isAddClasses()
	{
		return addClasses;
	}

	/**
	 * If set to false, will prevent the ui-draggable class from being added. This may be desired as a performance optimization when
	 * calling .draggable() on hundreds of elements.
	 *
	 * @param addClasses
	 * 		True or false denoting add classes or not
	 */
	@SuppressWarnings("unchecked")
	public J setAddClasses(Boolean addClasses)
	{
		this.addClasses = addClasses;
		return (J) this;
	}

	/**
	 * Which element the draggable helper should be appended to while dragging.
	 *
	 * @return The component that the draggable helper should be appended to while dragging.
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * Which element the draggable helper should be appended to while dragging.
	 *
	 * @param appendTo
	 * 		Which element the draggable helper should be appended to while dragging.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAppendTo(Component appendTo)
	{
		this.appendTo = appendTo.getID(true);
		return (J) this;
	}


	/**
	 * Constrains dragging to either the horizontal (x) or vertical (y) axis. Possible values: "x", "y".
	 *
	 * @return The axis set or Null
	 */
	public Axis getAxis()
	{
		return axis;
	}

	/**
	 * Constrains dragging to either the horizontal (x) or vertical (y) axis. Possible values: "x", "y" or Null;
	 *
	 * @param axis
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAxis(Axis axis)
	{
		this.axis = axis;
		return (J) this;
	}

	/**
	 * Prevents dragging from starting on specified elements.
	 *
	 * @return The component array that is set as prevent dragging
	 */
	@NotNull
	public List<String> getCancelObjects()
	{
		if (cancelObjects == null)
		{
			cancelObjects = new ArrayList<>();
		}
		return cancelObjects;
	}

	/**
	 * Prevents dragging from starting on specified elements.
	 *
	 * @param cancelObjects
	 * 		An ArrayList of objects to exclude from the Draggable element
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCancelObjects(List<String> cancelObjects)
	{

		this.cancelObjects = cancelObjects;
		return (J) this;
	}

	/**
	 * Allows the draggable to be dropped onto the specified sortables. If this option is used, a draggable can be dropped onto a sortable
	 * list and then becomes part of it. Note: The helper option
	 * must be set to "clone" in order to work flawlessly. Requires the jQuery UI Sortable plugin to be included.
	 *
	 * @return The component linked to
	 */
	public String getConnectToSortableType()
	{
		return connectToSortableType;
	}

	/**
	 * Allows the draggable to be dropped onto the specified sortables. If this option is used, a draggable can be dropped onto a sortable
	 * list and then becomes part of it. Note: The helper option
	 * must be set to "clone" in order to work flawlessly. Requires the jQuery UI Sortable plugin to be included.
	 *
	 * @param connectToSortableType
	 * 		The component to add
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setConnectToSortableType(Component connectToSortableType)
	{
		this.connectToSortableType = connectToSortableType.getID(true);
		return (J) this;
	}

	/**
	 * Constrains dragging to within the bounds of the specified element or region.
	 *
	 * @return The component that dragging is contained to
	 */
	public String getContainment()
	{
		return containment;
	}

	/**
	 * Constrains dragging to within the bounds of the specified element or region.
	 *
	 * @param containment
	 * 		The component to contain to
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setContainment(Component containment)
	{
		this.containment = containment.getID(true);
		return (J) this;
	}

	/**
	 * The current cursor set or NULL if unset
	 *
	 * @return
	 */
	public String getCursor()
	{
		return cursor;
	}

	/**
	 * Sets the cursor during drag operation or NULL to remove setting
	 *
	 * @param cursor
	 * 		The cursor to set to
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCursor(Cursors cursor)
	{
		this.cursor = cursor.toString();
		return (J) this;
	}

	/**
	 * Position of the block in relation to the cursor
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public CursorAt getCursorAt()
	{
		if (cursorAt == null)
		{
			cursorAt = new CursorAt();
		}
		return cursorAt;
	}

	/**
	 * Position of the block in relation to the cursor
	 *
	 * @param cursorAt
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCursorAt(CursorAt cursorAt)
	{
		this.cursorAt = cursorAt;
		return (J) this;
	}

	/**
	 * Time in milliseconds after mousedown until dragging should start. This option can be used to prevent unwanted drags when clicking
	 * on an element.
	 *
	 * @return the time in MS
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * Time in milliseconds after mousedown until dragging should start. This option can be used to prevent unwanted drags when clicking
	 * on an element.
	 *
	 * @param delay
	 * 		The delay in milliseconds to set
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDelay(Integer delay)
	{
		this.delay = delay;
		return (J) this;
	}

	/**
	 * Returns if this draggable feature is disabled or not
	 *
	 * @return The disabled flag
	 */
	public Boolean isDisabled()
	{
		return disabled;
	}

	/**
	 * Sets the disabled value of the draggable feature
	 *
	 * @param disabled
	 * 		True sets this disabled. Should update on an AJAX call.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted
	 * drags when clicking on an element.
	 *
	 * @return The distance, 0 if unset
	 */
	public Integer getDistance()
	{
		return distance;
	}

	/**
	 * Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted
	 * drags when clicking on an element.
	 *
	 * @param distance
	 * 		The distance to set
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * Get the grid values set or null
	 *
	 * @return An Integer[] of x and y or null
	 */
	public Integer[] getGrid()
	{
		return grid;
	}

	/**
	 * Snaps the dragging helper to a grid, every x and y pixels. The array must be of the form [ x, y ].
	 *
	 * @param x
	 * 		The X Axis
	 * @param y
	 * 		The Y Axis
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setGrid(Integer x, Integer y)
	{
		grid = new Integer[]{x, y};
		return (J) this;
	}

	/**
	 * If specified, restricts dragging from starting unless the mousedown occurs on the specified element(s). Only elements that descend
	 * from the draggable element are permitted.
	 *
	 * @return The component that the handle is set on
	 */
	public String getHandle()
	{
		return handle;
	}

	/**
	 * If specified, restricts dragging from starting unless the mousedown occurs on the specified element(s). Only elements that descend
	 * from the draggable element are permitted.
	 *
	 * @param handle
	 * 		The component to set the handle on
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHandle(Component handle)
	{
		this.handle = handle.getID(true);
		return (J) this;
	}

	/**
	 * Allows for a helper element to be used for dragging display.
	 * <p>
	 * The element will be cloned and the clone will be dragged.
	 *
	 * @return If the element must be cloned
	 */
	public Boolean isHelper()
	{
		return helper;
	}

	/**
	 * Allows for a helper element to be used for dragging display.
	 * <p>
	 * The element will be cloned and the clone will be dragged.
	 *
	 * @param helper
	 * 		Set to clone the element or not
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHelper(Boolean helper)
	{
		this.helper = helper;
		return (J) this;
	}

	/**
	 * Specify a component to use as a helper component. Warning : This component will be made invisible.
	 *
	 * @return
	 */
	public String getHelperComponent()
	{
		return helperComponent;
	}

	/**
	 * Specify a component to use as a helper component. Warning : This component will be made invisible.
	 *
	 * @param helperComponent
	 * 		The component to set it to
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHelperComponent(Component helperComponent)
	{
		this.helperComponent = helperComponent.getID(true);
		return (J) this;
	}

	/**
	 * Prevent iframes from capturing the mousemove events during a drag. Useful in combination with the cursorAt option, or in any case
	 * where the mouse cursor may not be over the helper.
	 *
	 * @return If iFrames will be covered
	 */
	public Boolean isiFrameFix()
	{
		return iFrameFix;
	}

	/**
	 * Prevent iframes from capturing the mousemove events during a drag. Useful in combination with the cursorAt option, or in any case
	 * where the mouse cursor may not be over the helper.
	 *
	 * @param iFrameFix
	 * 		Set if IFrames will be covered
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setiFrameFix(Boolean iFrameFix)
	{
		this.iFrameFix = iFrameFix;
		return (J) this;
	}

	/**
	 * Opacity for the helper while being dragged.
	 *
	 * @return The opacity of the helper - 0.0 is default
	 */
	public Double getOpacity()
	{
		return opacity;
	}

	/**
	 * Opacity for the helper while being dragged.
	 *
	 * @param opacity
	 * 		Sets the opacity to a maximum of 1.0 = 0.0 removes all opacity
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * If set to true, all droppable positions are calculated on every mousemove. Caution: This solves issues on highly dynamic pages, but
	 * dramatically decreases performance.
	 *
	 * @return The refresh position setting
	 */
	public Boolean isRefreshPositions()
	{
		return refreshPositions;
	}

	/**
	 * If set to true, all droppable positions are calculated on every mousemove. Caution: This solves issues on highly dynamic pages, but
	 * dramatically decreases performance.
	 *
	 * @param refreshPositions
	 * 		Sets the refresh position value
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRefreshPositions(Boolean refreshPositions)
	{
		this.refreshPositions = refreshPositions;
		return (J) this;
	}

	/**
	 * @return Whether the element should revert to its start position when dragging stops.
	 */
	public Boolean isRevert()
	{
		return revert;
	}

	/**
	 * Whether the element should revert to its start position when dragging stops.
	 *
	 * @param revert
	 * 		Whether the element should revert to its start position when dragging stops.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRevert(Boolean revert)
	{
		this.revert = revert;
		return (J) this;
	}

	/**
	 * @return If set to "invalid", revert will only occur if the draggable has not been dropped on a droppable. For "valid", it's the
	 * 		other way around.
	 */
	public JQUIDraggableRevertOptions getRevertOption()
	{
		return revertOption;
	}

	/**
	 * @param revertOption
	 * 		If set to "invalid", revert will only occur if the draggable has not been dropped on a droppable. For "valid", it's the other
	 * 		way around.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRevertOption(JQUIDraggableRevertOptions revertOption)
	{
		this.revertOption = revertOption;
		return (J) this;
	}

	/**
	 * @return The duration of the revert animation, in milliseconds. Ignored if the revert option is false.
	 */
	public Integer getRevertDuration()
	{
		return revertDuration;
	}

	/**
	 * @param revertDuration
	 * 		The duration of the revert animation, in milliseconds. Ignored if the revert option is false.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRevertDuration(Integer revertDuration)
	{
		this.revertDuration = revertDuration;
		return (J) this;
	}

	/**
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope
	 * value as a droppable will be accepted by the droppable.
	 *
	 * @return The scope set for this Draggable feature
	 */
	public final String getScope()
	{
		return scope;
	}

	/**
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope
	 * value as a droppable will be accepted by the droppable.
	 *
	 * @param scope
	 * 		The scope to set for this draggable
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public final J setScope(String scope)
	{
		this.scope = scope;
		return (J) this;
	}

	/**
	 * @return If set to true, container auto-scrolls while dragging.
	 */
	public Boolean isScroll()
	{
		return scroll;
	}

	/**
	 * @param scroll
	 * 		If set to true, container auto-scrolls while dragging.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setScroll(Boolean scroll)
	{
		this.scroll = scroll;
		return (J) this;
	}

	/**
	 * @return Distance in pixels from the edge of the viewport after which the viewport should scroll. Distance is relative to pointer,
	 * 		not the draggable. Ignored if the scroll option is false.
	 */
	public Integer getScrollSensitivity()
	{
		return scrollSensitivity;
	}

	/**
	 * @param scrollSensitivity
	 * 		Distance in pixels from the edge of the viewport after which the viewport should scroll. Distance is relative to pointer, not
	 * 		the draggable. Ignored if the scroll
	 * 		option is false.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setScrollSensitivity(Integer scrollSensitivity)
	{
		this.scrollSensitivity = scrollSensitivity;
		return (J) this;
	}

	/**
	 * @return The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance. Ignored if
	 * 		the scroll option is false.
	 */
	public Integer getScrollSpeed()
	{
		return scrollSpeed;
	}

	/**
	 * @param scrollSpeed
	 * 		The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance. Ignored if the
	 * 		scroll option is false.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setScrollSpeed(Integer scrollSpeed)
	{
		this.scrollSpeed = scrollSpeed;
		return (J) this;
	}

	/**
	 * @return Whether the element should snap to other elements.
	 */
	public Boolean isSnap()
	{
		return snap;
	}

	/**
	 * @param snap
	 * 		Whether the element should snap to other elements.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSnap(Boolean snap)
	{
		this.snap = snap;
		return (J) this;
	}

	/**
	 * @return A selector specifying which elements to snap to.
	 */
	public String getSnapComponent()
	{
		return snapComponent;
	}

	/**
	 * @param snapComponent
	 * 		A selector specifying which elements to snap to.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSnapComponent(Component snapComponent)
	{
		this.snapComponent = snapComponent.getID(true);
		return (J) this;
	}

	/**
	 * @return Determines which edges of snap elements the draggable will snap to. Ignored if the snap option is false. Possible values:
	 * 		"inner", "outer", "both".
	 */
	public JQUIDraggableSnapModes getSnapMode()
	{
		return snapMode;
	}

	/**
	 * @param snapMode
	 * 		Determines which edges of snap elements the draggable will snap to. Ignored if the snap option is false. Possible values:
	 * 		"inner", "outer", "both".
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSnapMode(JQUIDraggableSnapModes snapMode)
	{
		this.snapMode = snapMode;
		return (J) this;
	}

	/**
	 * @return The distance in pixels from the snap element edges at which snapping should occur. Ignored if the snap option is false.
	 */
	public Integer getSnapToleranceType()
	{
		return snapTolerance;
	}

	/**
	 * @param snapToleranceType
	 * 		The distance in pixels from the snap element edges at which snapping should occur. Ignored if the snap option is false.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSnapToleranceType(Integer snapToleranceType)
	{
		snapTolerance = snapToleranceType;
		return (J) this;
	}

	/**
	 * @return The distance in pixels from the snap element edges at which snapping should occur. Ignored if the snap option is false.
	 */
	public Integer getSnapTolerance()
	{
		return snapTolerance;
	}

	/**
	 * @param snapTolerance
	 * 		The distance in pixels from the snap element edges at which snapping should occur. Ignored if the snap option is false.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSnapTolerance(Integer snapTolerance)
	{
		this.snapTolerance = snapTolerance;
		return (J) this;
	}

	/**
	 * @return Controls the z-index of the set of elements that match the selector, always brings the currently dragged item to the front.
	 * 		Very useful in things like window managers.
	 */
	public Component getStack()
	{
		return stack;
	}

	/**
	 * @param stack
	 * 		Controls the z-index of the set of elements that match the selector, always brings the currently dragged item to the front.
	 * 		Very useful in things like window managers.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setStack(Component stack)
	{
		this.stack = stack;
		return (J) this;
	}

	/**
	 * @return Z-index for the helper while being dragged.
	 */
	public Integer getzIndex()
	{
		return zIndex;
	}

	/**
	 * @param zIndex
	 * 		Z-index for the helper while being dragged.
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setzIndex(Integer zIndex)
	{
		this.zIndex = zIndex;
		return (J) this;
	}

	public static class CursorAt
			extends JavaScriptPart<CursorAt>
	{
		private static final long serialVersionUID = 1L;
		private Integer top;
		private Integer left;
		private Integer right;
		private Integer bottom;

		public CursorAt()
		{
		}

		public CursorAt(Integer top, Integer left)
		{
			this.top = top;
			this.left = left;
		}

		public CursorAt(Integer top)
		{
			this.top = top;
		}

		public CursorAt(Integer top, Integer left, Integer right, Integer bottom)
		{
			this.top = top;
			this.left = left;
			this.right = right;
			this.bottom = bottom;
		}

		public Integer getTop()
		{
			return top;
		}

		public CursorAt setTop(Integer top)
		{
			this.top = top;
			return this;
		}

		public Integer getLeft()
		{
			return left;
		}

		public CursorAt setLeft(Integer left)
		{
			this.left = left;
			return this;
		}

		public Integer getRight()
		{
			return right;
		}

		public CursorAt setRight(Integer right)
		{
			this.right = right;
			return this;
		}

		public Integer getBottom()
		{
			return bottom;
		}

		public CursorAt setBottom(Integer bottom)
		{
			this.bottom = bottom;
			return this;
		}
	}
}
