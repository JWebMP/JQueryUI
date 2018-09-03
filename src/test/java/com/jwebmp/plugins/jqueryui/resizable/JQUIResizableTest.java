package com.jwebmp.plugins.jqueryui.resizable;

import com.jwebmp.core.base.html.Span;
import org.junit.jupiter.api.Test;

class JQUIResizableTest
{

	@Test
	void getOptions()
	{
		JQUIResizable resizable = new JQUIResizable();
		resizable.getOptions()
		         .setAnimate(true)
		         .setAnimateDuration(6000)
		         .setGhost(true);

		Span anything = new Span();
		anything.addFeature(new JQUIResizableFeature(anything));

		System.out.println(resizable);
		System.out.println(resizable.renderJavascript());
	}
}
