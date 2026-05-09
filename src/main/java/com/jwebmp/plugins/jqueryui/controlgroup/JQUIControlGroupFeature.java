package com.jwebmp.plugins.jqueryui.controlgroup;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIControlGroupFeature<J extends JQUIControlGroupFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	private final IComponentHierarchyBase<?,?> checkBoxGroup;

	/**
	 * Configures a new check box group
	 * <p>
	 *
	 * @param checkBoxGroup
	 * 		The group to apply to
	 */
	public JQUIControlGroupFeature(IComponentHierarchyBase<?,?> checkBoxGroup)
	{
		super("JWCheckBoxGroupFeature");
		this.checkBoxGroup = checkBoxGroup;
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
	public void assignFunctionsToComponent()
	{
		addQuery(checkBoxGroup.asBase().getJQueryID() + "controlgroup({});");
	}
}
