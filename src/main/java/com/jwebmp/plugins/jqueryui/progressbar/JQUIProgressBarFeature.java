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
package com.jwebmp.plugins.jqueryui.progressbar;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.progressbar.options.JQUIProgressBarOptions;

import javax.validation.constraints.NotNull;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIProgressBarFeature<J extends JQUIProgressBarFeature<J>>
		extends Feature<GlobalFeatures, JQUIProgressBarOptions, J>
{


	private final JQUIProgressBar progressBar;
	private JQUIProgressBarOptions<?> options;

	/**
	 * Constructs a new progress bar
	 *
	 * @param progressBar
	 */
	public JQUIProgressBarFeature(JQUIProgressBar progressBar)
	{
		super("JWProgressBarFeature");
		this.progressBar = progressBar;
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

	@Override
	@NotNull
	public JQUIProgressBarOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIProgressBarOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(progressBar.getJQueryID() + "progressbar(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
