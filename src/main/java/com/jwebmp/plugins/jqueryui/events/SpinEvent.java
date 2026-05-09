package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.spin.SpinAdapter;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SpinEvent<J extends SpinEvent<J>>
		extends SpinAdapter<J>
		implements JQUISpinnerEvents<J>
{
	
	
	public SpinEvent(Component component)
	{
		super(component);
	}
}
