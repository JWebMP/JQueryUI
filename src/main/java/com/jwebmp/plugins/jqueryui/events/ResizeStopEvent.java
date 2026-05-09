package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.resize.ResizeAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ResizeStopEvent<J extends ResizeStopEvent<J>>
		extends ResizeAdapter<J>
		implements JQUIDialogEvents<J>
{
	public ResizeStopEvent(Component component)
	{
		super(component);
	}
}
