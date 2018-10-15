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
package com.jwebmp.plugins.jqueryui.tooltips;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.tooltips.options.JQUITooltipOptions;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
@ComponentInformation(name = "JQuery UI Tooltips",
		description = "Tooltip replaces native tooltips, making them themeable as well as allowing various customizations:",
		url = "http://jqueryui.com/tooltip/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIToolTipFeature
		extends Feature<GlobalFeatures, JQUITooltipOptions, JQUIToolTipFeature>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The options for this component
	 */
	private JQUITooltipOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component that uses the Title field as the tooltip
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQUIToolTipFeature(Component forComponent)
	{
		this(forComponent, (String) null);
	}

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 * @param tooltipText
	 */
	public JQUIToolTipFeature(Component forComponent, String tooltipText)
	{
		super("JWTooltip");
		setComponent(forComponent);
		if (tooltipText != null)
		{
			getComponent().addAttribute(GlobalAttributes.Title, tooltipText);
		}
	}

	/**
	 * Creates a new tooltip for a component with the specified Div to display
	 * <p>
	 *
	 * @param forComponent
	 * @param divToDisplayForComponent
	 */
	public JQUIToolTipFeature(Component forComponent, Div divToDisplayForComponent)
	{
		super("JWTooltip");
		setComponent(forComponent);
		getComponent().add(divToDisplayForComponent);
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
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUITooltipOptions getOptions()
	{
		if (options == null)
		{
			options = new JQUITooltipOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = getComponent().getJQueryID() + "tooltip(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();

		addQuery(requiredString);
	}
}
