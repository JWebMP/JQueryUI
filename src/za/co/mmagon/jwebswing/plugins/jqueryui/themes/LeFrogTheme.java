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
 * The Dark Hive theme to JQuery UI
 *
 * @since 2012/02/04
 * @version
 * @author MMagon
 *
 */
public class LeFrogTheme extends Theme
{

    private static final long serialVersionUID = 1L;

    /**
     * The LeFrog Theme
     */
    public LeFrogTheme()
    {
        super("LeFrog", "uilefrog", "bower_components/jquery-ui/themes/images/theme_30_le_frog.png", "", "bower_components/jquery-ui/themes/images/theme_90_le_frog.png");
        getCssReferences().add(new CSSReference("lefrogTheme", 1.121, "bower_components/jquery-ui/themes/le-frog/theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/le-frog/theme.css"));
        getCssReferences().add(new CSSReference("lefrogTheme2", 1.121, "bower_components/jquery-ui/themes/le-frog/jquery-ui.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/le-frog/jquery-ui.css"));

    }

}
