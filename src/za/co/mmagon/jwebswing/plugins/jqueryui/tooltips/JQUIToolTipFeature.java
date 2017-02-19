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
package za.co.mmagon.jwebswing.plugins.jqueryui.tooltips;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @since 2013/01/16
 * @version 1.0
 */
public class JQUIToolTipFeature extends Feature<JQUITooltipOptions, JQUIToolTipFeature> implements JQUIToolTipFeatures, GlobalFeatures
{

    private static final long serialVersionUID = 1L;
    /**
     * The component this feature is for
     */
    private final Component forComponent;
    /**
     * The options for this component
     */
    private JQUITooltipOptions options;

    /**
     * Constructs a new Tooltip ComponentFeatureBase for a component that uses the Title field as the tooltip
     * <p>
     * @param forComponent
     */
    public JQUIToolTipFeature(Component forComponent)
    {
        this(forComponent, (String) null);
    }

    /**
     * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
     * <p>
     * @param forComponent
     * @param tooltipText
     */
    public JQUIToolTipFeature(Component forComponent, String tooltipText)
    {
        super("JWTooltip");
        this.forComponent = forComponent;
        if (!(tooltipText == null))
        {
            forComponent.addAttribute(GlobalAttributes.Title, tooltipText);
        }

        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

        getJavascriptReferences().add(JQUIReferencePool.Tooltip.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Tooltip.getCssReference());
    }

    /**
     * Creates a new tooltip for a component with the specified Div to display
     * <p>
     * @param forComponent
     * @param divToDisplayForComponent
     */
    public JQUIToolTipFeature(Component forComponent, Div divToDisplayForComponent)
    {
        super("JWTooltip");
        this.forComponent = forComponent;
        getJavascriptReferences().add(JQUIReferencePool.Tooltip.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Tooltip.getCssReference());
    }

    /**
     * Returns all the tooltip options
     * <p>
     * @return
     */
    @Override
    public JQUITooltipOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUITooltipOptions();
        }
        return options;
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String requiredString = forComponent.getJQueryID() + "tooltip(";
        requiredString += getOptions().toString();
        requiredString += ");" + getNewLine();

        addQuery(requiredString);
    }
}
