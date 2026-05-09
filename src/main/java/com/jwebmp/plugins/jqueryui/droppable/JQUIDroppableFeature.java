package com.jwebmp.plugins.jqueryui.droppable;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.droppable.options.JQUIDroppableOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * The droppable implementation
 * Create targets for draggable elements.
 * <p>
 * The jQuery UI Droppable plugin makes selected elements droppable (meaning they accept being dropped on by draggables).
 * You can specify which draggables each will accept.
 * <p>
 *
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since 2014/04/14
 */
public class JQUIDroppableFeature<J extends JQUIDroppableFeature<J>>
		extends Feature<GlobalFeatures, JQUIDroppableOptions<?>, J>
{

	private JQUIDroppableOptions<?> options;

	public JQUIDroppableFeature(IComponentHierarchyBase<?,?> componentFor)
	{
		super("JWDroppableFeature");
		setComponent(componentFor);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Returns the Droppable Options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public JQUIDroppableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIDroppableOptions<>();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID()
				         + "droppable(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
