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
package za.co.mmagon.jwebswing.plugins.jqueryui.controlgroup;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIControlGroupFeature extends Feature<JavaScriptPart, JQUIControlGroupFeature>
{

	private static final long serialVersionUID = 1L;

	private final Component checkBoxGroup;

	/**
	 * Configures a new check box group
	 * <p>
	 *
	 * @param checkBoxGroup
	 * 		The group to apply to
	 */
	public JQUIControlGroupFeature(Component checkBoxGroup)
	{
		super("JWCheckBoxGroupFeature");
		this.checkBoxGroup = checkBoxGroup;
		getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
		getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
		getCssReferences().add(JQUIReferencePool.Core.getCssReference());
		getCssReferences().add(JQUIReferencePool.Widget.getCssReference());
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(checkBoxGroup.getJQueryID() + "controlgroup({});");
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof JQUIControlGroupFeature))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		JQUIControlGroupFeature that = (JQUIControlGroupFeature) o;

		return checkBoxGroup != null ? checkBoxGroup.equals(that.checkBoxGroup) : that.checkBoxGroup == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (checkBoxGroup != null ? checkBoxGroup.hashCode() : 0);
		return result;
	}
}
