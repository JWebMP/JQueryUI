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
package com.jwebmp.plugins.jqueryui.button;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.button.options.JQUIButtonGroupOptions;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIButtonGroup
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, JQUIButtonGroup>
{


	private JQUIButtonGroupFeature<?> groupFeature;

	/**
	 *
	 */
	public JQUIButtonGroup()
	{
		addFeature(getGroupFeature());
	}

	/**
	 * Returns the group feature associated with this button group
	 * <p>
	 *
	 * @return
	 */
	@NotNull
	public JQUIButtonGroupFeature<?> getGroupFeature()
	{
		if (groupFeature == null)
		{
			groupFeature = new JQUIButtonGroupFeature<>(this);
		}
		return groupFeature;
	}

	/**
	 * Returns the options for this Button Group from the feature
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIButtonGroupOptions<?> getOptions()
	{
		return getGroupFeature().getOptions();
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
