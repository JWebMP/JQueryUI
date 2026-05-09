package com.jwebmp.plugins.jqueryui.progressbar.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIProgressBarOptions<J extends JQUIProgressBarOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * if is disabled
	 */
	private Boolean disabled;
	/**
	 * the max value
	 */
	private Integer max;
	/**
	 * The actual value
	 */
	private Integer value;

	/**
	 *
	 */
	public JQUIProgressBarOptions()
	{
		//Nothing needed here
	}

	/**
	 * Returns if the progress bar is disabled or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Returns if the progress bar is disabled or not
	 * <p>
	 *
	 * @param disabled
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Gets the max
	 * <p>
	 *
	 * @return
	 */
	public Integer getMax()
	{
		return max;
	}

	/**
	 * Sets the maximum value
	 * <p>
	 *
	 * @param max
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMax(Integer max)
	{
		this.max = max;
		return (J) this;
	}

	/**
	 * Gets the current value
	 * <p>
	 *
	 * @return
	 */
	public Integer getValue()
	{
		return value;
	}

	/**
	 * Sets the current value
	 * <p>
	 *
	 * @param value
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setValue(Integer value)
	{
		this.value = value;
		return (J) this;
	}

}
