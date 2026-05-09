package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.load.LoadAdapter;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class LoadEvent<J extends LoadEvent<J>>
		extends LoadAdapter<J>
		implements JQUITabsEvents<J>
{
	public LoadEvent(Component component)
	{
		super(component);
	}
}
