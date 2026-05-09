package com.jwebmp.plugins.jqueryui.autocomplete;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.autocomplete.options.JQUIAutoCompleteOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author MMagon
 * @version 1.0
 * @since 30 Mar 2013
 */
public class JQUIAutoCompleteFeature<J extends JQUIAutoCompleteFeature<J>>
		extends Feature<GlobalFeatures, JQUIAutoCompleteOptions<?>, J>
{


	/**
	 * The component to display the list at
	 */
	@JsonIgnore
	private final Input<?,?> menuDisplayAtComponent;
	/**
	 * Options
	 */
	@JsonIgnore
	private JQUIAutoCompleteOptions<?> options;

	/**
	 * Constructs a new Auto Complete feature
	 *
	 * @param menuDisplayAtComponent
	 * 		The component to display at
	 */
	public JQUIAutoCompleteFeature(Input<?,?> menuDisplayAtComponent)
	{
		super("JWAutoCompleteFeature");
		this.menuDisplayAtComponent = menuDisplayAtComponent;
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
	 * Returns an instance of the auto complete options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIAutoCompleteOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIAutoCompleteOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(menuDisplayAtComponent.getJQueryID() + "autocomplete(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine());
	}
}
