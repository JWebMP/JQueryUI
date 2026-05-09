package com.jwebmp.plugins.jqueryui.controlgroup;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
@ComponentInformation(name = "JQuery UI Control Group",
		description = "Groups multiple buttons and other widgets into one visual set.",
		url = "http://jqueryui.com/controlgroup/#default",
		wikiUrl = "https://github" + ".com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIControlGroup<J extends JQUIControlGroup<J>>
		extends DivSimple<J>
{


	/**
	 * Constructs a new control group div
	 */
	public JQUIControlGroup()
	{
		addFeature(new JQUIControlGroupFeature<>(this));
	}
}
