package com.jwebmp.plugins.jqueryui.draggable.enumerations;

/**
 * Valid Axis Settings
 * <p>
 *
 * @version 1.0
 * @author MMagon
 * 		<p>
 * 		<p>
 * @since 2014/04/13
 */

/**
 * Specifies Axis that the draggable feature can be put on
 */
public enum Axis
{

	/**
	 * The X Axis
	 */
	X,
	/**
	 * The Y Axis
	 */
	Y;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
