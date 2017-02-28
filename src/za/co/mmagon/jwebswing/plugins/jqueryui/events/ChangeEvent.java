/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.change.ChangeAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.JQUIAutoCompleteEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.progressbar.JQUIProgressBarEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu.JQUISelectMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.JQUISliderEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.JQUISpinnerEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class ChangeEvent extends ChangeAdapter
        implements JQUIAutoCompleteEvents, JQUIProgressBarEvents, JQUISelectMenuEvents, JQUISliderEvents, JQUISpinnerEvents
{

    private static final long serialVersionUID = 1L;

    public ChangeEvent(Component component)
    {
        super(component);
    }
}
