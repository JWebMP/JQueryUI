/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
