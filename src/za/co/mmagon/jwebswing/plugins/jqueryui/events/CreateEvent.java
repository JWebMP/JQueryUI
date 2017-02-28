/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.beforeactivate.BeforeActivateAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.accordion.JQUIAccordionEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.JQUIAutoCompleteEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.button.JQUIButtonEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.JQUIDialogEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.JQUIDroppableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.menu.JQUIMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.progressbar.JQUIProgressBarEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.resizable.JQUIResizableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu.JQUISelectMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.JQUISliderEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.JQUISpinnerEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.tabs.JQUITabsEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class CreateEvent extends BeforeActivateAdapter
        implements JQUIAccordionEvents, JQUIAutoCompleteEvents, JQUIButtonEvents, JQUIDraggableEvents, JQUIDialogEvents, JQUIDroppableEvents, JQUIMenuEvents, JQUIProgressBarEvents, JQUIResizableEvents, JQUISelectMenuEvents, JQUISliderEvents, JQUISpinnerEvents, JQUITabsEvents
{

    private static final long serialVersionUID = 1L;

    public CreateEvent(Component component)
    {
        super(component);
    }
}
