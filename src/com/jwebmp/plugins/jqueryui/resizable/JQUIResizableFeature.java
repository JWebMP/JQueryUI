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
package com.jwebmp.plugins.jqueryui.resizable;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.base.servlets.interfaces.IFeature;
import com.jwebmp.plugins.jqueryui.resizable.options.JQUIResizableOptions;

/**
 * Controls items being resizable
 *
 * @author Marc Magon
 * @since Forever
 */
public class JQUIResizableFeature<J extends JQUIResizableFeature<J>>
		extends Feature<JQUIResizableOptions, J>
		implements IFeature
{

	private static final long serialVersionUID = 1L;

	private JQUIResizableOptions options;

	public JQUIResizableFeature(Component component)
	{
		super("JWResizableFeature");
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
	public JQUIResizableOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUIResizableOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		StringBuilder resizableString = new StringBuilder(getComponent().getJQueryID() + "resizable(");
		resizableString.append(getOptions().toString());
		resizableString.append(");")
		               .append(getNewLine());
		addQuery(resizableString.toString());
	}
}
