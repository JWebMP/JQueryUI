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
package com.jwebmp.plugins.jqueryui.tooltips;

import com.jwebmp.core.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.jqueryui.tooltips.options.*;

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
		extends Feature<GlobalFeatures, JQUITooltipOptions<?>, JQUIToolTipFeature>
{
	/**
	 * The options for this component
	 */
	private JQUITooltipOptions<?> options;
	
	/**
	 * Sets if the tooltip should be placed in the body or in the component
	 * If using dynamic html replace this should be true or you get sticky tooltips
	 */
	private boolean withinComponent;
	
	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component that uses the Title field as the tooltip
	 * <p>
	 *
	 * @param forComponent
	 */
	public JQUIToolTipFeature(IComponentHierarchyBase<?, ?> forComponent)
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
	public JQUIToolTipFeature(IComponentHierarchyBase<?, ?> forComponent, String tooltipText)
	{
		super("JWTooltip");
		setComponent(forComponent);
		if (tooltipText != null)
		{
			getComponent().asAttributeBase()
			              .addAttribute(GlobalAttributes.Title, tooltipText);
		}
	}
	
	/**
	 * Creates a new tooltip for a component with the specified Div to display
	 * <p>
	 *
	 * @param forComponent
	 * @param divToDisplayForComponent
	 */
	public JQUIToolTipFeature(IComponentHierarchyBase<GlobalChildren, ?> forComponent, IComponentHierarchyBase<?, ?> divToDisplayForComponent)
	{
		super("JWTooltip");
		setComponent(forComponent);
		forComponent.add(divToDisplayForComponent);
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
	public JQUITooltipOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUITooltipOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		if (isWithinComponent())
		{
			getOptions().getPosition()
			            .setWithin(getComponent());
		}
		String requiredString = getComponent().asBase()
		                                      .getJQueryID() + "tooltip(";
		requiredString += getOptions().toString();
		requiredString += ");" + getNewLine();
		
		addQuery(requiredString);
	}
	
	/**
	 * Sets if the tooltip should be placed in the body or in the component
	 * If using dynamic html replace this should be true or you get sticky tooltips
	 *
	 * @return
	 */
	public boolean isWithinComponent()
	{
		return withinComponent;
	}
	
	/**
	 * Sets if the tooltip should be placed in the body or in the component
	 * If using dynamic html replace this should be true or you get sticky tooltips
	 *
	 * @param withinComponent
	 * @return
	 */
	public JQUIToolTipFeature setWithinComponent(boolean withinComponent)
	{
		this.withinComponent = withinComponent;
		return this;
	}
	
	/**
	 * Shortcut for setting the track on for the generated tooltip
	 *
	 * @return
	 */
	public JQUIToolTipFeature setTrack()
	{
		getOptions().setTrack(true);
		return this;
	}
}
