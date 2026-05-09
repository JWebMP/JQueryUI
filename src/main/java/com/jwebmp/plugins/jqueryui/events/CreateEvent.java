package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.beforeactivate.BeforeActivateAdapter;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.button.interfaces.JQUIButtonEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarEvents;
import com.jwebmp.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderEvents;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class CreateEvent<J extends CreateEvent<J>>
		extends BeforeActivateAdapter<J>
		implements JQUIAccordionEvents<J>,
		           JQUIAutoCompleteEvents<J>,
		           JQUIButtonEvents<J>,
		           JQUIDraggableEvents<J>,
		           JQUIDialogEvents<J>,
		           JQUIDroppableEvents<J>,
		           JQUIMenuEvents<J>,
		           JQUIProgressBarEvents<J>,
		           JQUIResizableEvents<J>,
		           JQUISelectMenuEvents<J>,
		           JQUISliderEvents<J>,
		           JQUISpinnerEvents<J>,
		           JQUITabsEvents<J>
{


	public CreateEvent(Component component)
	{
		super(component);
	}
}
