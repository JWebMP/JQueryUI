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
package com.jwebmp.plugins.jqueryui.sortable;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.IJQUISortable;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.JQUISortableChildren;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.JQUISortableEvents;
import com.jwebmp.plugins.jqueryui.sortable.interfaces.JQUISortableFeatures;
import com.jwebmp.plugins.jqueryui.sortable.options.JQUISortableOptions;

/**
 * @author GedMarc
 * @since 20150807
 */
@ComponentInformation(name = "JQuery UI Sortable",
		description = "The jQuery UI Slider plugin makes selected elements into sliders. " +
		              "There" +
		              " are various options such as multiple handles and " +
		              "ranges. The " +
		              "handle can be moved with the mouse or the " +
		              "arrow" +
		              " keys.",
		url = "http://jqueryui.com/sortable/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUISortable<J extends JQUISortable<J>>
		extends Div<JQUISortableChildren, NoAttributes, JQUISortableFeatures, JQUISortableEvents, J>
		implements IJQUISortable
{

	/**
	 * Field serialVersionUID
	 */

	/**
	 * The sortable feature
	 */
	private JQUISortableFeature<?> feature;

	/**
	 * Constructs a new Selectable Ordered List
	 */
	public JQUISortable()
	{
		setTag("ul");
		addFeature(getFeature());
	}

	/**
	 * Returns the feature associated with the sortable feature
	 *
	 * @return
	 */
	public final JQUISortableFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUISortableFeature<>(this);
		}
		return feature;
	}

	/**
	 * Returns the sortable options
	 *
	 * @return
	 */
	@Override
	public JQUISortableOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns a neater view
	 *
	 * @return
	 */
	public IJQUISortable asMe()
	{
		return this;
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
}
