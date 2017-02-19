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
 * Implements the UI Darkness Theme
 *
 * @since 2014/07/05
 * @version 1.0
 * @author MMagon
 *
 *
 */
public class EggplantTheme extends Theme
{

    private static final long serialVersionUID = 1L;

    public EggplantTheme()
    {
        super("Eggplant", "uieggplant", "bower_components/jquery-ui/themes/images/theme_30_eggplant.png", "", "bower_components/jquery-ui/themes/images/theme_90_eggplant.png");
        getCssReferences().add(new CSSReference("eggplantTheme", 1.114, "bower_components/jquery-ui/themes/eggplant/theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/eggplant/theme.css"));
        getCssReferences().add(new CSSReference("eggplantTheme1", 1.114, "bower_components/jquery-ui/themes/eggplant/jquery-ui.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/eggplant/jquery-ui.css"));
    }

}
