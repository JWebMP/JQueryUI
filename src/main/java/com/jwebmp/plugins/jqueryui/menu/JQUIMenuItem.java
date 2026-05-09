package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.interfaces.children.ListItemChildren;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;

/**
 * @author GedMarc
 * @version 1.0
 * @since 30 Oct 2015
 */
public class JQUIMenuItem<J extends JQUIMenuItem<J>>
		extends ListItem<J>
		implements JQUIMenuChildren
{
	public JQUIMenuItem(String text)
	{
		super(text);
	}

	public JQUIMenuItem()
	{
	}

}
