package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.deactivate.DeactivateAdapter;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DeActivateEvent<J extends DeActivateEvent<J>>
		extends DeactivateAdapter<J>
		implements JQUIDroppableEvents<J>
{


	public DeActivateEvent(Component component)
	{
		super(component);
	}
}
