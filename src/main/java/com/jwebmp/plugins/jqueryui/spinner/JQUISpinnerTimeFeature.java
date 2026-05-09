package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.spinner.options.JQUISpinnerOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * @since Mar 8, 2015
 */
public class JQUISpinnerTimeFeature<J extends JQUISpinnerTimeFeature<J>>
		extends Feature<GlobalFeatures, JQUISpinnerOptions<?>, J>
{
	/**
	 * The component for the time feature
	 */
	private final IComponentHierarchyBase<?, ?> selectMenu;
	/**
	 * The options for the time spinner
	 */
	private JQUISpinnerOptions<?> options;
	
	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISpinnerTimeFeature(IComponentHierarchyBase<?, ?> selectMenu)
	{
		super("JWSpinnerTimeFeature");
		this.selectMenu = selectMenu;
		setComponent(selectMenu);
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
	
	/**
	 * Returns the options associated with the Spinner Object
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUISpinnerOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISpinnerOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.asBase()
		                   .getJQueryID() + "timespinner(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
