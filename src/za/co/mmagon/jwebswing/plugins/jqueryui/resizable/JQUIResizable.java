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
package za.co.mmagon.jwebswing.plugins.jqueryui.resizable;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author Marc Magon
 * @since 07 Aug 2015
 * @version 1.0
 */
@ComponentInformation(name = "JQuery UI Resizable",
        description = "Enable any DOM element to be resizable. With the cursor grab the right or bottom border and drag to the desired width or height.",
        url = "http://jqueryui.com/resizable/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIResizable extends Div<JQUIResizableChildren, NoAttributes, JQUIResizableFeatures, JQUIResizableEvents, JQUIResizable> implements IJQUIResizable
{

    private static final long serialVersionUID = 1L;
    /**
     * The resizable feature
     */
    private JQUIResizableFeature feature;

    /**
     * Adds the feature to the resizable
     */
    public JQUIResizable()
    {
        addFeature(feature = new JQUIResizableFeature(this));
    }

    /**
     * Returns the features options
     * <p>
     * @return
     */
    @Override
    public JQUIResizableOptions getOptions()
    {
        return feature.getOptions();
    }

    /**
     * Returns this feature
     *
     * @return
     */
    public JQUIResizableFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIResizableFeature(this);
        }
        return feature;
    }

    /**
     * Sets this feature
     *
     * @param feature
     */
    public void setFeature(JQUIResizableFeature feature)
    {
        this.feature = feature;
    }

    /**
     * A neater representation
     *
     * @return
     */
    public IJQUIResizable asMe()
    {
        return this;
    }
}
