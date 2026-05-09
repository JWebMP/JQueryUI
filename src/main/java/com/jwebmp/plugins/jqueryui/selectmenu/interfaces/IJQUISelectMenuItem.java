package com.jwebmp.plugins.jqueryui.selectmenu.interfaces;

import com.jwebmp.plugins.jqueryui.selectmenu.JQUISelectMenuItem;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public interface IJQUISelectMenuItem
{

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	JQUISelectMenuItem setDisabled(boolean disabled);

	/**
	 * Sets the label
	 *
	 * @param label
	 *
	 * @return
	 */
	JQUISelectMenuItem setLabel(String label);

	/**
	 * If the item is selected
	 *
	 * @param selected
	 *
	 * @return
	 */
	JQUISelectMenuItem setSelected(boolean selected);

}
