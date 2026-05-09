package com.jwebmp.plugins.jqueryui.position.enumerations;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

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
