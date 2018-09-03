package com.jwebmp.plugins.jqueryui.menu;

import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.servlets.enumarations.Orientation;
import org.junit.jupiter.api.Test;

class JQUIMenuTest
{

	@Test
	void getOptions()
	{
		JQUIMenu<?> menu = new JQUIMenu(Orientation.HORIZONTAL);
		menu.add(new JQUIMenuGroup<>().setText("Group 1")
		                              .add(new JQUIMenuItem<>("Item 1"))
		                              .add(new JQUIMenuItem<>().add(new Italic<>().addClass("icon?")
		                                                                          .setText("Icon Label..."))));

	}
}
