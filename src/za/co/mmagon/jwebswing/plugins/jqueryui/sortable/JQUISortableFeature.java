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
package za.co.mmagon.jwebswing.plugins.jqueryui.sortable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.jqueryui.sortable.interfaces.JQUISortableFeatures;
import za.co.mmagon.jwebswing.plugins.jqueryui.sortable.options.JQUISortableOptions;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISortableFeature<J extends JQUISortableFeature<J>> extends Feature<JQUISortableOptions<?>, J>
		implements JQUISortableFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The sortable linked component
	 */
	private final Component selectMenu;
	/**
	 * The options for the sortablke feature
	 */
	private JQUISortableOptions<?> options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISortableFeature(Component selectMenu)
	{
		super("JWSortableFeature");
		this.selectMenu = selectMenu;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Sortable.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Sortable.getCssReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "sortable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	@Override
	public JQUISortableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISortableOptions<>();
		}
		return options;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
