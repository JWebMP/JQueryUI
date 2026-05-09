package com.jwebmp.plugins.jqueryui.sortable;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.JQUISortableChildren;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISortableItem<J extends JQUISortableItem<J>>
		extends ListItem<J>
		implements JQUISortableChildren
{
	/**
	 * Constructs a new sortable item with any children available
	 */
	public JQUISortableItem()
	{
		//Quiock start
	}

	/**
	 * Constructs a new sortable item with any children available and the given raw text
	 *
	 * @param text
	 */
	public JQUISortableItem(String text)
	{
		super(text);
	}

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addClass(JQUIThemeBlocks.UI_State_Default.toString());
		}
		else
		{
			removeClass(JQUIThemeBlocks.UI_State_Default.toString());
		}
		return (J) this;
	}
}
