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
package com.jwebmp.plugins.jqueryui.datepicker.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.easingeffects.JQEasingAnimationEffectsPart;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * THE Date picker options for JQUI
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JQUIDatePickerOptions<J extends JQUIDatePickerOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of
	 * the date within this field. Leave as blank for no alternate
	 * field.
	 */
	private String altField;
	/**
	 * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes,
	 * while a different format is actually sent behind the scenes. For a
	 * full list of the possible formats see the formatDate function
	 */
	private String altFormat;
	/**
	 * The text to display after each date field, e.g., to show the required format.
	 */
	private String appendText;
	/**
	 * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
	 */
	private Boolean autoSize;
	/**
	 * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText
	 * option becomes the alt value and is not directly displayed
	 */
	private String buttonImage;
	/**
	 * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the
	 * buttonImage option has also been set.
	 */
	private Boolean buttonImageOnly;
	/**
	 * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
	 */
	private String buttonText;
	/**
	 * Whether the month should be rendered as a dropdown instead of text.
	 */
	private Boolean changeMonth;
	/**
	 * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made
	 * available for selection.
	 */
	private Boolean changeYear;
	/**
	 * The text to display for the close link. Use the showButtonPanel option to display this button.
	 */
	private String closeText;
	/**
	 * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
	 */
	private Boolean constrainInput;
	/**
	 * The text to display for the current day link. Use the showButtonPanel option to display this button.
	 */
	private String currentText;
	/**
	 * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
	 */
	private String dateFormat;
	/**
	 * Default: [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ]
	 * <p>
	 * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
	 */
	private List<String> dayNames;
	/**
	 * Default: [ "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" ]
	 * <p>
	 * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.<p>
	 */
	private List<String> dayNamesMin;
	/**
	 * dayNamesShortType: Array<p>
	 * Default: [ "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" ]
	 * <p>
	 * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat option.<p>
	 */
	private List<String> dayNamesShort;
	/**
	 * Set the date to highlight on first opening if the field is blank.<p>
	 * Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7)
	 * <p>
	 * or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today
	 * .<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the default date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.
	 * <p>
	 * For example, "+1m +7d" represents one month and seven days from today
	 */
	private String defaultDate;
	/**
	 * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three
	 * predefined speeds ("slow", "normal", "fast").
	 */
	private Integer duration;
	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, etc.
	 */
	private Integer firstDay;
	/**
	 * When true, the current day link moves to the currently selected date instead of today.
	 */
	private Boolean gotoCurrent;
	/**
	 * Default: false<p>
	 * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options).
	 * <p>
	 * You can hide them altogether by setting this attribute to true.<p>
	 */
	private Boolean hideIfNoPrevNext;
	/**
	 * Whether the current language is drawn from right to left.
	 */
	private Boolean isRTL;
	/**
	 * The maximum selectable date. When set to null, there is no maximum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the maximum date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.<p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.<p>
	 * <p>
	 */
	private String maxDate;
	/**
	 * he minimum selectable date. When set to null, there is no minimum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the minimum date.
	 * <p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
	 * <p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.
	 * <p>
	 */
	private String minDate;
	/**
	 * Default: [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
	 * "December" ]
	 * <p>
	 * The list of full month names, for use as requested via the dateFormat option.<p>
	 */
	private List<String> monthNames;
	/**
	 * Default: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ]
	 * <p>
	 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.<p>
	 */
	private List<String> monthNamesShort;
	/**
	 * Default: false Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to
	 * display the target month names for example.
	 */
	private Boolean navigationAsDateFormat;
	/**
	 * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 */
	private String nextText;
	/**
	 * The number of months to show at once.
	 */
	private Integer numberOfMonths;
	/**
	 * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 */
	private String prevText;
	/**
	 * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths
	 * option is set to true.
	 */
	private Boolean selectOtherMonths;
	/**
	 * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y')
	 * .<p>
	 * Any dates entered with a year value less than or equal to the cutoff year are considered to be<p>
	 * in the current century,
	 * <p>
	 * while those greater than it are deemed to be in the previous century. Multiple types supported:
	 * <p>
	 * <p>
	 * Number: A value between 0 and 99 indicating the cutoff year.
	 * <p>
	 * String: A relative number of years from the current year, e.g., "+3" or "-5"
	 * .<p>
	 * <p>
	 */
	private Integer shortYearCutoff;
	/**
	 * The name of the animation used to show and hide the datepicker.
	 * <p>
	 * Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.<p>
	 */
	private JQEasingAnimationEffectsPart<?> showAnim;
	/**
	 * Whether to display a button pane underneath the calendar.<p>
	 * The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker.<p>
	 * The buttons' text can be customized using the currentText and closeText options respectively.
	 */
	private Boolean showButtonPanel;
	/**
	 * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the
	 * current month in.
	 */
	private Integer showCurrentAtPos;
	/**
	 * Whether to show the month after the year in the header
	 */
	private Boolean showMonthAfterYear;
	/**
	 * When the datepicker should appear.
	 * <p>
	 * The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs
	 * ("both").
	 */
	private String showOn;
	/**
	 * If using one of the jQuery UI effects for the showAnim option, you can provide additional properties for that animation using this
	 * option.
	 */
	private Boolean showOptions;
	/**
	 * Whether to display dates in other months (non-selectable) at the start or end of the current month.
	 * <p>
	 * To make these days selectable use the selectOtherMonths option.
	 */
	private Boolean showOtherMonths;
	/**
	 * When true, a column is added to show the week of the year.<p>
	 * The calculateWeek option determines how the week of the year is calculated.
	 * <p>
	 * You may also want to change the firstDay option.
	 */
	private Boolean showWeek;
	/**
	 * Set how many months to move when clicking the previous/next links.
	 */
	private Integer stepMonths;
	/**
	 * The text to display for the week of the year column heading. Default: "Wk" Use the showWeek option to display this column.
	 */
	private String weekHeader;
	/**
	 * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"),
	 * <p>
	 * relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn").
	 * <p>
	 * Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or
	 * maxDate options.<p>
	 * yearRange: "2002:2012"
	 * <p>
	 * <p>
	 */
	private String yearRange;
	/**
	 * Additional text to display after the year in the month headers.
	 */
	private String yearSuffix;

	/**
	 * Default creating constructor
	 */
	public JQUIDatePickerOptions()
	{
		//Nothing needed here
	}

	/**
	 * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of
	 * the date within this field. Leave as blank for no alternate
	 * field.
	 *
	 * @return
	 */
	public String getAltField()
	{
		return altField;
	}

	/**
	 * An input element that is to be updated with the selected date from the datepicker. Use the altFormat option to change the format of
	 * the date within this field. Leave as blank for no alternate
	 * field.
	 *
	 * @param altField
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAltField(String altField)
	{
		this.altField = altField;
		return (J) this;
	}

	/**
	 * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes,
	 * while a different format is actually sent behind the scenes. For a
	 * full list of the possible formats see the formatDate function
	 *
	 * @return
	 */
	public String getAltFormat()
	{
		return altFormat;
	}

	/**
	 * The dateFormat to be used for the altField option. This allows one date format to be shown to the user for selection purposes,
	 * while a different format is actually sent behind the scenes. For a
	 * full list of the possible formats see the formatDate function
	 *
	 * @param altFormat
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAltFormat(String altFormat)
	{
		this.altFormat = altFormat;
		return (J) this;
	}

	/**
	 * The text to display after each date field, e.g., to show the required format.
	 *
	 * @return
	 */
	public String getAppendText()
	{
		return appendText;
	}

	/**
	 * The text to display after each date field, e.g., to show the required format.
	 *
	 * @param appendText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAppendText(String appendText)
	{
		this.appendText = appendText;
		return (J) this;
	}

	/**
	 * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
	 *
	 * @return
	 */
	public Boolean getAutoSize()
	{
		return autoSize;
	}

	/**
	 * Set to true to automatically resize the input field to accommodate dates in the current dateFormat.
	 *
	 * @param autoSize
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAutoSize(Boolean autoSize)
	{
		this.autoSize = autoSize;
		return (J) this;
	}

	/**
	 * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText
	 * option becomes the alt value and is not directly displayed
	 *
	 * @return
	 */
	public String getButtonImage()
	{
		return buttonImage;
	}

	/**
	 * A URL of an image to use to display the datepicker when the showOn option is set to "button" or "both". If set, the buttonText
	 * option becomes the alt value and is not directly displayed
	 *
	 * @param buttonImage
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setButtonImage(String buttonImage)
	{
		this.buttonImage = buttonImage;
		return (J) this;
	}

	/**
	 * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the
	 * buttonImage option has also been set.
	 *
	 * @return
	 */
	public Boolean getButtonImageOnly()
	{
		return buttonImageOnly;
	}

	/**
	 * Whether the button image should be rendered by itself instead of inside a button element. This option is only relevant if the
	 * buttonImage option has also been set.
	 *
	 * @param buttonImageOnly
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setButtonImageOnly(Boolean buttonImageOnly)
	{
		this.buttonImageOnly = buttonImageOnly;
		return (J) this;
	}

	/**
	 * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
	 *
	 * @return
	 */
	public String getButtonText()
	{
		return buttonText;
	}

	/**
	 * The text to display on the trigger button. Use in conjunction with the showOn option set to "button" or "both".
	 *
	 * @param buttonText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setButtonText(String buttonText)
	{
		this.buttonText = buttonText;
		return (J) this;
	}

	/**
	 * Whether the month should be rendered as a dropdown instead of text.
	 *
	 * @return
	 */
	public Boolean getChangeMonth()
	{
		return changeMonth;
	}

	/**
	 * Whether the month should be rendered as a dropdown instead of text.
	 *
	 * @param changeMonth
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setChangeMonth(Boolean changeMonth)
	{
		this.changeMonth = changeMonth;
		return (J) this;
	}

	/**
	 * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made
	 * available for selection.
	 *
	 * @return
	 */
	public Boolean getChangeYear()
	{
		return changeYear;
	}

	/**
	 * Whether the year should be rendered as a dropdown instead of text. Use the yearRange option to control which years are made
	 * available for selection.
	 *
	 * @param changeYear
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setChangeYear(Boolean changeYear)
	{
		this.changeYear = changeYear;
		return (J) this;
	}

	/**
	 * The text to display for the close link. Use the showButtonPanel option to display this button.
	 *
	 * @return
	 */
	public String getCloseText()
	{
		return closeText;
	}

	/**
	 * The text to display for the close link. Use the showButtonPanel option to display this button.
	 *
	 * @param closeText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCloseText(String closeText)
	{
		this.closeText = closeText;
		return (J) this;
	}

	/**
	 * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
	 *
	 * @return
	 */
	public Boolean getConstrainInput()
	{
		return constrainInput;
	}

	/**
	 * When true, entry in the input field is constrained to those characters allowed by the current dateFormat option.
	 *
	 * @param constrainInput
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setConstrainInput(Boolean constrainInput)
	{
		this.constrainInput = constrainInput;
		return (J) this;
	}

	/**
	 * The text to display for the current day link. Use the showButtonPanel option to display this button.
	 *
	 * @return
	 */
	public String getCurrentText()
	{
		return currentText;
	}

	/**
	 * The text to display for the current day link. Use the showButtonPanel option to display this button.
	 *
	 * @param currentText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setCurrentText(String currentText)
	{
		this.currentText = currentText;
		return (J) this;
	}

	/**
	 * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
	 *
	 * @return
	 */
	public String getDateFormat()
	{
		return dateFormat;
	}

	/**
	 * The format for parsed and displayed dates. For a full list of the possible formats see the formatDate function.
	 *
	 * @param dateFormat
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDateFormat(String dateFormat)
	{
		this.dateFormat = dateFormat;
		return (J) this;
	}

	/**
	 * Default: [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ]
	 * <p>
	 * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
	 *
	 * @return
	 */
	@NotNull
	public List<String> getDayNames()
	{
		if (dayNames == null)
		{
			dayNames = new ArrayList<>();
		}
		return dayNames;
	}

	/**
	 * Default: [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ]
	 * <p>
	 * The list of long day names, starting from Sunday, for use as requested via the dateFormat option.
	 *
	 * @param dayNames
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDayNames(List<String> dayNames)
	{
		this.dayNames = dayNames;
		return (J) this;
	}

	/**
	 * Default: [ "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" ]
	 * <p>
	 * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.<p>
	 *
	 * @return
	 */
	public List<String> getDayNamesMin()
	{
		return dayNamesMin;
	}

	/**
	 * Default: [ "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" ]
	 * <p>
	 * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker.<p>
	 *
	 * @param dayNamesMin
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDayNamesMin(List<String> dayNamesMin)
	{
		if (dayNamesMin == null)
		{
			setDayNamesMin(new ArrayList<>());
		}
		this.dayNamesMin = dayNamesMin;
		return (J) this;
	}

	/**
	 * Default: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ]
	 * <p>
	 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.<p>
	 *
	 * @return
	 */
	public List<String> getDayNamesShort()
	{
		return dayNamesShort;
	}

	/**
	 * Default: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ]
	 * <p>
	 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.<p>
	 *
	 * @param dayNamesShort
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDayNamesShort(List<String> dayNamesShort)
	{
		this.dayNamesShort = dayNamesShort;
		return (J) this;
	}

	/**
	 * Set the date to highlight on first opening if the field is blank.<p>
	 * Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7)
	 * <p>
	 * or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today
	 * .<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the default date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.
	 * <p>
	 * For example, "+1m +7d" represents one month and seven days from today
	 *
	 * @return
	 */
	public String getDefaultDate()
	{
		return defaultDate;
	}

	/**
	 * Set the date to highlight on first opening if the field is blank.<p>
	 * Specify either an actual date via a Date object or as a string in the current dateFormat, or a number of days from today (e.g. +7)
	 * <p>
	 * or a string of values and periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null for today
	 * .<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the default date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.
	 * <p>
	 * For example, "+1m +7d" represents one month and seven days from today
	 *
	 * @param defaultDate
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDefaultDate(String defaultDate)
	{
		this.defaultDate = defaultDate;
		return (J) this;
	}

	/**
	 * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three
	 * predefined speeds ("slow", "normal", "fast").
	 *
	 * @return
	 */
	public Integer getDuration()
	{
		return duration;
	}

	/**
	 * Control the speed at which the datepicker appears, it may be a time in milliseconds or a string representing one of the three
	 * predefined speeds ("slow", "normal", "fast").
	 *
	 * @param duration
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDuration(Integer duration)
	{
		this.duration = duration;
		return (J) this;
	}

	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, etc.
	 *
	 * @return
	 */
	public Integer getFirstDay()
	{
		return firstDay;
	}

	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, etc.
	 *
	 * @param firstDay
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setFirstDay(Integer firstDay)
	{
		this.firstDay = firstDay;
		return (J) this;
	}

	/**
	 * When true, the current day link moves to the currently selected date instead of today.
	 *
	 * @return
	 */
	public Boolean getGotoCurrent()
	{
		return gotoCurrent;
	}

	/**
	 * When true, the current day link moves to the currently selected date instead of today.
	 *
	 * @param gotoCurrent
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setGotoCurrent(Boolean gotoCurrent)
	{
		this.gotoCurrent = gotoCurrent;
		return (J) this;
	}

	/**
	 * Default: false<p>
	 * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options).
	 * <p>
	 * You can hide them altogether by setting this attribute to true.<p>
	 *
	 * @return
	 */
	public Boolean getHideIfNoPrevNext()
	{
		return hideIfNoPrevNext;
	}

	/**
	 * Default: false<p>
	 * Normally the previous and next links are disabled when not applicable (see the minDate and maxDate options).
	 * <p>
	 * You can hide them altogether by setting this attribute to true.<p>
	 *
	 * @param hideIfNoPrevNext
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setHideIfNoPrevNext(Boolean hideIfNoPrevNext)
	{
		this.hideIfNoPrevNext = hideIfNoPrevNext;
		return (J) this;
	}

	/**
	 * Whether the current language is drawn from right to left.
	 *
	 * @return
	 */
	public Boolean getIsRTL()
	{
		return isRTL;
	}

	/**
	 * Whether the current language is drawn from right to left.
	 *
	 * @param isRTL
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setIsRTL(Boolean isRTL)
	{
		this.isRTL = isRTL;
		return (J) this;
	}

	/**
	 * The maximum selectable date. When set to null, there is no maximum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the maximum date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.<p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.<p>
	 * <p>
	 *
	 * @return
	 */
	public String getMaxDate()
	{
		return maxDate;
	}

	/**
	 * The maximum selectable date. When set to null, there is no maximum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the maximum date.<p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.<p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.<p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.<p>
	 * <p>
	 *
	 * @param maxDate
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMaxDate(String maxDate)
	{
		this.maxDate = maxDate;
		return (J) this;
	}

	/**
	 * he minimum selectable date. When set to null, there is no minimum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the minimum date.
	 * <p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
	 * <p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.
	 * <p>
	 *
	 * @return
	 */
	public String getMinDate()
	{
		return minDate;
	}

	/**
	 * he minimum selectable date. When set to null, there is no minimum.<p>
	 * Multiple types supported:
	 * <p>
	 * <p>
	 * Date: A date object containing the minimum date.
	 * <p>
	 * Number: A number of days from today. For example 2 represents two days from today and -1 represents yesterday.
	 * <p>
	 * String: A string in the format defined by the dateFormat option, or a relative date.
	 * <p>
	 * Relative dates must contain value and period pairs; valid periods are "y" for years, "m" for months, "w" for weeks, and "d" for
	 * days.<p>
	 * For example, "+1m +7d" represents one month and seven days from today.
	 * <p>
	 *
	 * @param minDate
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMinDate(String minDate)
	{
		this.minDate = minDate;
		return (J) this;
	}

	/**
	 * Default: [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
	 * "December" ]
	 * <p>
	 * The list of full month names, for use as requested via the dateFormat option.<p>
	 *
	 * @return
	 */
	@NotNull
	public List<String> getMonthNames()
	{
		if (monthNames == null)
		{
			monthNames = new ArrayList<>();
		}
		return monthNames;
	}

	/**
	 * Default: [ "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November",
	 * "December" ]
	 * <p>
	 * The list of full month names, for use as requested via the dateFormat option.<p>
	 *
	 * @param monthNames
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMonthNames(List<String> monthNames)
	{
		this.monthNames = monthNames;
		return (J) this;
	}

	/**
	 * Default: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ]
	 * <p>
	 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.<p>
	 *
	 * @return
	 */
	@NotNull
	public List<String> getMonthNamesShort()
	{
		if (monthNamesShort == null)
		{
			monthNamesShort = new ArrayList<>();
		}
		return monthNamesShort;
	}

	/**
	 * Default: [ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" ]
	 * <p>
	 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat option.<p>
	 *
	 * @param monthNamesShort
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMonthNamesShort(List<String> monthNamesShort)
	{
		this.monthNamesShort = monthNamesShort;
		return (J) this;
	}

	/**
	 * Default: false Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to
	 * display the target month names for example.
	 *
	 * @return
	 */
	public Boolean getNavigationAsDateFormat()
	{
		return navigationAsDateFormat;
	}

	/**
	 * Default: false Whether the prevText and nextText options should be parsed as dates by the formatDate function, allowing them to
	 * display the target month names for example.
	 *
	 * @param navigationAsDateFormat
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setNavigationAsDateFormat(Boolean navigationAsDateFormat)
	{
		this.navigationAsDateFormat = navigationAsDateFormat;
		return (J) this;
	}

	/**
	 * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 *
	 * @return
	 */
	public String getNextText()
	{
		return nextText;
	}

	/**
	 * The text to display for the next month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 *
	 * @param nextText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setNextText(String nextText)
	{
		this.nextText = nextText;
		return (J) this;
	}

	/**
	 * The number of months to show at once.
	 *
	 * @return
	 */
	public Integer getNumberOfMonths()
	{
		return numberOfMonths;
	}

	/**
	 * The number of months to show at once.
	 *
	 * @param numberOfMonths
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setNumberOfMonths(Integer numberOfMonths)
	{
		this.numberOfMonths = numberOfMonths;
		return (J) this;
	}

	/**
	 * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 *
	 * @return
	 */
	public String getPrevText()
	{
		return prevText;
	}

	/**
	 * The text to display for the previous month link. With the standard ThemeRoller styling, this value is replaced by an icon.
	 *
	 * @param prevText
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setPrevText(String prevText)
	{
		this.prevText = prevText;
		return (J) this;
	}

	/**
	 * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths
	 * option is set to true.
	 *
	 * @return
	 */
	public Boolean getSelectOtherMonths()
	{
		return selectOtherMonths;
	}

	/**
	 * Whether days in other months shown before or after the current month are selectable. This only applies if the showOtherMonths
	 * option is set to true.
	 *
	 * @param selectOtherMonths
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSelectOtherMonths(Boolean selectOtherMonths)
	{
		this.selectOtherMonths = selectOtherMonths;
		return (J) this;
	}

	/**
	 * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y')
	 * .<p>
	 * Any dates entered with a year value less than or equal to the cutoff year are considered to be<p>
	 * in the current century,
	 * <p>
	 * while those greater than it are deemed to be in the previous century. Multiple types supported:
	 * <p>
	 * <p>
	 * Number: A value between 0 and 99 indicating the cutoff year.
	 * <p>
	 * String: A relative number of years from the current year, e.g., "+3" or "-5"
	 * .<p>
	 * <p>
	 *
	 * @return
	 */
	public Integer getShortYearCutoff()
	{
		return shortYearCutoff;
	}

	/**
	 * The cutoff year for determining the century for a date (used in conjunction with dateFormat 'y')
	 * .<p>
	 * Any dates entered with a year value less than or equal to the cutoff year are considered to be<p>
	 * in the current century,
	 * <p>
	 * while those greater than it are deemed to be in the previous century. Multiple types supported:
	 * <p>
	 * <p>
	 * Number: A value between 0 and 99 indicating the cutoff year.
	 * <p>
	 * String: A relative number of years from the current year, e.g., "+3" or "-5"
	 * .<p>
	 * <p>
	 *
	 * @param shortYearCutoff
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShortYearCutoff(Integer shortYearCutoff)
	{
		this.shortYearCutoff = shortYearCutoff;
		return (J) this;
	}

	/**
	 * The name of the animation used to show and hide the datepicker.
	 * <p>
	 * Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.<p>
	 *
	 * @return
	 */
	public JQEasingAnimationEffectsPart<?> getShowAnim()
	{
		return showAnim;
	}

	/**
	 * The name of the animation used to show and hide the datepicker.
	 * <p>
	 * Use "show" (the default), "slideDown", "fadeIn", any of the jQuery UI effects. Set to an empty string to disable animation.<p>
	 *
	 * @param showAnim
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowAnim(JQEasingAnimationEffectsPart<?> showAnim)
	{
		this.showAnim = showAnim;
		return (J) this;
	}

	/**
	 * Whether to display a button pane underneath the calendar.<p>
	 * The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker.<p>
	 * The buttons' text can be customized using the currentText and closeText options respectively.
	 *
	 * @return
	 */
	public Boolean getShowButtonPanel()
	{
		return showButtonPanel;
	}

	/**
	 * Whether to display a button pane underneath the calendar.<p>
	 * The button pane contains two buttons, a Today button that links to the current day, and a Done button that closes the datepicker.<p>
	 * The buttons' text can be customized using the currentText and closeText options respectively.
	 *
	 * @param showButtonPanel
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowButtonPanel(Boolean showButtonPanel)
	{
		this.showButtonPanel = showButtonPanel;
		return (J) this;
	}

	/**
	 * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the
	 * current month in.
	 *
	 * @return
	 */
	public Integer getShowCurrentAtPos()
	{
		return showCurrentAtPos;
	}

	/**
	 * When displaying multiple months via the numberOfMonths option, the showCurrentAtPos option defines which position to display the
	 * current month in.
	 *
	 * @param showCurrentAtPos
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowCurrentAtPos(Integer showCurrentAtPos)
	{
		this.showCurrentAtPos = showCurrentAtPos;
		return (J) this;
	}

	/**
	 * Whether to show the month after the year in the header
	 *
	 * @return
	 */
	public Boolean getShowMonthAfterYear()
	{
		return showMonthAfterYear;
	}

	/**
	 * Whether to show the month after the year in the header
	 *
	 * @param showMonthAfterYear
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowMonthAfterYear(Boolean showMonthAfterYear)
	{
		this.showMonthAfterYear = showMonthAfterYear;
		return (J) this;
	}

	/**
	 * When the datepicker should appear.
	 * <p>
	 * The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs
	 * ("both").
	 *
	 * @return
	 */
	public String getShowOn()
	{
		return showOn;
	}

	/**
	 * When the datepicker should appear.
	 * <p>
	 * The datepicker can appear when the field receives focus ("focus"), when a button is clicked ("button"), or when either event occurs
	 * ("both").
	 *
	 * @param showOn
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowOn(String showOn)
	{
		this.showOn = showOn;
		return (J) this;
	}

	/**
	 * If using one of the jQuery UI effects for the showAnim option, you can provide additional properties for that animation using this
	 * option.
	 *
	 * @return
	 */
	public Boolean getShowOptions()
	{
		return showOptions;
	}

	/**
	 * If using one of the jQuery UI effects for the showAnim option, you can provide additional properties for that animation using this
	 * option.
	 *
	 * @param showOptions
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowOptions(Boolean showOptions)
	{
		this.showOptions = showOptions;
		return (J) this;
	}

	/**
	 * Whether to display dates in other months (non-selectable) at the start or end of the current month.
	 * <p>
	 * To make these days selectable use the selectOtherMonths option.
	 *
	 * @return
	 */
	public Boolean getShowOtherMonths()
	{
		return showOtherMonths;
	}

	/**
	 * Whether to display dates in other months (non-selectable) at the start or end of the current month.
	 * <p>
	 * To make these days selectable use the selectOtherMonths option.
	 *
	 * @param showOtherMonths
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowOtherMonths(Boolean showOtherMonths)
	{
		this.showOtherMonths = showOtherMonths;
		return (J) this;
	}

	/**
	 * When true, a column is added to show the week of the year.<p>
	 * The calculateWeek option determines how the week of the year is calculated.
	 * <p>
	 * You may also want to change the firstDay option.
	 *
	 * @return
	 */
	public Boolean getShowWeek()
	{
		return showWeek;
	}

	/**
	 * When true, a column is added to show the week of the year.<p>
	 * The calculateWeek option determines how the week of the year is calculated.
	 * <p>
	 * You may also want to change the firstDay option.
	 *
	 * @param showWeek
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setShowWeek(Boolean showWeek)
	{
		this.showWeek = showWeek;
		return (J) this;
	}

	/**
	 * Set how many months to move when clicking the previous/next links.
	 *
	 * @return
	 */
	public Integer getStepMonths()
	{
		return stepMonths;
	}

	/**
	 * Set how many months to move when clicking the previous/next links.
	 *
	 * @param stepMonths
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setStepMonths(Integer stepMonths)
	{
		this.stepMonths = stepMonths;
		return (J) this;
	}

	/**
	 * The text to display for the week of the year column heading. Default: "Wk" Use the showWeek option to display this column.
	 *
	 * @return
	 */
	public String getWeekHeader()
	{
		return weekHeader;
	}

	/**
	 * The text to display for the week of the year column heading. Default: "Wk" Use the showWeek option to display this column.
	 *
	 * @param weekHeader
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setWeekHeader(String weekHeader)
	{
		this.weekHeader = weekHeader;
		return (J) this;
	}

	/**
	 * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"),
	 * <p>
	 * relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn").
	 * <p>
	 * Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or
	 * maxDate options.<p>
	 * yearRange: "2002:2012"
	 * <p>
	 * <p>
	 *
	 * @return
	 */
	public String getYearRange()
	{
		return yearRange;
	}

	/**
	 * The range of years displayed in the year drop-down: either relative to today's year ("-nn:+nn"),
	 * <p>
	 * relative to the currently selected year ("c-nn:c+nn"), absolute ("nnnn:nnnn"), or combinations of these formats ("nnnn:-nn").
	 * <p>
	 * Note that this option only affects what appears in the drop-down, to restrict which dates may be selected use the minDate and/or
	 * maxDate options.<p>
	 * yearRange: "2002:2012"
	 * <p>
	 * <p>
	 *
	 * @param yearRange
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setYearRange(String yearRange)
	{
		this.yearRange = yearRange;
		return (J) this;
	}

	/**
	 * Additional text to display after the year in the month headers.
	 *
	 * @return
	 */
	public String getYearSuffix()
	{
		return yearSuffix;
	}

	/**
	 * Additional text to display after the year in the month headers.
	 *
	 * @param yearSuffix
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setYearSuffix(String yearSuffix)
	{
		this.yearSuffix = yearSuffix;
		return (J) this;
	}

}
