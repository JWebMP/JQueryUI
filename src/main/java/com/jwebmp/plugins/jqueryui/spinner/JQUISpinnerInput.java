package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUISpinnerInput<J extends JQUISpinnerInput<J, A>, A extends Enum<?> & AttributeDefinitions>
		extends Input<A, J>
		implements JQUISpinnerChildren
{


	/**
	 * The spinner input
	 */
	public JQUISpinnerInput()
	{
		//Nothing Needed
	}
}
