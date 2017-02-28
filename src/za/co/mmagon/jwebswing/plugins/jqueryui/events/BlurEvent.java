/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.blur.BlurAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.menu.JQUIMenuEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class BlurEvent extends BlurAdapter
        implements JQUIMenuEvents
{

    private static final long serialVersionUID = 1L;

    public BlurEvent(Component component)
    {
        super(component);
    }
}
