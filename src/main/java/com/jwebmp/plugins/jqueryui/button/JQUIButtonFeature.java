package com.jwebmp.plugins.jqueryui.button;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.button.options.JQUIButtonOptions;
import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;


/**
 * The JavaScript implementation of the JWButton
 *
 * @author MMagon
 * @version 1.0
 * @since 09 Mar 2013
 */
public class JQUIButtonFeature<J extends JQUIButtonFeature<J>>
		extends Feature<GlobalFeatures, JQUIButtonOptions<?>, J>
{


	/**
	 * The component that we are turning into a button
	 */
	private final IComponentHierarchyBase<?,?> comp;
	/**
	 * The specified options
	 */
	private JQUIButtonOptions<?> options;

	/**
	 * Turns a component into a button
	 * <p>
	 *
	 * @param comp
	 */
	public JQUIButtonFeature(IComponentHierarchyBase<?,?> comp)
	{
		super("JWButtonFeature");
		this.comp = comp;
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
	 * Returns the options for a button
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public JQUIButtonOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIButtonOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(comp.asBase().getJQueryID() + "button(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
