package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.tabs.options.JQUITabOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * The JQuery UI Tabs Implementation
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITabsFeature<J extends JQUITabsFeature<J>>
		extends Feature<GlobalFeatures, JQUITabOptions<?>, J>
{
	/**
	 * The actual tab
	 */
	private final JQUITabs<?> tab;
	/**
	 * The options for this tab
	 */
	private JQUITabOptions<?> options;

	/**
	 * The JW Tabs feature
	 * <p>
	 *
	 * @param tab
	 */
	public JQUITabsFeature(JQUITabs<?> tab)
	{
		super("JWTabs");
		this.tab = tab;
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
	 * Returns the options fields for the tab
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUITabOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUITabOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(tab.getJQueryID() + "tabs(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
