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
package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.accordion.options.JQUIAccordionOptions;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * @author MMagon
 */
public class JQUIAccordionFeature
		extends Feature<GlobalFeatures, JQUIAccordionOptions<?>, JQUIAccordionFeature>
{


	private final JQUIAccordion<?> accordion;

	/**
	 * The options for the accordion
	 */
	private JQUIAccordionOptions<?> options;

	public JQUIAccordionFeature(JQUIAccordion <?>accordion)
	{
		super("JWAccordianFeature");
		this.accordion = accordion;
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
	 * Never null
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public final JQUIAccordionOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIAccordionOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String additionalString = accordion.getJQueryID() + "accordion(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine();
		addQuery(additionalString);
	}
}
