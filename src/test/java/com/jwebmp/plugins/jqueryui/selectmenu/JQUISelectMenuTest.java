package com.jwebmp.plugins.jqueryui.selectmenu;

import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationHorizontal;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationVertical;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;
import org.junit.jupiter.api.Test;

class JQUISelectMenuTest
{

	@Test
	void getOptions()
	{
		JQUISelectMenu<?> selectMenu = new JQUISelectMenu<>();
		selectMenu.getOptions()
		          .setWidth(50)
		          .setPositionOptions(new PositionOptions<>().setAtX(PositionLocationHorizontal.Center)
		                                                     .setAtY(PositionLocationVertical.top)
		                                                     .setOf(".parent"));
		selectMenu.add(new JQUISelectMenuGroup<>("Group 1")
				               .add(new JQUISelectMenuItem("Item 1").setSelected(true)));
	}
}
