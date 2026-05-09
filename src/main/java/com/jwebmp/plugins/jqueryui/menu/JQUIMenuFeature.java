package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.menu.options.JQUIMenuOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIMenuFeature<J extends JQUIMenuFeature<J>>
		extends Feature<GlobalFeatures, JQUIMenuOptions<?>, J>
{
	private final JQUIMenu<?> menu;
	/**
	 * The options of the menu
	 */
	private JQUIMenuOptions<?> options;

	/**
	 * @param menu
	 * 		The menu creating for
	 */
	public JQUIMenuFeature(JQUIMenu<?> menu)
	{
		super("JWMenuFeature");
		this.menu = menu;
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

	/**
	 * Gets the options of the menu
	 *
	 * @return
	 */
	@Override
	public JQUIMenuOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIMenuOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(menu.getJQueryID() + "menu(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
