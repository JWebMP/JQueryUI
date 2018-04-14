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

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.IJQUIDraggable;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableChildren;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableFeatures;
import com.jwebmp.plugins.jqueryui.draggable.options.JQUIDraggableOptions;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 07 Aug 2015
 */
@ComponentInformation(name = "JQuery UI Draggable",
		description = "Enable draggable functionality on any DOM element. Move the draggable " + "" + "" + "" + "object by clicking on it with the mouse and " + "dragging " + "it " + "anywhere within the viewport.",
		url = "http://jqueryui.com/draggable/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIDraggable<J extends JQUIDraggable<J>>
		extends Div<JQUIDraggableChildren, NoAttributes, JQUIDraggableFeatures, JQUIDraggableEvents, J>
		implements IJQUIDraggable
{

	private static final long serialVersionUID = 1L;
	private JQUIDraggableFeature<?> feature;
	private String scope;

	public JQUIDraggable()
	{
		this(null);
	}

	/**
	 * The scope of the Draggable object
	 * <p>
	 *
	 * @param scope
	 */
	public JQUIDraggable(String scope)
	{
		this.scope = scope;
		addFeature(getFeature());
	}

	@Override
	public JQUIDraggableFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIDraggableFeature<>(this, scope);
		}

		return feature;
	}

	/**
	 * Gets the scope of this Draggable object
	 * <p>
	 *
	 * @return
	 */
	@Override
	public String getScope()
	{
		return scope;
	}

	/**
	 * Sets the scope of this objects
	 * <p>
	 *
	 * @param scope
	 */
	@Override
	public void setScope(String scope)
	{
		this.scope = scope;
		getFeature().getOptions()
		            .setScope(scope);
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
		return getFeature().getOptions();
	}

	/**
	 * Neater view
	 *
	 * @return
	 */
	public IJQUIDraggable asMe()
	{
		return this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
