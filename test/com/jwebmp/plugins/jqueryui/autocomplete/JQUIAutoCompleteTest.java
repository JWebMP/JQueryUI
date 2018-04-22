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
package com.jwebmp.plugins.jqueryui.autocomplete;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQUIAutoCompleteTest

{

	public JQUIAutoCompleteTest()
	{
	}

	@Test
	public void testStrucure()
	{
		JQUIAutoComplete ac = new JQUIAutoComplete("autocomplete");
		ac.setID("id");
		ac.getLabel()
		  .setID("label");
		ac.getInput()
		  .setID("input");
		ac.getOptions()
		  .addOption("option 1");
		System.out.println(ac.toString(true));
		ac.getInput()
		  .setID("id");
		Assertions.assertEquals(
				"<div class=\"ui-widget\" id=\"id\">\n" + "\t<label for=\"autocomplete\" id=\"label\">autocomplete</label>\n" + "\t<input id=\"id\" name=\"id\" type=\"text\"/>\n" + "</div>",
				ac.toString(true));
	}

	@Test
	public void testSourceBasic()
	{
		JQUIAutoComplete ac = new JQUIAutoComplete("autocomplete");
		ac.setID("id");
		ac.getLabel()
		  .setID("label");
		ac.getInput()
		  .setID("input");
		ac.getOptions()
		  .addOption("option 1");
		ac.toString(true);
		System.out.println(ac.renderJavascript()
		                     .toString());
		String expected = "$(\"#input\").autocomplete({\n" + "  \"source\" : [{\n" + "  \"label\" : \"option 1\"\n" + "}]\n" + "});\n";
		String rendered = ac.renderJavascript()
		                    .toString();
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testSourceCategories()
	{
		JQUIAutoComplete ac = new JQUIAutoComplete("autocomplete");
		ac.setID("id");
		ac.getLabel()
		  .setID("label");
		ac.getInput()
		  .setID("input");
		ac.getOptions()
		  .addOption("option 1", "value1", "category1");
		System.out.println(ac.renderJavascript()
		                     .toString());

		String expected = "$(\"#input\").autocomplete({\n" + "  \"source\" : [{\n" + "  \"label\" : \"option 1\",\n" + "  \"value\" : " + "\"value1\",\n" + "  \"category\" : \"category1\"\n" + "}]\n" + "});\n";
		String rendered = ac.renderJavascript()
		                    .toString();

		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testSourceDataUrl()
	{
		JQUIAutoComplete ac = new JQUIAutoComplete("autocomplete");
		ac.setID("id");
		ac.getLabel()
		  .setID("label");
		ac.getInput()
		  .setID("input");
		ac.getOptions()
		  .setAjax(true, ac);
		ac.getOptions()
		  .addOption("option 1", "value1", "category1");
		System.out.println(ac.renderJavascript()
		                     .toString());

		String expected = "$(\"#input\").autocomplete({\n" + "  \"source\" : \"jwdata?component=id\"\n" + "});\n";
		String rendered = ac.renderJavascript()
		                    .toString();

		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}
}
