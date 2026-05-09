package com.jwebmp.plugins.jqueryui.position;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.position.options.PositionOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author MMagon
 * 		<p>
 * 		<p>
 * @version 1.0
 * @since Forever
 */
public class JQUIPositionFeature<J extends JQUIPositionFeature<J>>
		extends Feature<GlobalFeatures, JavaScriptPart<?>, J>
{
	private final PositionOptions<?> positionOptions;

	public JQUIPositionFeature(IComponentHierarchyBase<?,?> positionComponent, PositionOptions<?> positionOptions)
	{
		super("JWPosition");
		setComponent(positionComponent);
		this.positionOptions = positionOptions;
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

	@Override
	public void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase().getJQueryID() + "position(" + positionOptions.toString() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
