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
package com.jwebmp.plugins.jqueryui.checkboxradio;

import com.jwebmp.base.html.FieldSet;
import com.jwebmp.base.html.Legend;
import com.jwebmp.plugins.jqueryui.controlgroup.JQUIControlGroupFeature;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUICheckBoxGroup<J extends JQUICheckBoxGroup<J>>
		extends FieldSet<J>
{

	private static final long serialVersionUID = 1L;

	private JQUIControlGroupFeature feature;

	private String legendTitle;

	/**
	 * Constructs a new Check Box Group
	 */
	public JQUICheckBoxGroup()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns this groups feature
	 * <p>
	 *
	 * @return
	 */
	public final JQUIControlGroupFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIControlGroupFeature(this);
		}
		return feature;
	}

	/**
	 * Adds a new Check Box to the group
	 * <p>
	 *
	 * @param checkBox
	 * 		the check box to add
	 *
	 * @return
	 */
	public JQUICheckBoxGroup addCheckBox(JQUICheckBox checkBox)
	{
		add(checkBox);
		return this;
	}

	/**
	 * Sets the legend title
	 *
	 * @return
	 */
	public String getLegendTitle()
	{
		return legendTitle;
	}

	/**
	 * Sets the legend title
	 *
	 * @param legendTitle
	 *
	 * @return
	 */
	public J setLegendTitle(String legendTitle)
	{
		this.legendTitle = legendTitle;
		return (J) this;
	}

	@Override
	protected StringBuilder renderBeforeChildren()
	{
		Legend leg = new Legend();
		leg.setText(legendTitle);
		leg.setTiny(true);
		return new StringBuilder().append(getCurrentTabIndents())
		                          .append(leg.toString(true))
		                          .append(getNewLine());
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
