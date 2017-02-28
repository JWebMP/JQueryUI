/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.accordion;

import za.co.mmagon.jwebswing.base.html.Div;

/**
 *
 * @author GedMarc
 * @since 26 Feb 2017
 *
 */
public class JQUIAccordionContent extends Div
        implements JQUIAccordionChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * The container for the accordion
     */
    public JQUIAccordionContent()
    {

    }

    /**
     * A normal accordion with text
     *
     * @param text
     */
    public JQUIAccordionContent(String text)
    {
        super(text);
    }

}
