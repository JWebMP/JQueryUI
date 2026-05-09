package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.dropout.DropOutAdapter;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DropOutEvent<J extends DropOutEvent<J>>
		extends DropOutAdapter<J>
		implements JQUIDroppableEvents<J>
{
	public DropOutEvent(Component component)
	{
		super(component);
	}
}
