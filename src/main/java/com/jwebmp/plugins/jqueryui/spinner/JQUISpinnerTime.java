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
package com.jwebmp.plugins.jqueryui.spinner;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public final class JQUISpinnerTime<J extends JQUISpinnerTime<J>>
		extends JQUISpinner<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * The spinner feature
	 */
	private JQUISpinnerTimeFeature feature;

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 */
	public JQUISpinnerTime()
	{
		this(null);
	}

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 *
	 * @param labelText
	 */
	public JQUISpinnerTime(String labelText)
	{
		super(labelText);
		getFeatures().clear();
		addFeature(getTimeFeature());
	}

	public JQUISpinnerTimeFeature getTimeFeature()
	{
		if (feature == null)
		{
			feature = new JQUISpinnerTimeFeature(getInput());
		}
		return feature;
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
