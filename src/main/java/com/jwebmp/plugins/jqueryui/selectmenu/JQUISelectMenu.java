package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.IJQUISelectMenu;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuFeatures;
import com.jwebmp.plugins.jqueryui.selectmenu.options.JQUISelectMenuOptions;

/**
 * The Select Menu from the JQuery UI
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 9, 2015
 */
@ComponentInformation(name = "JQuery UI Select Menu",
		description = "Enable a DOM element (or group of elements) to be selectable. Draw " +
		              "a" +
		              " box with your cursor to select items. Hold down the Ctrl key" +
		              " to make multiple " +
		              "non-adjacent " +
		              "selections" +
		              ".",
		url = "http://jqueryui.com/selectmenu/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUISelectMenu<J extends JQUISelectMenu<J>>
		extends Div<JQUISelectMenuChildren, NoAttributes, JQUISelectMenuFeatures, JQUISelectMenuEvents, J>
		implements IJQUISelectMenu
{
	/**
	 * The select menu feature
	 */
	private JQUISelectMenuFeature<?> feature;

	/**
	 * Constructs a new select menu
	 */
	public JQUISelectMenu()
	{
		super(ComponentTypes.Select);
		addFeature(getFeature());
	}

	/**
	 * Returns the select menu feature
	 * <p>
	 *
	 * @return
	 */
	public final JQUISelectMenuFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUISelectMenuFeature<>(this);
		}
		return feature;
	}

	/**
	 * Returns the options for the select menu
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISelectMenuOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * As Me
	 *
	 * @return
	 */
	public IJQUISelectMenu asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
