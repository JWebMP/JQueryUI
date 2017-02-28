/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.tabs;

import java.util.List;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 * 
 */
public interface IJQUITabs 
{

    /**
     * Adds a tab to the collection
     * <p>
     * @param tab
     *
     * @return
     */
    JQUITab addTab(JQUITab tab);

    JQUITab addTab(String title, JQUITabContent displayComponent);

    /**
     * Returns the options fields for the tab
     * <p>
     * @return
     */
    JQUITabOptions getOptions();

    /**
     * Returns a list of tabs
     *
     * @return
     */
    List<JQUITab> getTabs();

    /**
     * Sets the list of tabs
     *
     * @param tabs
     */
    void setTabs(List<JQUITab> tabs);

}
