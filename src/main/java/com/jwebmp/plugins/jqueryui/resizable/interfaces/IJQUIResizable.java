package com.jwebmp.plugins.jqueryui.resizable.interfaces;

import com.jwebmp.plugins.jqueryui.resizable.options.JQUIResizableOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUIResizable
{

	/**
	 * Returns the features options
	 * <p>
	 *
	 * @return
	 */
	JQUIResizableOptions getOptions();

}
