/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu;

import za.co.mmagon.jwebswing.base.html.OptionGroup;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 *
 */
public class JQUISelectMenuGroup extends OptionGroup implements JQUISelectMenuChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * A option group
     */
    public JQUISelectMenuGroup()
    {
        this("Group");
    }

    /**
     * Constructs a new select menu group
     *
     * @param label
     */
    public JQUISelectMenuGroup(String label)
    {
        super(label);
    }

}
