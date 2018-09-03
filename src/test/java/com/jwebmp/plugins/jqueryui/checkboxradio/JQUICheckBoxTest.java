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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jwebmp.plugins.jqueryui.checkboxradio;

import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQUICheckBoxTest
{

	public JQUICheckBoxTest()
	{
	}

	@Test
	public void testGetLabel()
	{
		JQUICheckBox<?> cb = new JQUICheckBox();
		cb.setValue("Value 1")
		  .getOptions()
		  .setIcon("Icon")
		  .getClasses()
		  .put("class1", "value1");

		System.out.println(cb.toString(true));
		System.out.println(cb.renderJavascript());
	}

	@Test
	public void testGetLabel2()
	{
		JQUICheckBoxGroup<?> cb = new JQUICheckBoxGroup();
		cb.addCheckBox(new JQUICheckBox("checkbox"));
		JQUIRadioButtonGroup rb = new JQUIRadioButtonGroup();
		rb.addRadioButton(new JQUIRadioButton("radioButton"));

		System.out.println(cb.toString(true));
		System.out.println(cb.renderJavascript());
	}
}
