/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.tabs;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * The JQuery UI Tabs Implementation
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITabsFeature extends Feature<JQUITabOptions, JQUITabsFeature> implements JQUITabsFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The actual tab
	 */
	private final JQUITabs tab;
	/**
	 * The options for this tab
	 */
	private JQUITabOptions options;

	/**
	 * The JW Tabs feature
	 * <p>
	 *
	 * @param tab
	 */
	public JQUITabsFeature(JQUITabs tab)
	{
		super("JWTabs");
		this.tab = tab;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Tabs.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Tabs.getCssReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(tab.getJQueryID() + "tabs(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

	/**
	 * Returns the options fields for the tab
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUITabOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUITabOptions();
		}
		return options;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUITabsFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUITabsFeature that = (JQUITabsFeature) o;

		if (!tab.equals(that.tab))
		{
			return false;
		}
		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
