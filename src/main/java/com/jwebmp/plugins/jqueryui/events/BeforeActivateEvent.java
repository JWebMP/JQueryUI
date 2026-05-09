package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.beforeactivate.BeforeActivateAdapter;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class BeforeActivateEvent<J extends BeforeActivateEvent<J>>
		extends BeforeActivateAdapter<J>
		implements JQUIAccordionEvents<J>, JQUITabsEvents<J>
{


	public BeforeActivateEvent(Component component)
	{
		super(component);
	}
}
