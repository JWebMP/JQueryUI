package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUITabContent<J extends JQUITabContent<J>>
		extends DivSimple<J>
		implements JQUITabsChildren
{
	/**
	 * Any tab content
	 */
	public JQUITabContent()
	{
		//Nothing Needed
	}
}
