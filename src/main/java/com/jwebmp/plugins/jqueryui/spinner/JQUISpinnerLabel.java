package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISpinnerLabel<J extends JQUISpinnerLabel<J>>
		extends Label<J>
		implements JQUISpinnerChildren
{


	/**
	 * A specific label for the spinner
	 */
	public JQUISpinnerLabel()
	{

	}

	/**
	 * A specific label for the spinner
	 *
	 * @param label
	 */
	public JQUISpinnerLabel(String label)
	{
		super(label);
	}

	/**
	 * A specific label for the spinner
	 *
	 * @param label
	 * @param forInputComponent
	 */
	public JQUISpinnerLabel(String label, Input forInputComponent)
	{
		super(label, forInputComponent);
	}

}
