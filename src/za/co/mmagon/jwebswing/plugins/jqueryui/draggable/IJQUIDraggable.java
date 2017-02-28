/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.draggable;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 * 
 */
public interface IJQUIDraggable 
{

    JQUIDraggableFeature getFeature();

    /**
     * Gets this features available options
     * <p>
     * @return
     */
    JQUIDraggableOptions getOptions();

    /**
     * Gets the scope of this Draggable object
     * <p>
     * @return
     */
    String getScope();

    /**
     * Sets the scope of this objects
     * <p>
     * @param scope
     */
    void setScope(String scope);

}
