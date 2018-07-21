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
package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.change.ChangeAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.progressbar.interfaces.JQUIProgressBarEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;
import com.jwebmp.plugins.jqueryui.slider.interfaces.JQUISliderEvents;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ChangeEvent
		extends ChangeAdapter
		implements JQUIAutoCompleteEvents, JQUIProgressBarEvents, JQUISelectMenuEvents, JQUISliderEvents, JQUISpinnerEvents
{

	private static final long serialVersionUID = 1L;

	public ChangeEvent(Component component)
	{
		super(component);
	}
}
