package com.jwebmp.plugins.jqueryui.progressbar;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.progressbar.options.JQUIProgressBarOptions;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIProgressBarFeature<J extends JQUIProgressBarFeature<J>>
		extends Feature<GlobalFeatures, JQUIProgressBarOptions<?>, J>
{


	private final JQUIProgressBar<?> progressBar;
	private JQUIProgressBarOptions<?> options;

	/**
	 * Constructs a new progress bar
	 *
	 * @param progressBar
	 */
	public JQUIProgressBarFeature(JQUIProgressBar<?> progressBar)
	{
		super("JWProgressBarFeature");
		this.progressBar = progressBar;
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
	public JQUIProgressBarOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIProgressBarOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(progressBar.getJQueryID() + "progressbar(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
