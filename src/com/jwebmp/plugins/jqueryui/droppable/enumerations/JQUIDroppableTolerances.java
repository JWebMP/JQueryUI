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
package com.jwebmp.plugins.jqueryui.droppable.enumerations;

/**
 * Specifies which mode to use for testing whether a draggable is hovering over a droppable. Possible values:
 * <p>
 * "fit": Draggable overlaps the droppable entirely. "intersect": Draggable overlaps the droppable at least 50% in both directions. "pointer": Mouse pointer overlaps the droppable. "touch": Draggable
 * overlaps the droppable any amount.
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/04/14
 */
public enum JQUIDroppableTolerances
{
	Fit,
	Intersect,
	Pointer,
	Touch;

	/**
	 * Returns the lower case value of the enumeration
	 *
	 * @return The lower case value of the enumeration
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
