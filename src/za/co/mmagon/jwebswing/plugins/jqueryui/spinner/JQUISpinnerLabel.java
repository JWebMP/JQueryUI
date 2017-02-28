/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.spinner;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Label;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
public class JQUISpinnerLabel extends Label<JQUISpinnerLabel> implements JQUISpinnerChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A specific label for the spinner
     */
    public JQUISpinnerLabel()
    {

    }

    /**
     * A specific label for the spinner
     *
     * @param label
     */
    public JQUISpinnerLabel(String label)
    {
        super(label);
    }

    /**
     * A specific label for the spinner
     *
     * @param label
     * @param forInputComponent
     */
    public JQUISpinnerLabel(String label, Input forInputComponent)
    {
        super(label, forInputComponent);
    }

}
