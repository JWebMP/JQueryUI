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
import za.co.mmagon.jwebswing.events.activate.ActivateAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ActivateEvent extends ActivateAdapter
		implements JQUIAccordionEvents, JQUIDroppableEvents, JQUITabsEvents
{

	private static final long serialVersionUID = 1L;

	public ActivateEvent(Component component)
	{
		super(component);
	}

	/**
	 * This object is never equal to another as an event
	 * @param obj
	 * @return
	 */
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}

	/**
	 * A hash code
	 * @return
	 */
	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getDirective().hashCode();
		return result;
	}
}
