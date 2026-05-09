package com.jwebmp.plugins.jqueryui.autocomplete;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteChildren;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUIAutoCompleteLabel<J extends JQUIAutoCompleteLabel<J>>
		extends Label<J>
		implements JQUIAutoCompleteChildren
{


	/**
	 * A new label
	 */
	public JQUIAutoCompleteLabel()
	{

	}

	/**
	 * A new label
	 *
	 * @param label
	 */
	public JQUIAutoCompleteLabel(String label)
	{
		super(label);
	}

	/**
	 * A new label
	 *
	 * @param label
	 * @param forInputComponent
	 */
	public JQUIAutoCompleteLabel(String label, Input forInputComponent)
	{
		super(label, forInputComponent);
	}

}
