package com.jwebmp.plugins.jqueryui.selectable;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.selectable.options.JQUISelectableOptions;

/**
 * Handles selectable objects.
 * <p>
 * Use the mouse to select elements, individually or in a group.
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/05/16
 */
public class JQUISelectableFeature<J extends JQUISelectableFeature<J>>
		extends Feature<GlobalFeatures, JQUISelectableOptions<?>, J>
{
	private JQUISelectableOptions<?> options;
	
	/**
	 * Construct a new instance of a selectable feature Sets name to JWSelectableFeature
	 *
	 * @param component The component to assign the feature to
	 */
	public JQUISelectableFeature(IComponentHierarchyBase<?, ?> component)
	{
		super("JWSelectableFeature");
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
	public JQUISelectableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISelectableOptions<>();
		}
		return options;
	}
	
	/**
	 * The JQuery String
	 * <p>
	 */
	@Override
	public void assignFunctionsToComponent()
	{
		String selectableString = getComponent().asBase()
		                                        .getJQueryID() + "selectable(" + getOptions().toString() +
				");" +
				getNewLine();
		addQuery(selectableString);
	}
}
