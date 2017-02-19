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
package za.co.mmagon.jwebswing.plugins.jqueryui.accordion;

import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 *
 * @author MMagon
 */
public class JQUIAccordionFeature extends Feature<JQUIAccordionOptions, JQUIAccordionFeature> implements JQUIAccordionFeatures
{

    private static final long serialVersionUID = 1L;

    private final JQUIAccordion accordion;

    /**
     * The options for the accordion
     */
    private JQUIAccordionOptions options;

    public JQUIAccordionFeature(JQUIAccordion accordion)
    {
        super("JWAccordianFeature");
        this.accordion = accordion;
        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

        getJavascriptReferences().add(JQUIReferencePool.Accordion.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Accordion.getCssReference());
    }

    @Override
    public void assignFunctionsToComponent()
    {
        String additionalString = accordion.getJQueryID() + "accordion(" + getOptions() + ");" + getNewLine();
        addQuery(additionalString);
    }

    /**
     * Never null
     * <p>
     * @return
     */
    @Override
    public final JQUIAccordionOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUIAccordionOptions();
        }
        return options;
    }
}
