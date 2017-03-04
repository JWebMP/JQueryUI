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
package za.co.mmagon.jwebswing.plugins.jqueryui.selectmenu;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The Select Menu from the JQuery UI
 * <p>
 * @author GedMarc
 * @since Mar 9, 2015
 * @version 1.0
 * <p>
 * <p>
 */
@ComponentInformation(name = "JQuery UI Select Menu",
        description = "Enable a DOM element (or group of elements) to be selectable. Draw a box with your cursor to select items. Hold down the Ctrl key to make multiple non-adjacent selections.",
        url = "http://jqueryui.com/selectmenu/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUISelectMenu extends Div<JQUISelectMenuChildren, NoAttributes, JQUISelectMenuFeatures, JQUISelectMenuEvents, JQUISelectMenu> implements IJQUISelectMenu
{

    private static final long serialVersionUID = 1L;

    /**
     * The select menu feature
     */
    private JQUISelectMenuFeature feature;

    /**
     * Constructs a new select menu
     */
    public JQUISelectMenu()
    {
        super(ComponentTypes.Select);
        addFeature(getFeature());
    }

    /**
     * Returns the select menu feature
     * <p>
     * @return
     */
    public final JQUISelectMenuFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUISelectMenuFeature(this);
        }
        return feature;
    }

    /**
     * As Me
     *
     * @return
     */
    public IJQUISelectMenu asMe()
    {
        return this;
    }

    /**
     * Returns the options for the select menu
     * <p>
     * @return
     */
    @Override
    public JQUISelectMenuOptions getOptions()
    {
        return getFeature().getOptions();
    }

}
