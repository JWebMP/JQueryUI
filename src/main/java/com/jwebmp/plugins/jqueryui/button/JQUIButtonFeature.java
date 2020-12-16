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
package com.jwebmp.plugins.jqueryui.button;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.button.options.JQUIButtonOptions;
import com.jwebmp.plugins.jqueryui.pools.JQUIReferencePool;
import jakarta.validation.constraints.NotNull;

import static com.guicedee.guicedinjection.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;


/**
 * The JavaScript implementation of the JWButton
 *
 * @author MMagon
 * @version 1.0
 * @since 09 Mar 2013
 */
public class JQUIButtonFeature<J extends JQUIButtonFeature<J>>
		extends Feature<GlobalFeatures, JQUIButtonOptions<?>, J>
{


	/**
	 * The component that we are turning into a button
	 */
	private final IComponentHierarchyBase<?,?> comp;
	/**
	 * The specified options
	 */
	private JQUIButtonOptions<?> options;

	/**
	 * Turns a component into a button
	 * <p>
	 *
	 * @param comp
	 */
	public JQUIButtonFeature(IComponentHierarchyBase<?,?> comp)
	{
		super("JWButtonFeature");
		this.comp = comp;
		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());
		getCssReferences().add(JQUIReferencePool.Button.getCssReference());
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
	 * Returns the options for a button
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIButtonOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIButtonOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(comp.asBase().getJQueryID() + "button(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
