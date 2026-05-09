package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;

/**
 * @author GedMarc
 * @version 1.0
 * @since 30 Oct 2015
 */
public class JQUIMenuItemDivider<J extends JQUIMenuItemDivider<J>>
		extends ListItem<J>
		implements JQUIMenuChildren
{
	/**
	 * Creates a menu item divider
	 */
	public JQUIMenuItemDivider()
	{
		super(StaticStrings.STRING_DASH);
	}

}
