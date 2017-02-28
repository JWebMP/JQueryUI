/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.select.SelectAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.JQUIAutoCompleteEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.menu.JQUIMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu.JQUISelectMenuEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class SelectEvent extends SelectAdapter
        implements JQUIAutoCompleteEvents, JQUIMenuEvents, JQUISelectMenuEvents
{

    private static final long serialVersionUID = 1L;

    public SelectEvent(Component component)
    {
        super(component);
    }
}
