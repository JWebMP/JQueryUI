/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu;

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 * 
 */
public interface IJQUISelectMenuItem 
{

    /**
     * Sets the item as disabled
     *
     * @param disabled
     * @return
     */
    JQUISelectMenuItem setDisabled(boolean disabled);

    /**
     * Sets the label
     *
     * @param label
     * @return
     */
    JQUISelectMenuItem setLabel(String label);

    /**
     * If the item is selected
     *
     * @param selected
     * @return
     */
    JQUISelectMenuItem setSelected(boolean selected);

}
