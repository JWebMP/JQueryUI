/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.focus.FocusAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.JQUIAutoCompleteEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.JQUIDialogEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.menu.JQUIMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu.JQUISelectMenuEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class FocusEvent extends FocusAdapter
        implements JQUIAutoCompleteEvents, JQUIDraggableEvents, JQUIDialogEvents, JQUIMenuEvents, JQUISelectMenuEvents
{

    private static final long serialVersionUID = 1L;

    public FocusEvent(Component component)
    {
        super(component);
    }
}
