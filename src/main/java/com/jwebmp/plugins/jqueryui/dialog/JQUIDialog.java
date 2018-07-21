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
package com.jwebmp.plugins.jqueryui.dialog;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.IJQUIDialog;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogChildren;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogFeatures;
import com.jwebmp.plugins.jqueryui.dialog.options.JQUIDialogOptions;

/**
 * A JQuery UI Panel with all bells
 *
 * @author Marc Magon
 */
@ComponentInformation(name = "JQuery UI Dialog",
		description = "The basic dialog window is an overlay positioned within the viewport and " +
		              "" +
		              "" +
		              "" +
		              "" +
		              "is protected from page content (like select " +
		              "elements) " +
		              "shining" +
		              " " +
		              "through with an iframe. It has " +
		              "a " +
		              "title bar and a" +
		              " content " +
		              "area, and" +
		              " can be " +
		              "moved, " +
		              "resized and closed with" +
		              " the 'x' icon " +
		              "by " +
		              "default.",
		url = "http://jqueryui.com/dialog/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIDialog<J extends JQUIDialog<J>>
		extends Div<JQUIDialogChildren, NoAttributes, JQUIDialogFeatures, JQUIDialogEvents, J>
		implements IJQUIDialog
{

	private static final long serialVersionUID = 1L;

	private final JQUIDialogFeature<?> jwDialogFeature;
	private JQUIDialogOptions<?> options;

	/**
	 * Constructs a new JQuery Dialog with the given title as an attribute
	 * <p>
	 *
	 * @param title
	 * 		The title to build with
	 */
	public JQUIDialog(String title)
	{
		jwDialogFeature = new JQUIDialogFeature<>(this);
		addFeature(jwDialogFeature);
		addAttribute(GlobalAttributes.Title, title);
	}

	/**
	 * Instantiates the options on call
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDialogOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIDialogOptions<>();
		}
		return options;
	}

	/**
	 * Neater view
	 *
	 * @return
	 */
	public IJQUIDialog asMe()
	{
		return this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
