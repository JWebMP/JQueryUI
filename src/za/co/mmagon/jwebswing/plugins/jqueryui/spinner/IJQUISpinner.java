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
