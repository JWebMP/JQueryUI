package com.jwebmp.plugins.jqueryui.progressbar;

import org.junit.jupiter.api.Test;

class JQUIProgressBarTest
{

	@Test
	void getOptions()
	{
		JQUIProgressBar<?> progressBar = new JQUIProgressBar<>();
		progressBar.getOptions()
		           .setMax(100)
		           .setValue(50);

	}
}
