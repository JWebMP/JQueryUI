package com.jwebmp.plugins.jqueryui.slider;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.plugins.jqueryui.slider.options.JQUISliderOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUISliderFeature<J extends JQUISliderFeature<J>>
		extends Feature<GlobalFeatures, JQUISliderOptions<?>, J>
{
	/**
	 * The actual slider for the menu
	 */
	private final JQUISlider<?> selectMenu;
	/**
	 * The options for the select menu
	 */
	private JQUISliderOptions<?> options;

	/**
	 * Constructs a new slider
	 *
	 * @param selectMenu
	 */
	public JQUISliderFeature(JQUISlider<?> selectMenu)
	{
		super("JWPSelectMenuFeature");
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
	public JQUISliderOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUISliderOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(selectMenu.getJQueryID() + "slider(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
