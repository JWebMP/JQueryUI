package com.jwebmp.plugins.jqueryui.spinner.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * Icons to use for buttons, matching an icon provided by the jQuery UI CSS Framework.
 * <p>
 * up (string, default: "ui-icon-triangle-1-n")
 * <p>
 * down (string, default: "ui-icon-triangle-1-s")
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public class SpinnerIconOptions<J extends SpinnerIconOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private String up;
	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 */
	private String down;

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return Returns the up icon class
	 */
	public String getUp()
	{
		return up;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param up
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setUp(String up)
	{
		this.up = up;
		return (J) this;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @return
	 */
	public String getDown()
	{
		return down;
	}

	/**
	 * Icons to use for the button, matching an icon defined by the jQuery UI CSS Framework.<p>
	 * <p>
	 * button (string, default: "ui-icon-triangle-1-s")
	 *
	 * @param down
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDown(String down)
	{
		this.down = down;
		return (J) this;
	}
}
