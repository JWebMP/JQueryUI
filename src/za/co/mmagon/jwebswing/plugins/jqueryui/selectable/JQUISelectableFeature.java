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
package za.co.mmagon.jwebswing.plugins.jqueryui.selectable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * Handles selectable objects.
 * <p>
 * Use the mouse to select elements, individually or in a group.
 *
 * @since 2014/05/16
 * @version 1.0
 * @author MMagon
 *
 */
public class JQUISelectableFeature extends Feature<JQUISelectableOptions, JQUISelectableFeature> implements JQUISelectableFeatures
{

    private static final long serialVersionUID = 1L;

    private JQUISelectableOptions options;

    /**
     * Construct a new instance of a selectable feature Sets name to JWSelectableFeature
     *
     * @param component The component to assign the feature to
     */
    public JQUISelectableFeature(Component component)
    {
        super("JWSelectableFeature");
        setComponent(component);
        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

        getJavascriptReferences().add(JQUIReferencePool.Selectable.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Selectable.getCssReference());
    }

    /**
     * The JQuery String
     * <p>
     */
    @Override
    public void assignFunctionsToComponent()
    {
        StringBuilder selectableString = new StringBuilder(getComponent().getJQueryID() + "selectable(");
        selectableString.append(getOptions().toString());
        selectableString.append(");").append(getNewLine());
        addQuery(selectableString.toString());
    }

    @Override
    public JQUISelectableOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUISelectableOptions();
        }
        return options;
    }

}
