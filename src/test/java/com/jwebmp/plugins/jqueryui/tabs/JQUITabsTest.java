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
package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.Paragraph;
import com.jwebmp.plugins.easingeffects.JQEasingAnimationEffectsPart;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import com.jwebmp.plugins.jqueryui.accordion.enumerations.JQUIAccordionHeightStyle;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQUITabsTest
{

	public JQUITabsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		JQUITabs tab = new JQUITabs();
		tab.addTab("tab 1", new JQUITabContent());
		tab.addTab("Number 2", new JQUITabContent<>().add(new Paragraph("Stuff")));

		tab.getOptions()
		   .setActive(2)
		   .setCollapsible(true)
		   .setHeightStyle(JQUIAccordionHeightStyle.Fill)
		   .setShow(
				   new JQEasingAnimationEffectsPart<>().setEasing(JQEasingEffects.easeInBounce)
				                                       .setDuration(6000));

		System.out.println(tab.toString(0));
	}

	@Test
	void getOptions()
	{
	}
}
