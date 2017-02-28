/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.slide.SlideAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.resizable.JQUIResizableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.JQUISliderEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class SlideEvent extends SlideAdapter
        implements JQUIDraggableEvents, JQUIResizableEvents, JQUISliderEvents
{

    private static final long serialVersionUID = 1L;

    public SlideEvent(Component component)
    {
        super(component);
    }
}
