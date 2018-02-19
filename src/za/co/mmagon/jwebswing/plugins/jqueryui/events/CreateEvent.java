/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.beforeactivate.BeforeActivateAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.button.interfaces.JQUIButtonEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.resizable.interfaces.JQUIResizableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.slider.interfaces.JQUISliderEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.tabs.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
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
