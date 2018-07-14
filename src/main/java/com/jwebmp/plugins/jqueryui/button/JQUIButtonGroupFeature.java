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
package com.jwebmp.plugins.jqueryui.button;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.button.interfaces.JQUIButtonFeatures;
import com.jwebmp.plugins.jqueryui.button.options.JQUIButtonGroupOptions;

import javax.validation.constraints.NotNull;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIButtonGroupFeature<J extends JQUIButtonGroupFeature<J>>
		extends Feature<JQUIButtonGroupOptions, J>
		implements JQUIButtonFeatures
{

	private static final long serialVersionUID = 1L;

	private final Component buttonGroup;
	private JQUIButtonGroupOptions buttongGroupOptions;

	/**
	 * Configures a new check box group
	 * <p>
	 *
	 * @param buttonGroup
	 * 		The group to apply to
	 */
	public JQUIButtonGroupFeature(Component buttonGroup)
	{
		super("JWCheckBoxGroupFeature");
		this.buttonGroup = buttonGroup;
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
	 * Returns the button group options
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIButtonGroupOptions getOptions()
	{
		if (buttongGroupOptions == null)
		{
			buttongGroupOptions = new JQUIButtonGroupOptions();
		}
		return buttongGroupOptions;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(buttonGroup.getJQueryID() + "buttonset(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
