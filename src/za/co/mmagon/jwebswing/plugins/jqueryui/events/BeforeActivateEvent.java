/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.beforeactivate.BeforeActivateAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.accordion.JQUIAccordionEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.tabs.JQUITabsEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class BeforeActivateEvent extends BeforeActivateAdapter
        implements JQUIAccordionEvents, JQUITabsEvents
{

    private static final long serialVersionUID = 1L;

    public BeforeActivateEvent(Component component)
    {
        super(component);
    }
}
