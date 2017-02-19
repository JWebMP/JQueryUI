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
package za.co.mmagon.jwebswing.plugins.jqueryui.button;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * The JavaScript implementation of the JWButton
 *
 * @author MMagon
 * @since 09 Mar 2013
 * @version 1.0
 */
public class JQUIButtonFeature extends Feature<JQUIButtonOptions, JQUIButtonFeature> implements JQUIButtonFeatures
{

    private static final long serialVersionUID = 1L;
    /**
     * The component that we are turning into a button
     */
    private final Component comp;
    /**
     * The specified options
     */
    private JQUIButtonOptions options;

    /**
     * Turns a component into a button
     * <p>
     * @param comp
     */
    public JQUIButtonFeature(Component comp)
    {
        super("JWButtonFeature");
        this.comp = comp;
        //comp.addAttribute(GlobalAttributes.JWType, "button");
        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());
        getCssReferences().add(JQUIReferencePool.Button.getCssReference());
    }

    @Override
    public void assignFunctionsToComponent()
    {
        addQuery(comp.getJQueryID() + "button(" + getOptions() + ");" + getNewLine());
    }

    /**
     * Returns the options for a button
     * <p>
     * @return
     */
    @Override
    public JQUIButtonOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUIButtonOptions();
        }
        return options;
    }
}
