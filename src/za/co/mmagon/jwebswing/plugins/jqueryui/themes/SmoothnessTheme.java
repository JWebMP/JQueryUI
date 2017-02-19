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

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.htmlbuilder.css.themes.Theme;

/**
 * The Smoothness theme from JQuery UI
 *
 * @since 2014/07/05
 * @version 1.0
 * @author MMagon
 *
 *
 */
class SmoothnessTheme extends Theme
{

    private static final long serialVersionUID = 1L;

    public SmoothnessTheme()
    {
        super("Smoothness", "uismoothness", "bower_components/jquery-ui/themes/images/theme_30_smoothness.png", "", "bower_components/jquery-ui/themes/images/theme_90_smoothness.png");
        getCssReferences().add(new CSSReference("smoothnessTheme", 1.121, "bower_components/jquery-ui/themes/smoothness/theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/theme.css"));
        getCssReferences().add(new CSSReference("smoothnessTheme2", 1.121, "bower_components/jquery-ui/themes/smoothness/jquery-ui.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css"));
    }

}
