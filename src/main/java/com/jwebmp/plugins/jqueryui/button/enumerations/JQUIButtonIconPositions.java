package com.jwebmp.plugins.jqueryui.button.enumerations;

/**
 * iconPosition * Type: String Default: "beginning" Where to display the icon: Valid values are "beginning", "end", "top" and "bottom". In a left-to-right (LTR) display,
 * "beginning" refers to the
 * left, in a right-to-left (RTL, e.g. in Hebrew or Arabic), it refers to the right.
 *
 * @author GedMarc
 * @since 27 Feb 2017
 */
public enum JQUIButtonIconPositions
{
	Beginning,
	End,
	Top,
	Bottom;

	JQUIButtonIconPositions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}

}
