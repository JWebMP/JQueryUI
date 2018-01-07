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
package za.co.mmagon.jwebswing.plugins.jqueryui.droppable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * The droppable implementation
 * Create targets for draggable elements.
 * <p>
 * The jQuery UI Droppable plugin makes selected elements droppable (meaning they accept being dropped on by draggables).
 * You can specify which draggables each will accept.
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since 2014/04/14
 */
public class JQUIDroppableFeature extends Feature<JQUIDroppableOptions, JQUIDroppableFeature> implements JQUIDroppableFeatures
{

	private JQUIDroppableOptions options;

	public JQUIDroppableFeature(Component componentFor)
	{
		super("JWDroppableFeature");
		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Mouse.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Droppable.getJavaScriptReference());
		setComponent(componentFor);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "droppable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}

	/**
	 * Returns the Droppable Options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDroppableOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUIDroppableOptions();
		}
		return options;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIDroppableFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIDroppableFeature that = (JQUIDroppableFeature) o;

		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getOptions().hashCode();
		return result;
	}
}
