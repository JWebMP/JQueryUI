package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.beforeclose.BeforeCloseAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class BeforeCloseEvent<J extends BeforeCloseEvent<J>>
		extends BeforeCloseAdapter<J>
		implements JQUIDialogEvents<J>
{


	public BeforeCloseEvent(Component component)
	{
		super(component);
	}
}
