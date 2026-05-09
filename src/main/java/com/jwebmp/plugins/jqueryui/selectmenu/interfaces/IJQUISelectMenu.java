package com.jwebmp.plugins.jqueryui.selectmenu.interfaces;

import com.jwebmp.plugins.jqueryui.selectmenu.options.JQUISelectMenuOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUISelectMenu
{

	/**
	 * Returns the options for the select menu
	 * <p>
	 *
	 * @return
	 */
	JQUISelectMenuOptions getOptions();

}
