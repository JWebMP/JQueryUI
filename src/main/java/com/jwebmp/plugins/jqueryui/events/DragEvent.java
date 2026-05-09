package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.drag.DragAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class DragEvent<J extends DragEvent<J>>
		extends DragAdapter<J>
		implements JQUIDraggableEvents<J>, JQUIDialogEvents<J>
{


	public DragEvent(Component component)
	{
		super(component);
	}
}
