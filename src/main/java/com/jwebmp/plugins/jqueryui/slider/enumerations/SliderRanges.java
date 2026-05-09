package com.jwebmp.plugins.jqueryui.slider.enumerations;

/**
 * The available ranges for the Slider
 *
 * @author GedMarc
 */
public enum SliderRanges
{

	/**
	 * Enables 2 fields for entry
	 */
	True,
	/**
	 * Sets to 1 slider entry
	 */
	False,
	/**
	 * Locks the minimum
	 */
	Min,
	/**
	 * Locks the maximum
	 */
	Max;

	@Override
	public String toString()
	{
		return super.toString()
		            .toLowerCase();
	}

}
