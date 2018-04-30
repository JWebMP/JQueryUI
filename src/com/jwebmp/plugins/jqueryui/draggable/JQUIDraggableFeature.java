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
package com.jwebmp.plugins.jqueryui.draggable;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableFeatures;
import com.jwebmp.plugins.jqueryui.draggable.options.JQUIDraggableOptions;

/**
 * Implements the JQuery Draggable functionality on an object
 *
 * @author MMagon
 * 		<p>
 * 		1.0 Complete API implemented
 * @version 1.0
 * @since 2014/04/13
 */
public class JQUIDraggableFeature<J extends JQUIDraggableFeature<J>>
		extends Feature<JQUIDraggableOptions, J>
		implements JQUIDraggableFeatures
{

	private static final long serialVersionUID = 1L;
	private JQUIDraggableOptions draggableOptions = new JQUIDraggableOptions();

	/**
	 * Add the draggable to a component
	 * <p>
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option.
	 * A draggable with the same scope value as a droppable will be accepted by the droppable.
	 * <p>
	 *
	 * @param component
	 * 		The component that must get the feature
	 */
	public JQUIDraggableFeature(Component component)
	{
		this(component, null);
	}

	/**
	 * Add the draggable to a component
	 * <p>
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option.
	 * A draggable with the same scope value as a droppable will be accepted by the droppable.
	 * <p>
	 *
	 * @param component
	 * 		The component that must get the feature
	 * @param scope
	 * 		The scope of this component.
	 */
	public JQUIDraggableFeature(Component component, String scope)
	{
		super("JWDraggableFeature");
		setComponent(component);
		if (scope != null)
		{
			getOptions().setScope(scope);
		}
		getComponent().addFeature(this);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Gets this features available options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public final JQUIDraggableOptions getOptions()
	{
		if (draggableOptions == null)
		{
			draggableOptions = new JQUIDraggableOptions();
		}
		return draggableOptions;
	}

	/**
	 * Creates the JQuery String for this feature
	 * <p>
	 */
	@Override
	public void assignFunctionsToComponent()
	{
		String draggableString = getComponent().getJQueryID() + "draggable(";
		draggableString += draggableOptions;
		draggableString += ");" + getNewLine();
		addQuery(draggableString);
	}
}
