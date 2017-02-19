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
package za.co.mmagon.jwebswing.plugins.jqueryui.resizable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.servlets.interfaces.IFeature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * Controls items being resizable
 *
 * @since Forever
 * @author Marc Magon
 */
public class JQUIResizableFeature extends Feature<JQUIResizableOptions, JQUIResizableFeature> implements IFeature
{

    private static final long serialVersionUID = 1L;

    private JQUIResizableOptions options;

    public JQUIResizableFeature(Component component)
    {
        super("JWResizableFeature");
        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Mouse.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Resizable.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());
        getCssReferences().add(JQUIReferencePool.Resizable.getCssReference());
        setComponent(component);
    }

    @Override
    public void assignFunctionsToComponent()
    {
        StringBuilder resizableString = new StringBuilder(getComponent().getJQueryID() + "resizable(");
        resizableString.append(getOptions().toString());
        resizableString.append(");").append(getNewLine());
        addQuery(resizableString.toString());
    }

    @Override
    public JQUIResizableOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUIResizableOptions();
        }
        return options;
    }

}
