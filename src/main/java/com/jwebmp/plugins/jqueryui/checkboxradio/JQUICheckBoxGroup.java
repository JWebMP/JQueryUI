package com.jwebmp.plugins.jqueryui.checkboxradio;

import com.jwebmp.core.base.html.FieldSet;
import com.jwebmp.core.base.html.Legend;
import com.jwebmp.plugins.jqueryui.controlgroup.JQUIControlGroupFeature;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUICheckBoxGroup<J extends JQUICheckBoxGroup<J>>
		extends FieldSet<J>
{


	private JQUIControlGroupFeature<?> feature;

	private String legendTitle;

	/**
	 * Constructs a new Check Box Group
	 */
	public JQUICheckBoxGroup()
	{
		addFeature(getFeature());
	}

	/**
	 * Returns this groups feature
	 * <p>
	 *
	 * @return
	 */
	public final JQUIControlGroupFeature<?> getFeature()
	{
		if (feature == null)
		{
			feature = new JQUIControlGroupFeature<>(this);
		}
		return feature;
	}

	/**
	 * Adds a new Check Box to the group
	 * <p>
	 *
	 * @param checkBox
	 * 		the check box to add
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J addCheckBox(JQUICheckBox<?> checkBox)
	{
		add(checkBox);
		return (J) this;
	}

	/**
	 * Sets the legend title
	 *
	 * @return
	 */
	public String getLegendTitle()
	{
		return legendTitle;
	}

	/**
	 * Sets the legend title
	 *
	 * @param legendTitle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLegendTitle(String legendTitle)
	{
		this.legendTitle = legendTitle;
		return (J) this;
	}

	@Override
	protected StringBuilder renderBeforeChildren()
	{
		Legend<?> leg = new Legend<>();
		leg.setText(legendTitle);
		leg.setTiny(true);
		return new StringBuilder().append(getCurrentTabIndents())
		                          .append(leg.toString(true))
		                          .append(getNewLine());
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
