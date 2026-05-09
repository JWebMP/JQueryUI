package com.jwebmp.plugins.jqueryui.tabs.interfaces;

import com.jwebmp.plugins.jqueryui.tabs.JQUITab;
import com.jwebmp.plugins.jqueryui.tabs.JQUITabContent;
import com.jwebmp.plugins.jqueryui.tabs.options.JQUITabOptions;

import java.util.List;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public interface IJQUITabs<J>
{

	/**
	 * Adds a tab to the collection
	 * <p>
	 *
	 * @param tab
	 *
	 * @return
	 */
	JQUITab<?> addTab(JQUITab<?> tab);

	JQUITab<?> addTab(String title, JQUITabContent<?> displayComponent);

	/**
	 * Returns the options fields for the tab
	 * <p>
	 *
	 * @return
	 */
	JQUITabOptions<?> getOptions();

	/**
	 * Returns a list of tabs
	 *
	 * @return
	 */
	List<JQUITab<?>> getTabs();

	/**
	 * Sets the list of tabs
	 *
	 * @param tabs
	 */
	J setTabs(List<JQUITab<?>> tabs);

}
