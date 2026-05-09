package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.core.base.html.OptionGroup;
import com.jwebmp.core.base.html.interfaces.children.SelectChildren;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISelectMenuGroup<J extends JQUISelectMenuGroup<J>>
		extends OptionGroup<J>
		implements JQUISelectMenuChildren
{
	/**
	 * A option group
	 */
	public JQUISelectMenuGroup()
	{
		this("Group");
	}

	/**
	 * Constructs a new select menu group
	 *
	 * @param label
	 */
	public JQUISelectMenuGroup(String label)
	{
		super(label);
	}

}
