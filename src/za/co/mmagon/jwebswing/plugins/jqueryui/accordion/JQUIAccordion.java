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

import java.util.ArrayList;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.*;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Displays collapsible content panels for presenting information in a limited amount of space. https://jqueryui.com/accordion/
 * <p>
 * <p>
 * <p>
 * Click headers to expand/collapse content that is broken into logical sections, much like tabs. Optionally, toggle sections open/closed on mouseover.
 * <p>
 * The underlying HTML markup is a series of headers (H3 tags) and content divs so the content is usable without JavaScript.
 *
 *
 * @author Marc Magon
 * @since 2013/01/15
 */
@ComponentInformation(name = "JQuery UI Accordion", description = "Displays collapsible content panels for presenting information in a limited amount of space.",
        url = "http://jqueryui.com/accordion/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIAccordion extends Div<JQUIAccordionChildren, NoAttributes, JQUIAccordionFeatures, JQUIAccordionEvents, JQUIAccordion>
        implements JQUIAccordionChildren
{

    private static final long serialVersionUID = 1L;
    /**
     * The list of accordion tabs
     */
    private ArrayList<JQUIAccordionTab> accordionTabs;
    /**
     * The attached accordion feature
     */
    private JQUIAccordionFeature feature;

    /**
     * Constructs a new accordion object
     */
    public JQUIAccordion()
    {
        this(null);
        this.accordionTabs = new ArrayList();
    }

    /**
     * Constructs a new accordion with the given height style as a default set option
     * <p>
     * @param heightStyle
     */
    public JQUIAccordion(JQUIAccordionHeightStyle heightStyle)
    {
        this.accordionTabs = new ArrayList();
        addFeature(feature = new JQUIAccordionFeature(this));
        getOptions().setHeightStyle(heightStyle);
        addAttribute(GlobalAttributes.JWType, "accordion");
    }

    /**
     * Never null
     * <p>
     * @return
     */
    @Override
    public final JQUIAccordionOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Returns the feature associated with this accordion
     *
     * @return
     */
    public JQUIAccordionFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIAccordionFeature(this);
        }
        return feature;
    }

    /**
     * Sets the feature for this accordion
     *
     * @param feature
     */
    public void setFeature(JQUIAccordionFeature feature)
    {

        this.feature = feature;
    }

    /**
     * Returns this collection of accordion tabs
     *
     * @return
     */
    public ArrayList<JQUIAccordionTab> getAccordionTabs()
    {
        if (accordionTabs == null)
        {
            accordionTabs = new ArrayList<>();
        }
        return accordionTabs;
    }

    /**
     * Sets the collection of accordion tabs
     * <p>
     * @param accordianTabs
     */
    public void setAccordionTabs(ArrayList<JQUIAccordionTab> accordianTabs)
    {
        this.accordionTabs = accordianTabs;
    }

    /**
     * Adds a new accordion tab
     * <p>
     * @param tabName The name of the accordion
     * @param tabContents The content of the accordion
     * @return The accordion tab
     */
    public JQUIAccordionTab addAccordianTab(JQUIAccordionHeader tabName, JQUIAccordionContent tabContents)
    {
        JQUIAccordionTab accTab = new JQUIAccordionTab(tabName, tabContents);
        addAccordianTab(accTab);
        return accTab;
    }

    /**
     * Adds a new accordion tab
     * <p>
     * @param tabName The name of the accordion
     * @param tabContents The content of the accordion
     * @return The accordion tab
     */
    public JQUIAccordionTab addAccordianTab(String tabName, JQUIAccordionContent tabContents)
    {
        JQUIAccordionHeader header;
        if (getOptions().getHeader() == null)
        {
            header = new JQUIAccordionHeader(tabName);
        }
        else
        {
            return addAccordianTab(new JQUIAccordionHeader(tabName), tabContents);
        }

        return addAccordianTab(header, tabContents);
    }

    /**
     * Adds a physical accordion tab
     * <p>
     * @param accordianTab The accordion tab to add to this accordion
     * @return
     */
    public JQUIAccordionTab addAccordianTab(JQUIAccordionTab accordianTab)
    {
        accordionTabs.add(accordianTab);
        add(accordianTab.getHeader());
        add(accordianTab.getComponent());
        return accordianTab;
    }
}
