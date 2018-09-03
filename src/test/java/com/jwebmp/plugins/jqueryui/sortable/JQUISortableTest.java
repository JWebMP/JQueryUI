package com.jwebmp.plugins.jqueryui.sortable;

import com.jwebmp.core.htmlbuilder.css.displays.Cursors;
import com.jwebmp.plugins.jqueryui.draggable.enumerations.Axis;
import org.junit.jupiter.api.Test;

class JQUISortableTest
{

	@Test
	void getOptions()
	{
		JQUISortable sortable = new JQUISortable();
		sortable.getOptions()
		        .setAxis(Axis.X)
		        .setCursor(Cursors.Move)
		        .setDropOnEmpty(true)
		        .setGrid(new Integer[]{1, 1});
		sortable.add(new JQUISortableItem<>().setText("Do anything..."));
	}
}
