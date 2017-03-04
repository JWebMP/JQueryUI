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
package za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu;

import za.co.mmagon.jwebswing.base.html.Option;
import za.co.mmagon.jwebswing.base.html.attributes.InputAttributes;
import za.co.mmagon.jwebswing.utilities.GUIDGenerator;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
public class JQUISelectMenuItem extends Option implements JQUISelectMenuChildren, IJQUISelectMenuItem
{

    private static final long serialVersionUID = 1L;
    private static final String selectedString = "selected";

    /**
     * Construct a new select menu item
     */
    public JQUISelectMenuItem()
    {
        this(GUIDGenerator.generateGuid());
    }

    /**
     * Constructs with a given value
     *
     * @param value
     */
    public JQUISelectMenuItem(String value)
    {
        super(value);
    }

    /**
     * A much neater view
     *
     * @return
     */
    public IJQUISelectMenuItem asMe()
    {
        return this;
    }

    /**
     * Sets the label
     *
     * @param label
     * @return
     */
    @Override
    public JQUISelectMenuItem setLabel(String label)
    {
        super.setLabel(label);
        return this;
    }

    /**
     * If the item is selected
     *
     * @param selected
     * @return
     */
    @Override
    public JQUISelectMenuItem setSelected(boolean selected)
    {
        if (selected)
        {
            addAttribute(selectedString, selectedString);
        }
        else
        {
            getAttributesCustom().remove(selectedString);
        }

        return this;
    }

    /**
     * Sets the item as disabled
     *
     * @param disabled
     * @return
     */
    @Override
    public JQUISelectMenuItem setDisabled(boolean disabled)
    {
        if (disabled)
        {
            addAttribute(InputAttributes.Disabled.toString(), null);
        }
        return this;
    }

}
