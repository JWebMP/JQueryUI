/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.beforeload.BeforeLoadAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.JQUIDialogEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.tabs.JQUITabsEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class BeforeLoadEvent extends BeforeLoadAdapter
        implements JQUIDialogEvents, JQUITabsEvents
{

    private static final long serialVersionUID = 1L;

    public BeforeLoadEvent(Component component)
    {
        super(component);
    }
}
