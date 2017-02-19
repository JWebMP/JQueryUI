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
package za.co.mmagon.jwebswing.plugins.jqueryui.dialog;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Implements the JQuery UI Dialog
 *
 * @author MMagon
 * @since 28 Mar 2013
 * @version 1.0
 *
 */
public class JQUIDialogFeature extends Feature<JavaScriptPart, JQUIDialogFeature> implements JQUIDialogFeatures
{

    private static final long serialVersionUID = 1L;

    private final JQUIDialog panel;

    public JQUIDialogFeature(JQUIDialog panel)
    {
        super("JWDialog");
        this.panel = panel;

        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

        getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Mouse.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Resizable.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Draggable.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Dialog.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Button.getCssReference());
        getCssReferences().add(JQUIReferencePool.Resizable.getCssReference());
        getCssReferences().add(JQUIReferencePool.Draggable.getCssReference());
        getCssReferences().add(JQUIReferencePool.Dialog.getCssReference());

    }

    /**
     * Returns the panel associated with this dialog
     * <p>
     * @return
     */
    public JQUIDialog getPanel()
    {
        return panel;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(panel.getJQueryID()).append("dialog(");
        sb.append(panel.getOptions());
        sb.append(");").append(getNewLine());
        addQuery(sb.toString());

    }
}
