package com.jwebmp.plugins.jqueryui.sortable;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.sortable.options.JQUISortableOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * @since Mar 8, 2015
 */
public class JQUISortableFeature<J extends JQUISortableFeature<J>>
		extends Feature<GlobalFeatures, JQUISortableOptions<?>, J>
{
	/**
	 * The sortable linked component
	 */
	private final IComponentHierarchyBase<?, ?> selectMenu;
	/**
	 * The options for the sortablke feature
	 */
	private JQUISortableOptions<?> options;
	
	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISortableFeature(IComponentHierarchyBase<?, ?> selectMenu)
	{
		super("JWSortableFeature");
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
	
	@Override
	public JQUISortableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISortableOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.asBase()
		                   .getJQueryID() + "sortable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
