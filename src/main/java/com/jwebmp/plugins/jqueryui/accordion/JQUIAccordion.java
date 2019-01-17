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
package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.accordion.enumerations.JQUIAccordionHeightStyle;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionChildren;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionEvents;
import com.jwebmp.plugins.jqueryui.accordion.interfaces.JQUIAccordionFeatures;
import com.jwebmp.plugins.jqueryui.accordion.options.JQUIAccordionOptions;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Displays collapsible content panels for presenting information in a limited amount of space. https://jqueryui.com/accordion/
 * <p>
 * <p>
 * <p>
 * Click headers to expand/collapse content that is broken into logical sections, much like tabs. Optionally, toggle sections open/closed
 * on mouseover.
 * <p>
 * The underlying HTML markup is a series of headers (H3 tags) and content divs so the content is usable without JavaScript.
 *
 * @author GedMarc
 * @since 2013/01/15
 */
@ComponentInformation(name = "JQuery UI Accordion",
		description = "Displays collapsible content panels for presenting information in a limited amount of space.",
		url = "http://jqueryui.com/accordion/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIAccordion<J extends JQUIAccordion<J>>
		extends Div<JQUIAccordionChildren, NoAttributes, JQUIAccordionFeatures, JQUIAccordionEvents, J>
		implements JQUIAccordionChildren<JQUIAccordionChildren, J>
{


	/**
	 * The list of accordion tabs
	 */
	private List<JQUIAccordionTab<?>> accordionTabs;
	/**
	 * The attached accordion feature
	 */
	private JQUIAccordionFeature feature;

	/**
	 * Constructs a new accordion object
	 */
	public JQUIAccordion()
	{
		this(null);
		accordionTabs = new ArrayList<>();
	}

	/**
	 * Constructs a new accordion with the given height style as a default set option
	 * <p>
	 *
	 * @param heightStyle
	 */
	public JQUIAccordion(JQUIAccordionHeightStyle heightStyle)
	{
		accordionTabs = new ArrayList<>();
		feature = new JQUIAccordionFeature(this);
		addFeature(feature);
		getOptions().setHeightStyle(heightStyle);
		addAttribute(GlobalAttributes.JWType, "accordion");
	}

	/**
	 * Never null
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public final JQUIAccordionOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns the feature associated with this accordion
	 *
	 * @return
	 */
	@NotNull
	public JQUIAccordionFeature getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIAccordionFeature(this);
		}
		return feature;
	}

	/**
	 * Sets the feature for this accordion
	 *
	 * @param feature
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setFeature(JQUIAccordionFeature feature)
	{

		this.feature = feature;
		return (J) this;
	}

	/**
	 * Adds a new accordion tab
	 * <p>
	 *
	 * @param tabName
	 * 		The name of the accordion
	 * @param tabContents
	 * 		The content of the accordion
	 *
	 * @return The accordion tab
	 */
	@NotNull
	public JQUIAccordionTab addAccordianTab(String tabName, @NotNull JQUIAccordionContent tabContents)
	{
		JQUIAccordionHeader header;
		if (getOptions().getHeader() == null)
		{
			header = new JQUIAccordionHeader(tabName);
		}
		else
		{
			return addAccordianTab(new JQUIAccordionHeader(tabName), tabContents);
		}

		return addAccordianTab(header, tabContents);
	}

	/**
	 * Adds a new accordion tab
	 * <p>
	 *
	 * @param tabName
	 * 		The name of the accordion
	 * @param tabContents
	 * 		The content of the accordion
	 *
	 * @return The accordion tab
	 */
	public JQUIAccordionTab addAccordianTab(JQUIAccordionHeader tabName, JQUIAccordionContent tabContents)
	{
		JQUIAccordionTab accTab = new JQUIAccordionTab(tabName, tabContents);
		addAccordianTab(accTab);
		return accTab;
	}

	/**
	 * Adds a physical accordion tab
	 * <p>
	 *
	 * @param accordianTab
	 * 		The accordion tab to add to this accordion
	 *
	 * @return
	 */
	@NotNull
	public JQUIAccordionTab addAccordianTab(@NotNull JQUIAccordionTab accordianTab)
	{
		getAccordionTabs().add(accordianTab);
		return accordianTab;
	}

	/**
	 * Returns this collection of accordion tabs
	 *
	 * @return
	 */
	@NotNull
	public List<JQUIAccordionTab<?>> getAccordionTabs()
	{
		if (accordionTabs == null)
		{
			accordionTabs = new ArrayList<>();
		}
		return accordionTabs;
	}

	/**
	 * Sets the collection of accordion tabs
	 * <p>
	 *
	 * @param accordianTabs
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAccordionTabs(List<JQUIAccordionTab<?>> accordianTabs)
	{
		accordionTabs = accordianTabs;
		return (J) this;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			for (JQUIAccordionTab<?> a : getAccordionTabs())
			{
				a.getHeader()
				 .setHeaderType(getOptions().getHeader());
				add(a.getHeader());
				add(a.getComponent());
			}
		}
		super.preConfigure();
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
}
