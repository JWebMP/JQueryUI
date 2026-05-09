package com.jwebmp.plugins.jqueryui.menu.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIMenuIconSet<J extends JQUIMenuIconSet<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Sets the sub menu string
	 */
	private String subMenu;

	/**
	 * Returns the class for the sub menu icon
	 * <p>
	 *
	 * @return
	 */
	public String getSubMenu()
	{
		return subMenu;
	}

	/**
	 * Sets the class name for the sub menu icon set
	 * <p>
	 *
	 * @param subMenu
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSubMenu(String subMenu)
	{
		this.subMenu = subMenu;
		return (J) this;
	}

}
