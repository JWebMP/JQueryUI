package com.jwebmp.plugins.jqueryui.selectmenu.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public class JQUISelectMenuIconsOptions<J extends JQUISelectMenuIconsOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private String button;

	public JQUISelectMenuIconsOptions()
	{
		//No config required
	}

	/**
	 * Sets the button
	 *
	 * @param button
	 */
	public JQUISelectMenuIconsOptions(String button)
	{
		this.button = button;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return
	 */
	public String getButton()
	{
		return button;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param button
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setButton(String button)
	{
		this.button = button;
		return (J) this;
	}
}
