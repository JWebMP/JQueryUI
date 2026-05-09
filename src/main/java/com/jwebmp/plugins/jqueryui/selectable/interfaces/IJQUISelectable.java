package com.jwebmp.plugins.jqueryui.selectable.interfaces;

import com.jwebmp.plugins.jqueryui.selectable.options.JQUISelectableOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUISelectable
{

	/**
	 * Returns the features options
	 * <p>
	 *
	 * @return
	 */
	JQUISelectableOptions getOptions();

}
