/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import za.co.mmagon.jwebswing.annotations.SiteBinder;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.AutoCompleteEntries;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.AutoCompleteEntrySet;
import za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete.JQUIAutoComplete;
import za.co.mmagon.jwebswing.plugins.jqueryui.position.options.PositionOptions;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIAutoCompleteOptions<J extends JQUIAutoCompleteOptions<J>> extends JavaScriptPart<J>
{

	/**
	 * Version 1
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * appendTo Type: Selector Default: null
	 * <p>
	 * Which element the menu should be appended to. When the value is null, the parents of the input field will be checked for a class of
	 * ui-front. If an element with the ui-front class is found, the
	 * menu will be appended to that element. Regardless of the value, if no element is found, the menu will be appended to the body.
	 * Note: The appendTo option should not be changed while the
	 * suggestions menu is open.
	 * <p>
	 */
	private String appendTo;

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
	@JsonIgnore
	private List<AutoCompleteEntries<?>> source;
	/**
	 * If set to true the first item will automatically be focused when the menu is shown. Code examples:
	 * <p>
	 * Initialize the autocomplete with the autoFocus option specified: 1 2 3
	 * <p>
	 * <p>
	 * $( ".selector" ).autocomplete({ autoFocus: true });
	 */
	private Boolean autoFocus;

	/**
	 * delay
	 * <p>
	 * Type: Integer
	 * <p>
	 * Default: 300
	 * <p>
	 * The delay in milliseconds between when a keystroke occurs and when a search is performed
	 * <p>
	 * A zero-delay makes sense for local data (more responsive), but can produce a lot of load for remote data, while being less
	 * responsive. Code examples:
	 * <p>
	 * Initialize the autocomplete with the delay option specified:
	 */
	private Integer delay;
	/**
	 * disabled
	 * <p>
	 * Type: Boolean
	 * <p>
	 * Default: false
	 * <p>
	 * Disables the autocomplete if set to true.
	 * <p>
	 * Code examples:
	 * <p>
	 * <p>
	 * <p>
	 * Initialize the autocomplete with the disabled option specified: $( ".selector" ).autocomplete({ disabled: true });
	 */
	private Boolean disabled;
	/**
	 * minLength
	 * <p>
	 * Type: Integer
	 * <p>
	 * Default: 1
	 * <p>
	 * The minimum number of characters a user must type before a search is performed. Zero is useful for local data with just a few
	 * items, but a higher value should be used when a single character
	 * search could match a few thousand items.
	 * <p>
	 * Code examples:
	 * <p>
	 * <p>
	 * <p>
	 * Initialize the autocomplete with the minLength option specified:
	 * <p>
	 * $( ".selector" ).autocomplete({ minLength: 0 });
	 */
	private Integer minLength;
	/**
	 * position
	 * <p>
	 * Type: Object
	 * <p>
	 * Default: { my: "left top", at: "left bottom", collision: "none" }
	 * <p>
	 * Identifies the position of the suggestions menu in relation to the associated input element.
	 * <p>
	 * The of option defaults to the input element, but you can specify another element to position against. You can refer to the jQuery
	 * UI Position utility for more details about the various options.
	 * Code examples:
	 * <p>
	 * $( ".selector" ).autocomplete({ position: { my : "right top", at: "right bottom" } });
	 */
	private PositionOptions positionOptions;
	@JsonIgnore
	private boolean ajax;
	/**
	 * The source url location
	 */
	@JsonIgnore
	private String sourceUrl;
	/**
	 * The autoComplete location
	 */
	@JsonIgnore
	private JQUIAutoComplete autoComplete;

	/**
	 * Constructs a new Auto Complete Options Array
	 * <p>
	 */
	public JQUIAutoCompleteOptions()
	{
		//Nothing needed
	}

	/**
	 * appendTo Type: Selector Default: null
	 * <p>
	 * Which element the menu should be appended to. When the value is null, the parents of the input field will be checked for a class of
	 * ui-front. If an element with the ui-front class is found, the
	 * menu will be appended to that element. Regardless of the value, if no element is found, the menu will be appended to the body.
	 * Note: The appendTo option should not be changed while the
	 * suggestions menu is open.
	 *
	 * @return
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * appendTo Type: Selector Default: null
	 * <p>
	 * Which element the menu should be appended to. When the value is null, the parents of the input field will be checked for a class of
	 * ui-front. If an element with the ui-front class is found, the
	 * menu will be appended to that element. Regardless of the value, if no element is found, the menu will be appended to the body.
	 * Note: The appendTo option should not be changed while the
	 * suggestions menu is open.
	 *
	 * @param appendTo
	 * 		Sets the string to the #id
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(ComponentHierarchyBase appendTo)
	{
		this.appendTo = appendTo.getID(true);
		return (J) this;
	}

	/**
	 * appendTo Type: Selector Default: null
	 * <p>
	 * Which element the menu should be appended to. When the value is null, the parents of the input field will be checked for a class of
	 * ui-front. If an element with the ui-front class is found, the
	 * menu will be appended to that element. Regardless of the value, if no element is found, the menu will be appended to the body.
	 * Note: The appendTo option should not be changed while the
	 * suggestions menu is open.
	 *
	 * @param appendTo
	 * 		set the string to the # id
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAppendTo(String appendTo)
	{
		this.appendTo = appendTo;
		return (J) this;
	}

	/**
	 * Adds a label option that is grouped into a category
	 *
	 * @param label
	 * @param category
	 *
	 * @return
	 */
	public AutoCompleteEntries addOption(String label, String category)
	{
		return addOption(label, label, category);
	}

	/**
	 * Adds a label only option
	 *
	 * @param label
	 *
	 * @return
	 */
	public AutoCompleteEntries addOption(String label)
	{
		return addOption(label, null, null);
	}

	/**
	 * Adds a label with a value and category
	 *
	 * @param label
	 * @param value
	 * @param category
	 *
	 * @return
	 */
	public AutoCompleteEntries addOption(String label, String value, String category)
	{
		AutoCompleteEntries entry = new AutoCompleteEntries(label, value, category);
		getSource().add(entry);
		return entry;
	}

	/**
	 * Sets if the first item should be highlighted on opening
	 *
	 * @param autoFocus
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoFocus(Boolean autoFocus)
	{
		this.autoFocus = autoFocus;
		return (J) this;
	}

	/**
	 * Sets the delay to open
	 *
	 * @param delay
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDelay(Integer delay)
	{
		this.delay = delay;
		return (J) this;
	}

	/**
	 * Gets whether the first item should be highlighted on open
	 *
	 * @return
	 */
	public Boolean getAutoFocus()
	{
		return autoFocus;
	}

	/**
	 * Sets disabled or not
	 *
	 * @param disabled
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Gets the delay to open
	 *
	 * @return
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * sets the minimum length
	 *
	 * @param minLength
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMinLength(Integer minLength)
	{
		this.minLength = minLength;
		return (J) this;
	}

	/**
	 * gets disabled or not
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Gets the position of the auto complete box
	 *
	 * @return
	 */
	public PositionOptions getPositionOptions()
	{
		return positionOptions;
	}

	/**
	 * gets the minimum length
	 *
	 * @return
	 */
	public Integer getMinLength()
	{
		return minLength;
	}

	/**
	 * Sets the position of the auto complete box
	 *
	 * @param positionOptions
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPositionOptions(PositionOptions positionOptions)
	{
		this.positionOptions = positionOptions;
		return (J) this;
	}

	/**
	 * Renders the source string
	 *
	 * @return
	 */
	@JsonProperty("source")
	@JsonRawValue
	private String getSourceUrl()
	{
		if (isAjax())
		{
			return '"' + SiteBinder.getDataBindUrl(autoComplete) + '"';
		}
		else
		{
			AutoCompleteEntrySet set = new AutoCompleteEntrySet();
			set.getSource()
					.clear();
			set.getSource()
					.addAll(getSource());
			return set.toString();
		}
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
	@NotNull
	public List<AutoCompleteEntries<?>> getSource()
	{
		if (source == null)
		{
			source = new ArrayList<>();
		}
		return source;
	}

	/**
	 * Sets this source list
	 *
	 * @param source
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSource(List<AutoCompleteEntries<?>> source)
	{
		this.source = source;
		return (J) this;
	}

	/**
	 * If this auto complete uses ajax
	 *
	 * @return
	 */
	public boolean isAjax()
	{
		return ajax;
	}

	/**
	 * If the auto complete uses ajax
	 *
	 * @param ajax
	 * @param accordion
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAjax(boolean ajax, JQUIAutoComplete accordion)
	{
		this.ajax = ajax;
		this.autoComplete = accordion;
		return (J) this;
	}

	/**
	 * Returns the autoComplete
	 *
	 * @return
	 */
	public JQUIAutoComplete getAutoComplete()
	{
		return autoComplete;
	}

	/**
	 * Sets the referenced autoComplete
	 *
	 * @param autoComplete
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAutoComplete(JQUIAutoComplete autoComplete)
	{
		this.autoComplete = autoComplete;
		return (J) this;
	}

}
