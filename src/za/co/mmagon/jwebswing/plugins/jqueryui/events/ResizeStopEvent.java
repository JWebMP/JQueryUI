/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.resize.ResizeAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.JQUIDialogEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class ResizeStopEvent extends ResizeAdapter
        implements JQUIDialogEvents
{

    private static final long serialVersionUID = 1L;

    public ResizeStopEvent(Component component)
    {
        super(component);
    }
}
