package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.response.ResponseAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class ResponseEvent<J extends ResponseEvent<J>>
		extends ResponseAdapter<J>
		implements JQUIAutoCompleteEvents<J>
{
	public ResponseEvent(Component component)
	{
		super(component);
	}
}
