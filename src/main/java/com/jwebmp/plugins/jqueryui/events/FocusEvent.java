package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.focus.FocusAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class FocusEvent<J extends FocusEvent<J>>
		extends FocusAdapter<J>
		implements JQUIAutoCompleteEvents<J>,
		           JQUIDraggableEvents<J>,
		           JQUIDialogEvents<J>,
		           JQUIMenuEvents<J>,
		           JQUISelectMenuEvents<J>
{
	public FocusEvent(Component component)
	{
		super(component);
	}
}
