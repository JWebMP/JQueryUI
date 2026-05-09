package com.jwebmp.plugins.jqueryui.checkboxradio;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUICheckBoxRadioFeature<J extends JQUICheckBoxRadioFeature<J>>
		extends Feature<GlobalFeatures, JQUICheckBoxRadioOptions<?>, J>
{
	private JQUICheckBoxRadioOptions<?> options;
	
	public JQUICheckBoxRadioFeature(IComponentHierarchyBase<?, ?> component)
	{
		super("JQUICHeckBoxRadioFeature");
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
	@NotNull
	public JQUICheckBoxRadioOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUICheckBoxRadioOptions<>();
		}
		return options;
	}
	
	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase()
		                       .getJQueryID()
				         + "checkboxradio(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
