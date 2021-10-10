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
package com.jwebmp.plugins.jqueryui.pools;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;

/**
 * @author MMagon
 */
class JQueryUICoreCSSReference
		extends CSSReference
{

	public JQueryUICoreCSSReference()
	{
		super("JQueryUICore", 1.130,"bower_components/jquery-ui/themes/base/core.min.css",
		      "https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.13.0/jquery-ui.min.css");
		setSortOrder(8);
		setPriority(RequirementsPriority.Third);
		setSpecifiedClassName("jquitheme");
	}

}
