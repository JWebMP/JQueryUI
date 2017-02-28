/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.deactivate.DeactivateAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.JQUIDroppableEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class DeActivateEvent extends DeactivateAdapter
        implements JQUIDroppableEvents
{

    private static final long serialVersionUID = 1L;

    public DeActivateEvent(Component component)
    {
        super(component);
    }
}
