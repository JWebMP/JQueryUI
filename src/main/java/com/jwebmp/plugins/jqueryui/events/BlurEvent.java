package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.blur.BlurAdapter;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class BlurEvent<J extends BlurEvent<J>>
		extends BlurAdapter<J>
		implements JQUIMenuEvents<J>
{


	public BlurEvent(Component component)
	{
		super(component);
	}
}
