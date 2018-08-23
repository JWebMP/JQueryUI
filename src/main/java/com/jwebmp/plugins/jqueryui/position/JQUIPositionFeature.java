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
package com.jwebmp.plugins.jqueryui.position;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;

import static com.jwebmp.core.utilities.StaticStrings.*;

/**
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since Forever
 */
public class JQUIPositionFeature<J extends JQUIPositionFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart, J>
{

	private static final long serialVersionUID = 1L;
	private final PositionOptions<?> positionOptions;

	public JQUIPositionFeature(ComponentHierarchyBase positionComponent, PositionOptions positionOptions)
	{
		super("JWPosition");
		setComponent(positionComponent);
		this.positionOptions = positionOptions;
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
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "position(" + positionOptions.toString() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
