package com.jwebmp.plugins.jqueryui.droppable.interfaces;

import com.jwebmp.plugins.jqueryui.droppable.options.JQUIDroppableOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@FunctionalInterface
public interface IJQUIDroppable
{

	/**
	 * Returns the Droppable Options
	 * <p>
	 *
	 * @return
	 */
	JQUIDroppableOptions getOptions();

}
