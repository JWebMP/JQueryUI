package com.jwebmp.plugins.jqueryui.menu.interfaces;

import com.jwebmp.plugins.jqueryui.menu.options.JQUIMenuOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUIMenu
{

	/**
	 * Gets the options of the menu
	 *
	 * @return
	 */
	JQUIMenuOptions getOptions();

}
