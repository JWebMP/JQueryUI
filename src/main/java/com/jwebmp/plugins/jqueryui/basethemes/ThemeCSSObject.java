/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqueryui.basethemes;

import com.jwebmp.core.htmlbuilder.css.composer.CSSBlock;
import com.jwebmp.core.htmlbuilder.css.fonts.FontFamilies;
import com.jwebmp.core.htmlbuilder.css.fonts.FontWeights;
import com.jwebmp.core.htmlbuilder.css.measurement.MeasurementCSSImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MMagon
 */
public class ThemeCSSObject
{

	public class FontSettingsBlock
			extends CSSBlock
	{
		private List<FontFamilies> fontFamilies = new ArrayList();
		private FontWeights fontWeight = FontWeights.Normal;
		private MeasurementCSSImpl fontSize = new MeasurementCSSImpl();

		@Override
		public int hashCode()
		{
			int result = super.hashCode();
			result = 31 * result + (getFontFamilies() != null ? getFontFamilies().hashCode() : 0);
			result = 31 * result + (getFontWeight() != null ? getFontWeight().hashCode() : 0);
			result = 31 * result + (getFontSize() != null ? getFontSize().hashCode() : 0);
			return result;
		}

		@Override
		public boolean equals(Object o)
		{
			if (this == o)
			{
				return true;
			}
			if (o == null || getClass() != o.getClass())
			{
				return false;
			}
			if (!super.equals(o))
			{
				return false;
			}

			FontSettingsBlock that = (FontSettingsBlock) o;

			if (getFontFamilies() != null ? !getFontFamilies().equals(that.getFontFamilies()) : that.getFontFamilies() != null)
			{
				return false;
			}
			if (getFontWeight() != that.getFontWeight())
			{
				return false;
			}
			return getFontSize() != null ? getFontSize().equals(that.getFontSize()) : that.getFontSize() == null;
		}

		public List<FontFamilies> getFontFamilies()
		{
			return fontFamilies;
		}

		public void setFontFamilies(List<FontFamilies> fontFamilies)
		{
			this.fontFamilies = fontFamilies;
		}

		public FontWeights getFontWeight()
		{
			return fontWeight;
		}

		public void setFontWeight(FontWeights fontWeight)
		{
			this.fontWeight = fontWeight;
		}

		public MeasurementCSSImpl getFontSize()
		{
			return fontSize;
		}

		public void setFontSize(MeasurementCSSImpl fontSize)
		{
			this.fontSize = fontSize;
		}
	}

	public class HeaderToolbarBlock
			extends CSSBlock
	{

	}

	public class ContentBlock
			extends CSSBlock
	{

	}

	public class ClickableDefaultStateBlock
			extends CSSBlock
	{

	}

	public class ClickableHoverStateBlock
			extends CSSBlock
	{

	}

	public class ClickableActiveStateBlock
			extends CSSBlock
	{

	}

	public class HighlightBlock
			extends CSSBlock
	{

	}

	public class ErrorBlock
			extends CSSBlock
	{

	}

	public class ModelScreenForOverlaysBlock
			extends CSSBlock
	{

	}

	public class DropShadowsBlock
			extends CSSBlock
	{

	}

}
