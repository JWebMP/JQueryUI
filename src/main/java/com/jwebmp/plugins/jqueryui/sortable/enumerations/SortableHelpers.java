package com.jwebmp.plugins.jqueryui.sortable.enumerations;

/**
 * The available helper options
 * <p>
 *
 * @author GedMarc
 * @since 2015/04/24
 */
public enum SortableHelpers
{
	/**
	 * Produces a clone
	 */
	Clone,
	/**
	 * Produces the original
	 */
	Orginal;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
