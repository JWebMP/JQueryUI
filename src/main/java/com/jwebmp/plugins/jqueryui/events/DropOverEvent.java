package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.dropover.DropOverAdapter;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DropOverEvent<J extends DropOverEvent<J>>
		extends DropOverAdapter<J>
		implements JQUIDroppableEvents<J>
{
	public DropOverEvent(Component component)
	{
		super(component);
	}
}
