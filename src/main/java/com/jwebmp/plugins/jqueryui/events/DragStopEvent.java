package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.dragstop.DragStopAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DragStopEvent<J extends DragStopEvent<J>>
		extends DragStopAdapter<J>
		implements JQUIDialogEvents<J>
{
	public DragStopEvent(Component component)
	{
		super(component);
	}
}
