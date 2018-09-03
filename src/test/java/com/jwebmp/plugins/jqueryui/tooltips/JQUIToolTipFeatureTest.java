package com.jwebmp.plugins.jqueryui.tooltips;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.H6;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationHorizontal;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationVertical;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;
import org.junit.jupiter.api.Test;

class JQUIToolTipFeatureTest
{

	@Test
	void getOptions()
	{
		Div d = new Div();
		d.addFeature(new JQUIToolTipFeature(d, "Tooltip Text"));
		d.addFeature(new JQUIToolTipFeature(d, new Div<>().add(new H6("Custom Content can be anything"))));

		new JQUIToolTipFeature(d, "Text").getOptions()
		                                 .setTrack(true)
		                                 .setPosition(new PositionOptions<>().setOf("body")
		                                                                     .setAtX(PositionLocationHorizontal.Center)
		                                                                     .setAtY(PositionLocationVertical.center));
	}
}
