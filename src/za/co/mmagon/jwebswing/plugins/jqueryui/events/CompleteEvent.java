/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.complete.CompleteAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.progressbar.JQUIProgressBarEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class CompleteEvent extends CompleteAdapter
        implements JQUIProgressBarEvents
{

    private static final long serialVersionUID = 1L;

    public CompleteEvent(Component component)
    {
        super(component);
    }
}
