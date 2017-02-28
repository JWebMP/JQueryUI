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

/**
 * The JQuery UI Tabs Implementation
 * <p>
 * @author MMagon
 * @since 29 Mar 2013
 * @version 1.0
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
        addQuery(tab.getJQueryID() + "tabs(" + getOptions() + ");");
    }

    /**
     * Returns the options fields for the tab
     * <p>
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

}
