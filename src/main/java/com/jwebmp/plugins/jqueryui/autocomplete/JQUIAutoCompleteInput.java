package com.jwebmp.plugins.jqueryui.autocomplete;

import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteChildren;

/**
 * The input child accepted for ui auto complete
 *
 * @param <J>
 */
public class JQUIAutoCompleteInput<J extends JQUIAutoCompleteInput<J>>
		extends InputTextType<J>
		implements JQUIAutoCompleteChildren
{
}
