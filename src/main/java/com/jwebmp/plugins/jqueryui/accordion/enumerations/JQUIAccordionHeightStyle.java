package com.jwebmp.plugins.jqueryui.accordion.enumerations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Default: "auto"
 * <p>
 * Controls the height of the accordion and each panel. Possible values:
 * <p>
 * <p>
 * "auto": All panels will be set to the height of the tallest panel.<p>
 * "fill": Expand to the available height based on the accordion's parent height.<p>
 * "content": Each panel will be only as tall as its content.<p>
 * <p>
 * <p>
 */
public enum JQUIAccordionHeightStyle
{

	/**
	 * All panels will be set to the height of the tallest panel.
	 */
	Auto,
	/**
	 * Expand to the available height based on the accordion's parent height.
	 */
	Fill,
	/**
	 * Each panel will be only as tall as its content.
	 */
	Content;

	/**
	 * Returns the height style in lowercase
	 *
	 * @return
	 */
	@JsonValue
	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
