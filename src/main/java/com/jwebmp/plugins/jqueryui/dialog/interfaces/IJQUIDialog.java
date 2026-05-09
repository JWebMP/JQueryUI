package com.jwebmp.plugins.jqueryui.dialog.interfaces;

import com.jwebmp.plugins.jqueryui.dialog.options.JQUIDialogOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@FunctionalInterface
public interface IJQUIDialog
{

	/**
	 * Instantiates the options on call
	 * <p>
	 *
	 * @return
	 */
	JQUIDialogOptions getOptions();

}
