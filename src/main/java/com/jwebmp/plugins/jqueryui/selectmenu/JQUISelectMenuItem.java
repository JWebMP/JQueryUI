package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.core.base.html.Option;
import com.jwebmp.core.base.html.attributes.InputAttributes;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.utilities.GUIDGenerator;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.IJQUISelectMenuItem;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISelectMenuItem<J extends JQUISelectMenuItem<J>>
		extends Option<J>
		implements JQUISelectMenuChildren, IJQUISelectMenuItem
{


	private static final String selectedString = "selected";

	/**
	 * Construct a new select menu item
	 */
	public JQUISelectMenuItem()
	{
		this(GUIDGenerator.generateGuid());
	}

	/**
	 * Constructs with a given value
	 *
	 * @param value
	 */
	public JQUISelectMenuItem(String value)
	{
		super(value);
	}

	/**
	 * A much neater view
	 *
	 * @return
	 */
	public IJQUISelectMenuItem asMe()
	{
		return this;
	}

	/**
	 * Sets the label
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(String label)
	{
		super.setLabel(label);
		return (J) this;
	}

	/**
	 * Sets the item as disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addAttribute(InputAttributes.Disabled.toString(), null);
		}
		return (J) this;
	}

	/**
	 * If the item is selected
	 *
	 * @param selected
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSelected(boolean selected)
	{
		if (selected)
		{
			addAttribute(JQUISelectMenuItem.selectedString, JQUISelectMenuItem.selectedString);
		}
		else
		{
			getAttributes().remove(JQUISelectMenuItem.selectedString);
		}

		return (J) this;
	}

}
