package com.jwebmp.plugins.jqueryui.dialog;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Implements the JQuery UI Dialog
 *
 * @author MMagon
 * @version 1.0
 * @since 28 Mar 2013
 */
public class JQUIDialogFeature<J extends JQUIDialogFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>

{
	private final JQUIDialog<?> panel;

	public JQUIDialogFeature(JQUIDialog<?> panel)
	{
		super("JWDialog");
		this.panel = panel;
	}

	/**
	 * Returns the panel associated with this dialog
	 * <p>
	 *
	 * @return
	 */
	public JQUIDialog<?> getPanel()
	{
		return panel;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return equals(o);
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String sb = panel.getJQueryID() +
				"dialog(" +
				panel.getOptions() +
				");" +
				getNewLine();
		addQuery(sb);
	}
}
