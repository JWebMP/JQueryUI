package com.jwebmp.plugins.jqueryui.datepicker;

import org.junit.jupiter.api.Test;

class JQUIDatePickerTest
{

	@Test
	void test()
	{
		JQUIDatePicker datePicker = new JQUIDatePicker();
		datePicker.getInputFeature()
		          .getOptions()
		          .setAutoSize(true)
		          .setCurrentText("Click to open date picker");

		datePicker.getOptions()
		          .setButtonText("Click to open")
		          .setMaxDate("+1m +7d")
		          .setCloseText("hide")
		          .setFirstDay(1)
		          .setDateFormat("yyyy/MM/dd");

	}
}
