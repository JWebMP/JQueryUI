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

package com.jwebmp.plugins.jqueryui.position;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationHorizontal;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationVertical;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author MMagon
 */
public class PositionOptionsTest

{

	public PositionOptionsTest()
	{
	}

	/**
	 * Test of getMyString method, of class Position.
	 */
	@Test
	public void testGetMyString()
	{
		System.out.println("getMyString");
		Div d = new Div();
		d.setID("of");
		PositionOptions instance = new PositionOptions(PositionLocationHorizontal.Left, PositionLocationVertical.top, PositionLocationHorizontal.Left, PositionLocationVertical.top,
		                                               d);
		System.out.println(instance.toString());
		String expResult = "{\n" +
		                   "  \"myX\" : \"left\",\n" +
		                   "  \"myY\" : \"top\",\n" +
		                   "  \"atX\" : \"left\",\n" +
		                   "  \"atY\" : \"top\",\n" +
		                   "  \"of\" : \"#of\"\n" +
		                   "}" +
		                   "";
		String result = instance.toString();
		//super.writeValuesToFile(expResult, result);
		assertEquals(expResult, result);
	}

}
