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
package com.jwebmp.plugins.jqueryui.autocomplete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.autocomplete.options.JQUIAutoCompleteOptions;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * @author MMagon
 * @version 1.0
 * @since 30 Mar 2013
 */
public class JQUIAutoCompleteFeature<J extends JQUIAutoCompleteFeature<J>>
		extends Feature<GlobalFeatures, JQUIAutoCompleteOptions<?>, J>
{


	/**
	 * The component to display the list at
	 */
	@JsonIgnore
	private final Input<?,?> menuDisplayAtComponent;
	/**
	 * Options
	 */
	@JsonIgnore
	private JQUIAutoCompleteOptions<?> options;

	/**
	 * Constructs a new Auto Complete feature
	 *
	 * @param menuDisplayAtComponent
	 * 		The component to display at
	 */
	public JQUIAutoCompleteFeature(Input<?,?> menuDisplayAtComponent)
	{
		super("JWAutoCompleteFeature");
		this.menuDisplayAtComponent = menuDisplayAtComponent;
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
	 * Returns an instance of the auto complete options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIAutoCompleteOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIAutoCompleteOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(menuDisplayAtComponent.getJQueryID() + "autocomplete(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
