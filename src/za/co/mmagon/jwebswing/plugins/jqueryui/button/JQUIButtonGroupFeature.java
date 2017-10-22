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
package za.co.mmagon.jwebswing.plugins.jqueryui.button;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIButtonGroupFeature extends Feature<JQUIButtonGroupOptions, JQUIButtonGroupFeature> implements JQUIButtonFeatures
{

	private static final long serialVersionUID = 1L;

	private final Component buttonGroup;
	private JQUIButtonGroupOptions buttongGroupOptions;

	/**
	 * Configures a new check box group
	 * <p>
	 *
	 * @param buttonGroup
	 * 		The group to apply to
	 */
	public JQUIButtonGroupFeature(Component buttonGroup)
	{
		super("JWCheckBoxGroupFeature");
		this.buttonGroup = buttonGroup;
		getJavascriptReferences().add(JQUIReferencePool.Button.getJavaScriptReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{

		addQuery(buttonGroup.getJQueryID() + "buttonset(" + getOptions() + ");" + getNewLine());

	}

	/**
	 * Returns the button group options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIButtonGroupOptions getOptions()
	{
		if (buttongGroupOptions == null)
		{
			buttongGroupOptions = new JQUIButtonGroupOptions();
		}
		return buttongGroupOptions;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIButtonGroupFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIButtonGroupFeature that = (JQUIButtonGroupFeature) o;

		if (!buttonGroup.equals(that.buttonGroup))
		{
			return false;
		}
		return buttongGroupOptions != null ? buttongGroupOptions.equals(that.buttongGroupOptions) : that.buttongGroupOptions == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + buttonGroup.hashCode();
		result = 31 * result + (buttongGroupOptions != null ? buttongGroupOptions.hashCode() : 0);
		return result;
	}
}
