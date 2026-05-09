package com.jwebmp.plugins.jqueryui.draggable.interfaces;

import com.jwebmp.plugins.jqueryui.draggable.JQUIDraggableFeature;
import com.jwebmp.plugins.jqueryui.draggable.options.JQUIDraggableOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public interface IJQUIDraggable
{

	JQUIDraggableFeature getFeature();

	/**
	 * Gets this features available options
	 * <p>
	 *
	 * @return
	 */
	JQUIDraggableOptions getOptions();

	/**
	 * Gets the scope of this Draggable object
	 * <p>
	 *
	 * @return
	 */
	String getScope();

	/**
	 * Sets the scope of this objects
	 * <p>
	 *
	 * @param scope
	 */
	void setScope(String scope);

}
