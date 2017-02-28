/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import za.co.mmagon.jwebswing.base.html.Input;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 * 
 */
public interface IJQUICheckBox 
{

    /**
     * Sets the label of this checkbox
     *
     * @return
     */
    String getLabel();

    JQUICheckBoxRadioOptions getOptions();

    /**
     * Gets the value of this checkbox
     *
     * @return
     */
    String getValue();

    /**
     * Sets the label of this checkbox
     *
     * @param label
     */
    void setLabel(String label);

    Input setValue(String value);

}
