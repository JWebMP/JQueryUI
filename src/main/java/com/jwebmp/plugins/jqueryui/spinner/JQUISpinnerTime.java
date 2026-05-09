package com.jwebmp.plugins.jqueryui.spinner;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 9, 2015
 */
public final class JQUISpinnerTime<J extends JQUISpinnerTime<J>>
		extends JQUISpinner<J>
{
	/**
	 * The spinner feature
	 */
	private JQUISpinnerTimeFeature<?> feature;

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 */
	public JQUISpinnerTime()
	{
		this(null);
	}

	/**
	 * Constructs a new spinner paragraph object
	 * <p>
	 *
	 * @param labelText
	 */
	public JQUISpinnerTime(String labelText)
	{
		super(labelText);
		getFeatures().clear();
		addFeature(getTimeFeature());
	}

	public JQUISpinnerTimeFeature<?> getTimeFeature()
	{
		if (feature == null)
		{
			feature = new JQUISpinnerTimeFeature<>(getInput());
		}
		return feature;
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
