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
package com.jwebmp.plugins.jqueryui.checkboxradio.interfaces;

import com.jwebmp.base.html.Input;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public interface IJQUICheckBox
{

	/**
	 * Sets the label of this checkbox
	 *
	 * @return
	 */
	String getLabel();

	/**
	 * Sets the label of this checkbox
	 *
	 * @param label
	 */
	void setLabel(String label);

	JQUICheckBoxRadioOptions getOptions();

	/**
	 * Gets the value of this checkbox
	 *
	 * @return
	 */
	String getValue();

	Input setValue(String value);

}
