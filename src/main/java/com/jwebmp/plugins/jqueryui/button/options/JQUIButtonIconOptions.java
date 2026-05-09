package com.jwebmp.plugins.jqueryui.button.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * The button icon options, This has been deprecated from version 1-11
 *
 * @author GedMarc
 * @version 1.0
 * @since Mar 8, 2015
 * 		<p>
 */
public class JQUIButtonIconOptions<J extends JQUIButtonIconOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * Specifies the icon for primary
	 */
	private String primaryIcon;
	/**
	 * Specifies the icon for secondary
	 */
	private String secondaryIcon;

	/**
	 *
	 */
	public JQUIButtonIconOptions()
	{
		//Nothing Needed
	}

	/**
	 * Gets the primary icon
	 * <p>
	 *
	 * @return CSS Class Type
	 */
	public String getPrimaryIcon()
	{
		return primaryIcon;
	}

	/**
	 * Sets the primary icon
	 * <p>
	 *
	 * @param primaryIcon
	 * 		CSS Class Type
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPrimaryIcon(String primaryIcon)
	{
		this.primaryIcon = primaryIcon;
		return (J) this;
	}

	/**
	 * *
	 * Gets the secondary icon
	 * <p>
	 *
	 * @return
	 */
	public String getSecondaryIcon()
	{
		return secondaryIcon;
	}

	/**
	 * Sets the secondary icon CSS Class
	 * <p>
	 *
	 * @param secondaryIcon
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSecondaryIcon(String secondaryIcon)
	{
		this.secondaryIcon = secondaryIcon;
		return (J) this;
	}

}
