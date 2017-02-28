/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;

/**
 *
 * @author GedMarc
 * @param <J>
 * @since 27 Feb 2017
 *
 */
public class JQUIAutoCompleteLabel<J extends JQUIAutoCompleteLabel> extends Label<J>
{

    private static final long serialVersionUID = 1L;

    /**
     * A new label
     */
    public JQUIAutoCompleteLabel()
    {

    }

    /**
     * A new label
     *
     * @param label
     */
    public JQUIAutoCompleteLabel(String label)
    {
        super(label);
    }

    /**
     * A new label
     *
     * @param label
     * @param forInputComponent
     */
    public JQUIAutoCompleteLabel(String label, Input forInputComponent)
    {
        super(label, forInputComponent);
    }

}
