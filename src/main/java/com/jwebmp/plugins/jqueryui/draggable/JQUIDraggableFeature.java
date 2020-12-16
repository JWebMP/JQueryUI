/*
 * Copyright (C) 2017 GedMarc
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

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
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
		extends Feature<GlobalFeatures, JQUIDraggableOptions<?>, J>
{
	private JQUIDraggableOptions<?> draggableOptions = new JQUIDraggableOptions<>();

	/**
	 * Add the draggable to a component
	 * <p>
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option.
	 * A draggable with the same scope value as a droppable will be accepted by the droppable.
	 * <p>
	 */
	public JQUIDraggableFeature()
	{
		//No config required
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
	 */
	public JQUIDraggableFeature(IComponentHierarchyBase<?,?> component)
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
	public JQUIDraggableFeature(IComponentHierarchyBase<?,?> component, String scope)
	{
		super("JWDraggableFeature");
		setComponent(component);
		if (scope != null)
		{
			getOptions().setScope(scope);
		}
		getComponent().asFeatureBase().addFeature(this);
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
	public final JQUIDraggableOptions<?> getOptions()
	{
		if (draggableOptions == null)
		{
			draggableOptions = new JQUIDraggableOptions<>();
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
		String draggableString = getComponent().asBase().getJQueryID() + "draggable(";
		draggableString += draggableOptions;
		draggableString += ");" + getNewLine();
		addQuery(draggableString);
	}
}
