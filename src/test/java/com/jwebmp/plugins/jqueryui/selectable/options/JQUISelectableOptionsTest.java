package com.jwebmp.plugins.jqueryui.selectable.options;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.htmlbuilder.javascript.JavascriptLiteralFunction;
import com.jwebmp.plugins.jqueryui.selectable.JQUISelectableFeature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JQUISelectableOptionsTest
{
	@Test
	public void testSelectedOptionsTag()
	{
		DivSimple<?> d = new DivSimple<>();
		JQUISelectableFeature<?> feature = new JQUISelectableFeature<>(d);
		feature.getOptions().setSelected(new JavascriptLiteralFunction()
		{
			{
				getFunctionArugments().add("e");
				getFunctionArugments().add("ui");
			}
			
			@Override
			public StringBuilder getLiteralFunction()
			{
				return new StringBuilder("alert('please please please');");
			}
			
			@Override
			public String toString()
			{
				return super.toString();
			}
		});
		System.out.println(d.renderJavascript());
		
		
	}
}