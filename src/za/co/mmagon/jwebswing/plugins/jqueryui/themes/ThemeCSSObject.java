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
package za.co.mmagon.jwebswing.plugins.jqueryui.themes;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.htmlbuilder.css.measurement.MeasurementCSSImpl;
import za.co.mmagon.jwebswing.htmlbuilder.css.composer.CSSBlock;
import za.co.mmagon.jwebswing.htmlbuilder.css.fonts.FontFamilies;
import za.co.mmagon.jwebswing.htmlbuilder.css.fonts.FontWeights;

/**
 * 
 * @since 
 * @version
 * @author MMagon
 *
 * 
 */

public class ThemeCSSObject 
{
        
    
    public class FontSettingsBlock extends CSSBlock
    {
        private ArrayList<FontFamilies> fontFamilies = new ArrayList();
        private FontWeights fontWeight = FontWeights.Normal;
        private MeasurementCSSImpl fontSize = new MeasurementCSSImpl();

        public ArrayList<FontFamilies> getFontFamilies()
        {
            return fontFamilies;
        }

        public void setFontFamilies(ArrayList<FontFamilies> fontFamilies)
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
    
    public class HeaderToolbarBlock extends CSSBlock
    {
        
    }
    
    public class ContentBlock extends CSSBlock
    {
        
    }
    
    public class ClickableDefaultStateBlock extends CSSBlock
    {
        
    }
    
    public class ClickableHoverStateBlock extends CSSBlock
    {
        
    }
    
    public class ClickableActiveStateBlock extends CSSBlock
    {
        
    }
    
    public class HighlightBlock extends CSSBlock
    {
        
    }
    
    public class ErrorBlock extends CSSBlock
    {
        
    }
    
    public class ModelScreenForOverlaysBlock extends CSSBlock
    {
        
    }
    
    public class DropShadowsBlock extends CSSBlock
    {
        
    }
    
}
