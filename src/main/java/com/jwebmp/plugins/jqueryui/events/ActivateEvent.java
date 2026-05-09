package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.activate.ActivateAdapter;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ActivateEvent<J extends ActivateEvent<J>>
		extends ActivateAdapter<J>
		implements JQUIAccordionEvents<J>, JQUIDroppableEvents<J>, JQUITabsEvents<J>
{
	public ActivateEvent(Component component)
	{
		super(component);
	}

}
