package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.open.OpenAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class OpenEvent<J extends OpenEvent<J>>
		extends OpenAdapter<J>
		implements JQUIAutoCompleteEvents<J>, JQUIDraggableEvents<J>, JQUIDialogEvents<J>, JQUISelectMenuEvents<J>
{


	public OpenEvent(Component component)
	{
		super(component);
	}
}
