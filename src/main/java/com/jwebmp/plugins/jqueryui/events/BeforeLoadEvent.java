package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.beforeload.BeforeLoadAdapter;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class BeforeLoadEvent<J extends BeforeLoadEvent<J>>
		extends BeforeLoadAdapter<J>
		implements JQUIDialogEvents<J>, JQUITabsEvents<J>
{


	public BeforeLoadEvent(Component component)
	{
		super(component);
	}
}
