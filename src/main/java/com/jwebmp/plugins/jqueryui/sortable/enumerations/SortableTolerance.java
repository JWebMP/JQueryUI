package com.jwebmp.plugins.jqueryui.sortable.enumerations;

/**
 * The Sortable Tolerances that are allowed
 * <p>
 *
 * @author GedMarc
 * @since 2015/04/24
 */
public enum SortableTolerance
{

	/**
	 * The item overlaps the other item by at least 50%.
	 */
	Intersect,
	/**
	 * The mouse pointer overlaps the other item.
	 */
	Pointer;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}
}
