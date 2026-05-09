package com.jwebmp.plugins.jqueryui.draggable.enumerations;

/**
 * @author MMagon
 * 		<p>
 * 		<p>
 */
public enum JQUIDraggableSnapModes
{

	/**
	 * Snap on the inside of a component
	 */
	Inner,
	/**
	 * Snap on the outside of a component
	 */
	Outer,
	/**
	 * Snaps on the inside and outside of a component
	 */
	Both;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
