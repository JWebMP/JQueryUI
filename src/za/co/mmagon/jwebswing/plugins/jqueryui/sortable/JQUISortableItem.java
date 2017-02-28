/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.sortable;

import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.plugins.jqueryui.themes.JQUIThemeBlocks;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
public class JQUISortableItem extends ListItem implements JQUISortableChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new sortable item with any children available
     */
    public JQUISortableItem()
    {

    }

    /**
     * Constructs a new sortable item with any children available and the given raw text
     *
     * @param text
     */
    public JQUISortableItem(String text)
    {
        super(text);
    }

    /**
     * Sets the item as disabled
     *
     * @param disabled
     * @return
     */
    public JQUISortableItem setDisabled(boolean disabled)
    {
        if (disabled)
        {
            addClass(JQUIThemeBlocks.UI_State_Default.toString());
        }
        else
        {
            removeClass(JQUIThemeBlocks.UI_State_Default.toString());
        }
        return this;
    }
}
