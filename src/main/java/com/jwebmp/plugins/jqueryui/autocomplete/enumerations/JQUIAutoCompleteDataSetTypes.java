package com.jwebmp.plugins.jqueryui.autocomplete.enumerations;

/**
 * @author GedMarc
 * @version 1.0
 * @since 06 Aug 2015
 */
public enum JQUIAutoCompleteDataSetTypes
{

	/**
	 * Displays a straight forward menu for selection
	 */
	SingleSelections,
	/**
	 * Displays a categorized menu item for selection
	 */
	CategorySelections;

	JQUIAutoCompleteDataSetTypes()
	{

	}

	/**
	 * Returns the name of the enumeration in lower case
	 * <p>
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
