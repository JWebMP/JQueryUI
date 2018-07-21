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

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

import javax.validation.constraints.NotNull;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUICheckBoxRadioFeature<J extends JQUICheckBoxRadioFeature<J>>
		extends Feature<JQUICheckBoxRadioOptions, J>
{

	private static final long serialVersionUID = 1L;
	private JQUICheckBoxRadioOptions<?> options;

	public JQUICheckBoxRadioFeature(Component component)
	{
		super("JQUICHeckBoxRadioFeature");
		setComponent(component);
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

	@Override
	@NotNull
	public JQUICheckBoxRadioOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUICheckBoxRadioOptions<>();
		}
		return options;
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "checkboxradio(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
