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
public abstract class ChangeEvent<J extends ChangeEvent<J>>
		extends ChangeAdapter<J>
		implements JQUIAutoCompleteEvents<J>,
		           JQUIProgressBarEvents<J>,
		           JQUISelectMenuEvents<J>,
		           JQUISliderEvents<J>,
		           JQUISpinnerEvents<J>
{
	public ChangeEvent(Component component)
	{
		super(component);
	}
}
