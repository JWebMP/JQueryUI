package com.jwebmp.plugins.jqueryui.accordion.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIAccordionIconOptions<J extends JQUIAccordionIconOptions<J>>
		extends JavaScriptPart<J>
{


	private String header;
	private String activeHeader;

	/**
	 * Constructs a blank Icon Options Class
	 */
	public JQUIAccordionIconOptions()
	{
	}

	/**
	 * Constructs a new Icon Options Class
	 *
	 * @param header
	 * 		The icon for closed
	 * @param activeHeader
	 * 		The icon for open
	 */
	public JQUIAccordionIconOptions(String header, String activeHeader)
	{
		this.header = header;
		this.activeHeader = activeHeader;
	}

	/**
	 * Returns the icon class for closed
	 * <p>
	 *
	 * @return
	 */
	public String getHeader()
	{
		return header;
	}

	/**
	 * Sets the icon class for closed
	 * <p>
	 *
	 * @param header
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeader(String header)
	{
		this.header = header;
		return (J) this;
	}

	/**
	 * Gets the open icon
	 * <p>
	 *
	 * @return
	 */
	public String getActiveHeader()
	{
		return activeHeader;
	}

	/**
	 * Sets the open icon
	 * <p>
	 *
	 * @param activeHeader
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveHeader(String activeHeader)
	{
		this.activeHeader = activeHeader;
		return (J) this;
	}
}
