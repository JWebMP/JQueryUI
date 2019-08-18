package com.jwebmp.plugins.jqueryui.dialog;

import com.jwebmp.core.base.html.Div;
import org.junit.jupiter.api.Test;

class JQUIDialogTest
{

	@SuppressWarnings("unchecked")
	@Test
	void getOptions()
	{
		JQUIDialog dialog = new JQUIDialog("This is the title");
		dialog.getOptions()
		      .setAutoOpen(true)
		      .setCloseText("&times;")
		      .setCloseOnEscape(true)
		      .setModal(true)
		      .setResizable(true)
		      .setShow(true);

		dialog.add(new  Div<>().add("This can be anything"));
	}
}
