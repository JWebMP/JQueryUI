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
package za.co.mmagon.jwebswing.plugins.jqueryui.spinner;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.interfaces.JQUISpinnerFeatures;
import za.co.mmagon.jwebswing.plugins.jqueryui.spinner.options.JQUISpinnerOptions;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISpinnerTimeFeature extends Feature<JQUISpinnerOptions, JQUISpinnerTimeFeature> implements JQUISpinnerFeatures
{

	private static final long serialVersionUID = 1L;
	/**
	 * The component for the time feature
	 */
	private final Component selectMenu;
	/**
	 * The options for the time spinner
	 */
	private JQUISpinnerOptions options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISpinnerTimeFeature(Component selectMenu)
	{
		super("JWSpinnerTimeFeature");
		this.selectMenu = selectMenu;

		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());

		getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Spinner.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.SpinnerTime.getJavaScriptReference());

		getCssReferences().add(JQUIReferencePool.Button.getCssReference());
		getCssReferences().add(JQUIReferencePool.Spinner.getCssReference());

	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "timespinner(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}

	/**
	 * Returns the options associated with the Spinner Object
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUISpinnerOptions();
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
		if (!(o instanceof JQUISpinnerTimeFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUISpinnerTimeFeature that = (JQUISpinnerTimeFeature) o;

		if (!selectMenu.equals(that.selectMenu))
		{
			return false;
		}
		return getOptions().equals(that.getOptions());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + selectMenu.hashCode();
		result = 31 * result + getOptions().hashCode();
		return result;
	}
}
