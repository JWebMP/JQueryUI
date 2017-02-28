/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.spinner;

import za.co.mmagon.jwebswing.components.globalize.cultures.GlobalizeCultures;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 * 
 */
public interface IJQUISpinner 
{

    /**
     * Adds the specific culture to the options
     *
     * @param culture
     * @return
     */
    JQUISpinner addGlobalization(GlobalizeCultures culture);

    /**
     * Sets the header text
     *
     * @return
     */
    String getHeaderText();

    /**
     * Returns the input option
     *
     * @return
     */
    JQUISpinnerInput getInput();

    /**
     * Returns the label object with this spinner
     * <p>
     * @return
     */
    JQUISpinnerLabel getLabel();

    /**
     * Returns the options associated with this spinner
     * <p>
     * @return
     */
    JQUISpinnerOptions getOptions();

    /**
     * Gets the header text
     *
     * @param headerText
     * @return
     */
    JQUISpinner setHeaderText(String headerText);

    /**
     * Sets the Input Object
     *
     * @param input
     * @return
     */
    JQUISpinner setInput(JQUISpinnerInput input);

    /**
     * Sets the entry label with this spinner
     * <p>
     * @param label
     * @return
     */
    JQUISpinner setLabel(JQUISpinnerLabel label);

}
