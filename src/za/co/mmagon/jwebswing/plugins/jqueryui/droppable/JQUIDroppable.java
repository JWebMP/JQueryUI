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
package za.co.mmagon.jwebswing.plugins.jqueryui.droppable;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.IJQUIDroppable;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.JQUIDroppableChildren;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.interfaces.JQUIDroppableFeatures;
import za.co.mmagon.jwebswing.plugins.jqueryui.droppable.options.JQUIDroppableOptions;

import javax.validation.constraints.NotNull;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 07 Aug 2015
 */
@ComponentInformation(name = "JQuery UI Droppable", description = "Enable any DOM element to be droppable, a target for draggable " +
		                                                                  "elements.", url = "http://jqueryui.com/droppable/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIDroppable extends Div<JQUIDroppableChildren, NoAttributes, JQUIDroppableFeatures, JQUIDroppableEvents, JQUIDroppable>
		implements IJQUIDroppable
{

	private static final long serialVersionUID = 1L;
	private JQUIDroppableFeature<?> feature;

	public JQUIDroppable()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns the Droppable Options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDroppableOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	@NotNull
	public final JQUIDroppableFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIDroppableFeature<>(this);
		}
		return feature;
	}

	/**
	 * Neater View
	 *
	 * @return
	 */
	public IJQUIDroppable asMe()
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
