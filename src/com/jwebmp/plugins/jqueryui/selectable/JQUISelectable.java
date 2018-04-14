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
package com.jwebmp.plugins.jqueryui.selectable;

import com.jwebmp.base.html.Div;
import com.jwebmp.base.html.attributes.NoAttributes;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.selectable.interfaces.IJQUISelectable;
import com.jwebmp.plugins.jqueryui.selectable.interfaces.JQUISelectableEvents;
import com.jwebmp.plugins.jqueryui.selectable.interfaces.JQUISelectableFeatures;
import com.jwebmp.plugins.jqueryui.selectable.options.JQUISelectableOptions;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuChildren;

/**
 * @author GedMarcs
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 17, 2015
 */
@ComponentInformation(name = "JQuery UI Selectable",
		description = "Enable a DOM element (or group of elements) to be selectable. Draw a box with your cursor to select items. Hold down the Ctrl key to make multiple non-adjacent selections.",
		url = "http://jqueryui.com/selectable/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUISelectable
		extends Div<JQUISelectMenuChildren, NoAttributes, JQUISelectableFeatures, JQUISelectableEvents, JQUISelectable>
		implements IJQUISelectable
{

	private static final long serialVersionUID = 1L;
	private JQUISelectableFeature feature;

	/**
	 *
	 */
	public JQUISelectable()
	{
		feature = new JQUISelectableFeature(this);
		addFeature(feature);
	}

	/**
	 * A neater view
	 *
	 * @return
	 */
	public IJQUISelectable asMe()
	{
		return this;
	}

	/**
	 * Returns the features options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISelectableOptions getOptions()
	{
		return feature.getOptions();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUISelectable))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUISelectable that = (JQUISelectable) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}

	/**
	 * Returns the feature for selectable
	 *
	 * @return
	 */
	public JQUISelectableFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUISelectableFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for the selectable
	 *
	 * @param feature
	 */
	public void setFeature(JQUISelectableFeature feature)
	{
		this.feature = feature;
	}
}
