package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionChildren;

/**
 * @author GedMarc
 * @since 26 Feb 2017
 */
public class JQUIAccordionContent<J extends JQUIAccordionContent<J>>
		extends DivSimple<J>
		implements JQUIAccordionChildren
{


	/**
	 * The container for the accordion
	 */
	public JQUIAccordionContent()
	{

	}

	/**
	 * A normal accordion with text
	 *
	 * @param text
	 */
	public JQUIAccordionContent(String text)
	{
		super(text);
	}

}
