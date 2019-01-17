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
package com.jwebmp.plugins.jqueryui.position.enumerations;

import com.jwebmp.core.utilities.StaticStrings;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * Positions for the location horizontal
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 07 Apr 2013
 */
public enum PositionLocationHorizontal
{

	/**
	 * Position to the Left
	 */
	Left,
	/**
	 * Position to the Center
	 */
	Center,
	/**
	 * Position to the Right
	 */
	Right,
	/**
	 * Places at Left bottom
	 */
	Left_Bottom,
	;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase()
		            .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_SPACE);
	}

}
