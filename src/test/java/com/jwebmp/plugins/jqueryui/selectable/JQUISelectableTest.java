package com.jwebmp.plugins.jqueryui.selectable;

import com.jwebmp.core.base.html.Div;
import org.junit.jupiter.api.Test;

class JQUISelectableTest
{

	@Test
	void getOptions()
	{
		JQUISelectable selectable = new JQUISelectable();
		selectable.getOptions()
		          .setAutoRefresh(true)
		          .setDelay(500)
		          .setDistance(20);

		Div anything = new Div();
		anything.addFeature(new JQUISelectableFeature(anything));
	}
}
