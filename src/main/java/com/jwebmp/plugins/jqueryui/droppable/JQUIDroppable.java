package com.jwebmp.plugins.jqueryui.droppable;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.IJQUIDroppable;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableChildren;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableEvents;
import com.jwebmp.plugins.jqueryui.droppable.interfaces.JQUIDroppableFeatures;
import com.jwebmp.plugins.jqueryui.droppable.options.JQUIDroppableOptions;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
@ComponentInformation(name = "JQuery UI Droppable",
		description = "Enable any DOM element to be droppable, a target for draggable " + "elements.",
		url = "http://jqueryui.com/droppable/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIDroppable
		extends Div<JQUIDroppableChildren, NoAttributes, JQUIDroppableFeatures, JQUIDroppableEvents, JQUIDroppable>
		implements IJQUIDroppable
{


	private JQUIDroppableFeature<?> feature;

	public JQUIDroppable()
	{
		addFeature(getFeature());
	}

	@NotNull
	public final JQUIDroppableFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIDroppableFeature<>(this);
		}
		return feature;
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
		return getFeature().getOptions();
	}

	/**
	 * Neater View
	 *
	 * @return
	 */
	public IJQUIDroppable asMe()
	{
		return this;
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
}
