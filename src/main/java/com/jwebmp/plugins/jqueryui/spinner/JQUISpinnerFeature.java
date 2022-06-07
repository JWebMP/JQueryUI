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
package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.plugins.jqueryui.spinner.options.*;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISpinnerFeature<J extends JQUISpinnerFeature<J>>
		extends Feature<GlobalFeatures, JQUISpinnerOptions<?>, J>
{
	/**
	 * The component for the spinner
	 */
	private final IComponentHierarchyBase<?,?> selectMenu;
	/**
	 * The options for the spinner
	 */
	private JQUISpinnerOptions<?> options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISpinnerFeature(IComponentHierarchyBase<?,?> selectMenu)
	{
		super("JWPSelectMenuFeature");
		this.selectMenu = selectMenu;
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
	 * Returns the options associated with the Spinner Object
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISpinnerOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.asBase()
		                   .getJQueryID() + "spinner(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
