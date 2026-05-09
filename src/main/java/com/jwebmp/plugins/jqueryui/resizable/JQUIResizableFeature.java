package com.jwebmp.plugins.jqueryui.resizable;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.resizable.options.JQUIResizableOptions;

/**
 * Controls items being resizable
 *
 * @author GedMarc
 * @since Forever
 */
public class JQUIResizableFeature<J extends JQUIResizableFeature<J>>
		extends Feature<GlobalFeatures, JQUIResizableOptions<?>, J>
{
	
	
	private JQUIResizableOptions<?> options;
	
	public JQUIResizableFeature(IComponentHierarchyBase<?, ?> component)
	{
		super("JWResizableFeature");
		setComponent(component);
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
	public JQUIResizableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIResizableOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		String resizableString = getComponent().asBase()
		                                       .getJQueryID() + "resizable(" + getOptions().toString() +
				");" +
				getNewLine();
		addQuery(resizableString);
	}
}
