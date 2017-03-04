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
