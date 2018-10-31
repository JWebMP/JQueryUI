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
package com.jwebmp.plugins.jqueryui.themes;

import com.jwebmp.core.base.html.Image;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.htmlbuilder.css.heightwidth.HeightWidthCSS;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSS;

/**
 * A default theme pack item
 *
 * @author mmagon
 * @since 24 Sep 2013
 */
@HeightWidthCSS(Width = @MeasurementCSS(250))
public class ThemePackItem
		extends ListItem
{


	private String name;
	private String cssClass;
	private String iconImageLocation;

	private Link link;
	@HeightWidthCSS(Width = @MeasurementCSS(16),
			Height = @MeasurementCSS(16))
	private Image image;
	private Span span;

	public ThemePackItem(String name, String cssClass)
	{
		this(name, cssClass, null);
	}

	/**
	 * Creates a new theme pack item with the given values
	 *
	 * @param name
	 * @param cssClass
	 * @param iconImageLocation
	 */
	public ThemePackItem(String name, String cssClass, String iconImageLocation)
	{
		this.name = name;
		this.cssClass = cssClass;
		this.iconImageLocation = iconImageLocation;

		link = new Link(cssClass);
		add(link);
		if (iconImageLocation != null && !iconImageLocation.isEmpty())
		{
			image = new Image(iconImageLocation);
			add(image);
		}

		span = new Span();
		span.addClass("themeName");
		span.setText(this.name);

		addClass(JQUIThemeBlocks.UI_Widget.toString());
		addClass(JQUIThemeBlocks.UI_Widget_Input.toString());
		addClass(JQUIThemeBlocks.UI_State_Active.toString());

		link.add(span);
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getName() != null ? getName().hashCode() : 0);
		result = 31 * result + (getCssClass() != null ? getCssClass().hashCode() : 0);
		result = 31 * result + (getIconImageLocation() != null ? getIconImageLocation().hashCode() : 0);
		result = 31 * result + (link != null ? link.hashCode() : 0);
		result = 31 * result + (image != null ? image.hashCode() : 0);
		result = 31 * result + (span != null ? span.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof ThemePackItem))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		ThemePackItem that = (ThemePackItem) o;

		if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null)
		{
			return false;
		}
		if (getCssClass() != null ? !getCssClass().equals(that.getCssClass()) : that.getCssClass() != null)
		{
			return false;
		}
		if (getIconImageLocation() != null ? !getIconImageLocation().equals(that.getIconImageLocation()) : that.getIconImageLocation() != null)
		{
			return false;
		}
		if (link != null ? !link.equals(that.link) : that.link != null)
		{
			return false;
		}
		if (image != null ? !image.equals(that.image) : that.image != null)
		{
			return false;
		}
		return span != null ? span.equals(that.span) : that.span == null;
	}

	/**
	 * Gets the class
	 *
	 * @return
	 */
	public String getCssClass()
	{
		return cssClass;
	}

	/**
	 * Sets the css class name
	 *
	 * @param cssClass
	 */
	public void setCssClass(String cssClass)
	{
		this.cssClass = cssClass;
	}

	/**
	 * Gets the icon image location
	 *
	 * @return
	 */
	public String getIconImageLocation()
	{
		return iconImageLocation;
	}

	/**
	 * Sets the icon image location
	 *
	 * @param iconImageLocation
	 */
	public void setIconImageLocation(String iconImageLocation)
	{
		this.iconImageLocation = iconImageLocation;
	}
}
