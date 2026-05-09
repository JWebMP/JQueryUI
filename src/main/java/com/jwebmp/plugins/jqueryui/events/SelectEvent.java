package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.select.SelectAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SelectEvent<J extends SelectEvent<J>>
		extends SelectAdapter<J>
		implements JQUIAutoCompleteEvents<J>, JQUIMenuEvents<J>, JQUISelectMenuEvents<J>
{
	
	
	public SelectEvent(Component component)
	{
		super(component);
	}
}
