package com.jwebmp.plugins.jqueryui.progressbar.interfaces;

import com.jwebmp.plugins.jqueryui.progressbar.options.JQUIProgressBarOptions;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
@FunctionalInterface
public interface IJQUIProgressBar
{

	/**
	 * Returns the Progress bar options
	 * <p>
	 *
	 * @return
	 */
	JQUIProgressBarOptions getOptions();

}
