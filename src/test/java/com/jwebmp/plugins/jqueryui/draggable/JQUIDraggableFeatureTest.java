package com.jwebmp.plugins.jqueryui.draggable;

import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import org.junit.jupiter.api.Test;

class JQUIDraggableFeatureTest
{

	@Test
	void getOptions()
	{
		JQUIDraggable draggable = new JQUIDraggable();
		draggable.getFeature()
		         .getOptions()
		         .setCursor(Cursors.Crosshair);
		System.out.println(draggable.renderJavascript());
	}
}
