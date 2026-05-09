package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.base.html.H3;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionChildren;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
public class JQUIAccordionHeader<J extends JQUIAccordionHeader<J>>
		extends H3<J>
		implements JQUIAccordionChildren
{


	/**
	 * An accordion header
	 */
	public JQUIAccordionHeader()
	{

	}

	/**
	 * Constructs with a text
	 *
	 * @param text
	 */
	public JQUIAccordionHeader(String text)
	{
		super(text);
	}

}
