package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.drop.DropAdapter;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DropEvent<J extends DropEvent<J>>
		extends DropAdapter<J>
		implements JQUIDroppableEvents<J>
{
	public DropEvent(Component component)
	{
		super(component);
	}
}
