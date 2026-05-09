package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.selectmenu.options.JQUISelectMenuOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * @since Mar 8, 2015
 */
public class JQUISelectMenuFeature<J extends JQUISelectMenuFeature<J>>
		extends Feature<GlobalFeatures, JQUISelectMenuOptions<?>, J>
{
	/**
	 * The select menu's component
	 */
	private final IComponentHierarchyBase<?, ?> selectMenu;
	/**
	 * The options associated
	 */
	private JQUISelectMenuOptions<?> options;
	
	/**
	 * Constructs a new Select Menu Add Options or Option Groups to configure
	 *
	 * @param selectMenu Because off css classing
	 */
	public JQUISelectMenuFeature(IComponentHierarchyBase<?, ?> selectMenu)
	{
		super("JWSelectMenuFeature");
		this.selectMenu = selectMenu;
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
	public JQUISelectMenuOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISelectMenuOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.asBase()
		                   .getJQueryID() + "selectmenu(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
