package com.jwebmp.plugins.jqueryui.slider;

import com.jwebmp.core.base.servlets.enumarations.Orientation;
import org.junit.jupiter.api.Test;

class JQUISliderTest
{

	@Test
	void getOptions()
	{
		JQUISlider<?> slider = new JQUISlider<>();
		slider.getOptions()
		      .setAnimate(500)
		      .setMax(2600)
		      .setMin(100)
		      .setOrientation(Orientation.HORIZONTAL)
		      .setStep(5);
	}
}
