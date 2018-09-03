package com.jwebmp.plugins.jqueryui.controlgroup;

import com.jwebmp.core.base.html.Option;
import com.jwebmp.core.base.html.OptionGroup;
import com.jwebmp.core.base.html.Select;
import com.jwebmp.core.base.html.inputs.InputEmailType;
import com.jwebmp.core.base.html.inputs.InputPasswordType;
import com.jwebmp.core.base.html.inputs.InputTextType;
import org.junit.jupiter.api.Test;

class JQUIControlGroupTest
{

	@Test
	public void test()
	{
		JQUIControlGroup<?> group = new JQUIControlGroup<>();
		group.add(new InputTextType().bind("bind.me"));
		group.add(new InputPasswordType().bind("bind.me"));
		group.add(new InputEmailType().bind("bind.me"));
		group.add(new Select<>().bind("bind.me")
		                        .add(new Option<>("Option1"))
		                        .add(new Option("Option 2"))
		                        .add(new OptionGroup("Option Group")));
	}
}
