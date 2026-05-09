package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.complete.CompleteAdapter;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class CompleteEvent<J extends CompleteEvent<J>>
		extends CompleteAdapter<J>
		implements JQUIProgressBarEvents<J>
{
	public CompleteEvent(Component component)
	{
		super(component);
	}
}
