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
package za.co.mmagon.jwebswing.plugins.jqueryui.position;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since Forever
 */
public class JQUIPositionFeature extends Feature<JavaScriptPart, JQUIPositionFeature>
{

	private static final long serialVersionUID = 1L;
	private final Position position;

	public JQUIPositionFeature(Component positionComponent, Position position)
	{
		super("JWPosition");
		setComponent(positionComponent);
		this.position = position;
		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Position.getJavaScriptReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "position(" + position.toString() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIPositionFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIPositionFeature that = (JQUIPositionFeature) o;

		return position.equals(that.position);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + position.hashCode();
		return result;
	}
}
