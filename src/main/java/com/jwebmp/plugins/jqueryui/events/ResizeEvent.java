package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.resize.ResizeAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ResizeEvent<J extends ResizeEvent<J>>
		extends ResizeAdapter<J>
		implements JQUIDialogEvents<J>, JQUIResizableEvents<J>
{
	public ResizeEvent(Component component)
	{
		super(component);
	}
}
