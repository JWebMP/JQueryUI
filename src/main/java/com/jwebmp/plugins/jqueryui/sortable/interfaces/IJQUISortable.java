package com.jwebmp.plugins.jqueryui.sortable.interfaces;

import com.jwebmp.plugins.jqueryui.sortable.options.JQUISortableOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUISortable
{

	/**
	 * Returns the sortable options
	 *
	 * @return
	 */
	JQUISortableOptions getOptions();

}
