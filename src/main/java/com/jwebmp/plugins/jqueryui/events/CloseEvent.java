package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.close.CloseAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class CloseEvent<J extends  CloseEvent<J>>
		extends CloseAdapter<J>
		implements JQUIAutoCompleteEvents<J>, JQUIDialogEvents<J>, JQUISelectMenuEvents<J>
{


	public CloseEvent(Component component)
	{
		super(component);
	}
}
