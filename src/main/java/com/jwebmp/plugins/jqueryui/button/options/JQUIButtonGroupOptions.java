package com.jwebmp.plugins.jqueryui.button.options;

import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 27 Apr 2015
 */
public class JQUIButtonGroupOptions<J extends JQUIButtonGroupOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The component type.
	 */
	private String items;

	/**
	 * The button group options for
	 */
	public JQUIButtonGroupOptions()
	{
		//Nothing Needed
	}

	@NotNull
	public String getItems()
	{
		if (items != null)
		{
			return items;
		}
		else
		{
			return "";
		}
	}

	/**
	 * Set the items the button group will apply for
	 * <p>
	 *
	 * @param items
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setItems(ComponentTypes items)
	{
		this.items = items.getComponentTag();
		return (J) this;
	}
}
