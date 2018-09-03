package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.plugins.globalize.cultures.GlobalizeCultures;
import com.jwebmp.plugins.jqueryui.spinner.options.SpinnerIconOptions;
import org.junit.jupiter.api.Test;

class JQUISpinnerTest
{

	@Test
	void getOptions()
	{
		JQUISpinner<?> spinner = new JQUISpinner<>();
		spinner.getLabel()
		       .setText("Spinner Label");
		spinner.getOptions()
		       .setStep(2.5)
		       .setIcons(new SpinnerIconOptions<>().setUp("class-up")
		                                           .setDown("class-down"));
		spinner.setHeaderText("Header text");

		spinner.addGlobalization(GlobalizeCultures.fr);
		spinner.getOptions()
		       .setCulture(GlobalizeCultures.fr);

	}
}
