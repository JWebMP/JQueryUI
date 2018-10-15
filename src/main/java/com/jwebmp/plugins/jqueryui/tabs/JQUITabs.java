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

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.IJQUITabs;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsChildren;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsFeatures;
import com.jwebmp.plugins.jqueryui.tabs.options.JQUITabOptions;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;

/**
 * This class implements the JQuery UI implementation of a normal button
 *
 * @author MMagon
 * @version 1.0
 * @since 09 Mar 2013
 */
@ComponentInformation(name = "JQuery UI Tabs",
		description = "Tabs are generally used to break content into multiple sections that can " + "be" + " swapped to save space, much like an accordion",
		url = "http://jqueryui.com/tabs/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUITabs<J extends JQUITabs<J>>
		extends Div<JQUITabsChildren, NoAttributes, JQUITabsFeatures, JQUITabsEvents, J>
		implements IJQUITabs<J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * the feature list
	 */
	private JQUITabsFeature<?> feature;

	/**
	 * The Unordered List
	 */
	private JQUITabList<?> unorderedList;

	/**
	 * A list of all the tabs
	 */
	private java.util.List<JQUITab> tabs;

	/**
	 * Constructs a new JQUI Tab/** Constructs a new JQUI Tab
	 */
	/**
	 * Constructs a new JQUI JQUITab/** Constructs a new JQUI JQUITab
	 */
	public JQUITabs()
	{
		super();
		addFeature(getFeature());
	}

	/**
	 * Returns the feature for the JQUITabs object
	 * <p>
	 *
	 * @return
	 */
	@NotNull
	public final JQUITabsFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUITabsFeature<>(this);
		}
		return feature;
	}

	/**
	 * As Me
	 *
	 * @return
	 */
	public IJQUITabs asMe()
	{
		return this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			add(getUnorderedList());
			getTabs().forEach(next ->
			                  {
				                  getUnorderedList().add(next.getTabHeader());
				                  add(next.getTabDisplayComponent());
			                  });
		}
		super.init();
	}

	/**
	 * Retrieves this unordered list
	 *
	 * @return
	 */
	@NotNull
	protected JQUITabList getUnorderedList()
	{
		if (unorderedList == null)
		{
			unorderedList = new JQUITabList();
		}
		return unorderedList;
	}

	/**
	 * Sets the unordered list
	 *
	 * @param unorderedList
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	protected J setUnorderedList(JQUITabList unorderedList)
	{
		this.unorderedList = unorderedList;
		return (J) this;
	}

	/**
	 * Returns the options fields for the tab
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUITabOptions getOptions()
	{
		return feature.getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Adds a tab to the collection
	 * <p>
	 *
	 * @param tab
	 *
	 * @return
	 */
	@Override
	public JQUITab addTab(JQUITab tab)
	{
		getTabs().add(tab);
		return tab;
	}

	@Override
	public JQUITab addTab(String title, JQUITabContent displayComponent)
	{
		return addTab(new JQUITab(new ListItem(title), displayComponent));
	}

	/**
	 * Returns a list of tabs
	 *
	 * @return
	 */
	@Override
	@NotNull
	public java.util.List<JQUITab> getTabs()
	{
		if (tabs == null)
		{
			tabs = new ArrayList<>();
		}
		return tabs;
	}

	/**
	 * Sets the list of tabs
	 *
	 * @param tabs
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabs(java.util.List<JQUITab> tabs)
	{
		this.tabs = tabs;
		return (J) this;
	}

}
