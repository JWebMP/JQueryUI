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
