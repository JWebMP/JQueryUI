package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.dragstart.DragStartAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DragStartEvent<J extends  DragStartEvent<J>>
		extends DragStartAdapter<J>
		implements JQUIDialogEvents<J>
{
	public DragStartEvent(Component component)
	{
		super(component);
	}
}
