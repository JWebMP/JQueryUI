package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUITabList<J extends JQUITabList<J>>
		extends List<ListChildren, NoAttributes, GlobalEvents,J>
		implements JQUITabsChildren
{
	/**
	 * A list for the tabs display
	 */
	public JQUITabList()
	{
		//Nothing needed
	}

}
