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
package com.jwebmp.plugins.pools.jqueryui;

import com.jwebmp.base.references.JavascriptReference;
import com.jwebmp.base.servlets.enumarations.RequirementsPriority;

/**
 * The JQuery JavaScript Reference
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		I have moved these from the features to make it easier to specify remote or local references.
 * 		<p>
 * @version 1.0
 * @since 2014/12/09
 */
class JQueryUICoreJavaScriptReference extends JavascriptReference
{

	public JQueryUICoreJavaScriptReference()
	{
		super("JQueryUICore", 1.114, "bower_components/jquery-ui/jquery-ui.min.js", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.0/jquery-ui.min.js");
		setSortOrder(5);
		setPriority(RequirementsPriority.Third);
	}

}
