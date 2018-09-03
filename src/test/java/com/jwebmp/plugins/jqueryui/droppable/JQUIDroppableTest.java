package com.jwebmp.plugins.jqueryui.droppable;

import com.jwebmp.core.CSSComponent;
import com.jwebmp.plugins.jqueryui.draggable.JQUIDraggable;
import org.junit.jupiter.api.Test;

class JQUIDroppableTest
{

	@Test
	void getOptions()
	{
		CSSComponent draggables = new CSSComponent("dragMeToTheDroppable");

		JQUIDraggable dragWithDrop = new JQUIDraggable<>().addClass(draggables);
		JQUIDroppable droppable = new JQUIDroppable();
		droppable.getOptions()
		         .setAccept(draggables);
		System.out.println(droppable.toString(0));
	}
}
