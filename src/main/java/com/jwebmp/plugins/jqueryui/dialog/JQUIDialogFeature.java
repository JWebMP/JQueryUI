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
package com.jwebmp.plugins.jqueryui.dialog;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Implements the JQuery UI Dialog
 *
 * @author MMagon
 * @version 1.0
 * @since 28 Mar 2013
 */
public class JQUIDialogFeature<J extends JQUIDialogFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>

{
	private final JQUIDialog<?> panel;

	public JQUIDialogFeature(JQUIDialog<?> panel)
	{
		super("JWDialog");
		this.panel = panel;
	}

	/**
	 * Returns the panel associated with this dialog
	 * <p>
	 *
	 * @return
	 */
	public JQUIDialog<?> getPanel()
	{
		return panel;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return equals(o);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String sb = panel.getJQueryID() +
				"dialog(" +
				panel.getOptions() +
				");" +
				getNewLine();
		addQuery(sb);
	}
}
