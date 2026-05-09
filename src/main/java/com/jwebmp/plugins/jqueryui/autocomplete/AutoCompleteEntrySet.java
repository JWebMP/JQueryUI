package com.jwebmp.plugins.jqueryui.autocomplete;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The data auto complete entry set
 *
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class AutoCompleteEntrySet<J extends AutoCompleteEntries<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The available category selections
	 * <p>
	 * Array: An array can be used for local data. There are two supported formats:
	 * <p>
	 * An array of strings: [ "Choice1", "Choice2" ] An array of objects with label and value properties: [ { label: "Choice1", value:
	 * "value1" }, ... ]
	 * <p>
	 * The label property is displayed in the suggestion menu. The value will be inserted into the input element when a user selects an
	 * item. If just one property is specified, it will be used for
	 * both, e.g., if you provide only value properties, the value will also be used as the label.
	 */
	private Set<AutoCompleteEntries<?>> source;

	/**
	 * Constructs a default set
	 */
	public AutoCompleteEntrySet()
	{
		//Nothing needed
	}

	/**
	 * Array: An array can be used for local data. There are two supported formats:
	 * <p>
	 * An array of strings: [ "Choice1", "Choice2" ] An array of objects with label and value properties: [ { label: "Choice1", value:
	 * "value1" }, ... ]
	 * <p>
	 * The label property is displayed in the suggestion menu. The value will be inserted into the input element when a user selects an
	 * item. If just one property is specified, it will be used for
	 * both, e.g., if you provide only value properties, the value will also be used as the label.
	 *
	 * @return
	 */
	@JsonRawValue
	@JsonValue
	@NotNull
	public Set<AutoCompleteEntries<?>> getSource()
	{
		if (source == null)
		{
			source = new LinkedHashSet<>();
		}
		return source;
	}

}
