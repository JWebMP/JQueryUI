package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuChildren;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;

/**
 * @author GedMarc
 * @version 1.0
 * @since 30 Oct 2015
 */
public class JQUIMenuGroup<J extends JQUIMenuGroup<J>>
		extends List<JQUIMenuChildren, NoAttributes, JQUIMenuEvents, J>
		implements JQUIMenuChildren
{
	public JQUIMenuGroup()
	{
		addClass(JQUIThemeBlocks.UI_Widget_Header.toString());
	}

}
