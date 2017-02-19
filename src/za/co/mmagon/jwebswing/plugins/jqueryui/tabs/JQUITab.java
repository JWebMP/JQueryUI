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

import za.co.mmagon.jwebswing.base.html.*;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;

/**
 * This class implements the JQuery UI implementation of a normal button
 *
 * @author MMagon
 * @since 09 Mar 2013
 * @version 1.0
 */
public class JQUITab extends Div<JQUITabsChildren, NoAttributes, JQUITabsFeatures, JQUITabsEvents, JQUITab>
{

    private static final long serialVersionUID = 1L;
    /**
     * the feature list
     */
    private JQUITabsFeature feature;

    /**
     * The Unordered List
     */
    private List unorderedList;

    /**
     * Constructs a new JQUI Tab
     */
    public JQUITab()
    {
        super();
        addFeature(getFeature());
        add(getUnorderedList());
    }

    /**
     * Returns the feature for the JQUITab object
     * <p>
     * @return
     */
    public final JQUITabsFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUITabsFeature(this);
        }
        return feature;
    }

    /**
     * Adds a tab to the collection
     * <p>
     * @param tab
     *
     * @return
     */
    public Tab addTab(Tab tab)
    {
        getUnorderedList().add(tab.getTabHeader());
        add(JQUITabsChildren.class.cast(tab.getTabDisplayComponent()));
        return tab;
    }

    public Tab addTab(String title, JQUITabsChildren displayComponent)
    {
        return addTab(new Tab(new ListItem(title), (JQUITabsChildren) displayComponent));
    }

    /**
     * Retrieves this unordered list
     *
     * @return
     */
    public final List getUnorderedList()
    {
        if (unorderedList == null)
        {
            unorderedList = new List();
        }
        return unorderedList;
    }

    /**
     * Sets the unordered list
     *
     * @param unorderedList
     */
    public void setUnorderedList(List unorderedList)
    {
        this.unorderedList = unorderedList;
    }

    /**
     * Returns the options fields for the tab
     * <p>
     * @return
     */
    @Override
    public JQUITabOptions getOptions()
    {
        return feature.getOptions();
    }
}
