package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.slide.SlideAdapter;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SlideEvent<J extends  SlideEvent<J>>
		extends SlideAdapter<J>
		implements JQUIDraggableEvents<J>, JQUIResizableEvents<J>, JQUISliderEvents<J>
{


	public SlideEvent(Component component)
	{
		super(component);
	}
}
