package com.jwebmp.plugins.jqueryui.accordion;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.accordion.options.JQUIAccordionOptions;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author MMagon
 */
public class JQUIAccordionFeature
		extends Feature<GlobalFeatures, JQUIAccordionOptions<?>, JQUIAccordionFeature>
{


	private final JQUIAccordion<?> accordion;

	/**
	 * The options for the accordion
	 */
	private JQUIAccordionOptions<?> options;

	public JQUIAccordionFeature(JQUIAccordion <?>accordion)
	{
		super("JWAccordianFeature");
		this.accordion = accordion;
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
	 * Never null
	 * <p>
	 *
	 * @return
	 */
	@Override
	@NotNull
	public final JQUIAccordionOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIAccordionOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String additionalString = accordion.getJQueryID() + "accordion(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON + getNewLine();
		addQuery(additionalString);
	}
}
