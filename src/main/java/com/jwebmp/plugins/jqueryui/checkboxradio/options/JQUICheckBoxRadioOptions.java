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
package com.jwebmp.plugins.jqueryui.checkboxradio.options;

import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUICheckBoxRadioOptions<J extends JQUICheckBoxRadioOptions<J>>
		extends JavaScriptPart<J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The classes map for the checkbox/radio
	 */
	private Map<String, String> classes;
	/**
	 * The icon class for the radio
	 */
	private String icon;
	/**
	 * The disabled feature
	 */
	private Boolean disabled;
	/**
	 * A custom label if need be
	 */
	private String label;

	public JQUICheckBoxRadioOptions()
	{
		//Nothing Needed
	}

	/**
	 * Returns the icon
	 *
	 * @return
	 */
	public String getIcon()
	{
		return icon;
	}

	/**
	 * Sets the icon
	 *
	 * @param icon
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIcon(String icon)
	{
		this.icon = icon;
		return (J) this;
	}

	/**
	 * If it is disabled
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Sets if it is disabled
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Returns the actual label
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
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * The label associated with the input. If the input is checked, this will also get the ui-checkboxradio-checked class. If the input
	 * is of type radio, this will also get the
	 * ui-checkboxradio-radio-label class.
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabelClass(String label)
	{
		getClasses().put("ui-checkboxradio-label", label);
		return (J) this;
	}

	/**
	 * Returns the classes
	 *
	 * @return
	 */
	public Map<String, String> getClasses()
	{
		if (classes == null)
		{
			classes = new HashMap<>();
		}
		return classes;
	}

	/**
	 * Sets the classes
	 *
	 * @param classes
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setClasses(Map<String, String> classes)
	{
		this.classes = classes;
		return (J) this;
	}

	/**
	 * If the icon option is enabled, the generated icon has this class.
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIconClass(String label)
	{
		getClasses().put("ui-checkboxradio-icon", label);
		return (J) this;
	}

	/**
	 * If the icon option is enabled, an extra element with this class as added between the text label and the icon.
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setIconSpace(String label)
	{
		getClasses().put("ui-checkboxradio-icon-space", label);
		return (J) this;
	}
}
