/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.stop.StopAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.resizable.JQUIResizableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.JQUISliderEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.JQUISpinnerEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class StopEvent extends StopAdapter
        implements JQUIDraggableEvents, JQUIResizableEvents, JQUISliderEvents, JQUISpinnerEvents
{

    private static final long serialVersionUID = 1L;

    public StopEvent(Component component)
    {
        super(component);
    }
}
