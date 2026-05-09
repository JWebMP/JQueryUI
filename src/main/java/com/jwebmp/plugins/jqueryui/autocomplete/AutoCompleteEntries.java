package com.jwebmp.plugins.jqueryui.autocomplete;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * Specifies a single entry for a JQUI Auto Complete Moved from inner class to object
 *
 * @author GedMarc
 * @since 22 Feb 2016
 */
public class AutoCompleteEntries<J extends AutoCompleteEntries<J>>
		extends JavaScriptPart<J>
{


	private String label;
	private String value;
	private String category;

	/**
	 * Creates a label only auto complete entry
	 *
	 * @param label
	 */
	public AutoCompleteEntries(String label)
	{
		this.label = label;
	}

	/**
	 * Creates a label only with custom value auto complete entry
	 *
	 * @param label
	 * @param value
	 */
	public AutoCompleteEntries(String label, String value)
	{
		this.label = label;
		this.value = value;
	}

	/**
	 * Creates an auto complete entry that has categories
	 *
	 * @param label
	 * @param value
	 * @param category
	 */
	public AutoCompleteEntries(String label, String value, String category)
	{
		this.label = label;
		this.value = value;
		this.category = category;
	}

	/**
	 * Returns the label
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets the label
	 *
	 * @param label
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * Gets the category
	 *
	 * @return
	 */
	public String getCategory()
	{
		return category;
	}

	/**
	 * Sets the category
	 *
	 * @param category
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCategory(String category)
	{
		this.category = category;
		return (J) this;
	}

	/**
	 * Gets the value for this object
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value for this object
	 *
	 * @param value
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setValue(String value)
	{
		this.value = value;
		return (J) this;
	}

}
