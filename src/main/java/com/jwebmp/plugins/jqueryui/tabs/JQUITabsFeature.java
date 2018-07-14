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
package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsFeatures;
import com.jwebmp.plugins.jqueryui.tabs.options.JQUITabOptions;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * The JQuery UI Tabs Implementation
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITabsFeature<J extends JQUITabsFeature<J>>
		extends Feature<JQUITabOptions, J>
		implements JQUITabsFeatures
{

	private static final long serialVersionUID = 1L;
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
