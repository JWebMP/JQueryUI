package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.search.SearchAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SearchEvent<J extends SearchEvent<J>>
		extends SearchAdapter<J>
		implements JQUIAutoCompleteEvents<J>
{
	public SearchEvent(Component component)
	{
		super(component);
	}
}
