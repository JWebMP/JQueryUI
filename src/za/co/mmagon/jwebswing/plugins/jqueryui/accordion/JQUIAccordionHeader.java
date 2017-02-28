/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.accordion;

import za.co.mmagon.jwebswing.base.html.H3;

/**
 *
 * @author GedMarc
 * @since 26 Feb 2017
 *
 */
public class JQUIAccordionHeader extends H3<JQUIAccordionHeader>
        implements JQUIAccordionChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * An accordion header
     */
    public JQUIAccordionHeader()
    {

    }

    /**
     * Constructs with a text
     *
     * @param text
     */
    public JQUIAccordionHeader(String text)
    {
        super(text);
    }

}
