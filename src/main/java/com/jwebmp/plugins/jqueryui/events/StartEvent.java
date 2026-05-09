package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.start.StartAdapter;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderEvents;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class StartEvent<J extends StartEvent<J>>
		extends StartAdapter<J>
		implements JQUIDraggableEvents<J>, JQUIResizableEvents<J>, JQUISliderEvents<J>, JQUISpinnerEvents<J>
{
	
	
	public StartEvent(Component component)
	{
		super(component);
	}
}
