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
package com.jwebmp.plugins.jqueryui.droppable;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.droppable.options.JQUIDroppableOptions;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

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
public class JQUIDroppableFeature<J extends JQUIDroppableFeature<J>>
		extends Feature<GlobalFeatures, JQUIDroppableOptions, J>
{

	private JQUIDroppableOptions<?> options;

	public JQUIDroppableFeature(Component componentFor)
	{
		super("JWDroppableFeature");
		setComponent(componentFor);
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
	 * Returns the Droppable Options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDroppableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIDroppableOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "droppable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
