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
package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.Component;
import com.jwebmp.Feature;
import com.jwebmp.plugins.jqueryui.pools.JQUIReferencePool;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerFeatures;
import com.jwebmp.plugins.jqueryui.spinner.options.JQUISpinnerOptions;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISpinnerFeature<J extends JQUISpinnerFeature<J>>
		extends Feature<JQUISpinnerOptions, J>
		implements JQUISpinnerFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The component for the spinner
	 */
	private final Component selectMenu;
	/**
	 * The options for the spinner
	 */
	private JQUISpinnerOptions<?> options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISpinnerFeature(Component selectMenu)
	{
		super("JWPSelectMenuFeature");
		this.selectMenu = selectMenu;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Spinner.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Button.getCssReference());
		getCssReferences().add(JQUIReferencePool.Spinner.getCssReference());

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
	 * Returns the options associated with the Spinner Object
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISpinnerOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "spinner(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
