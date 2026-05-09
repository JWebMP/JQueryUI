package com.jwebmp.plugins.jqueryui.draggable.enumerations;

/**
 * Keeps the revert settings for a draggable
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since 2014/04/14
 */
public enum JQUIDraggableRevertOptions
{

	/**
	 * If set to "invalid", revert will only occur if the draggable has not been dropped on a droppable.
	 */
	Invalid,
	/**
	 * If set to "valid", revert will only occur if the draggable has been dropped on a droppable.
	 * Why would anyone use this?
	 */
	Valid;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
