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
package za.co.mmagon.jwebswing.plugins.jqueryui.progressbar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * The Query UI Implementation of a progress bar
 * <p>
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * <p>
 * <p>
 */
@ComponentInformation(name = "JQuery UI Progress Bar", description = "The progress bar is designed to display the current percent complete for a process. The bar is coded to be flexibly sized through CSS and will scale to fit inside its parent container by default.",
        url = "http://jqueryui.com/progressbar/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIProgressBar extends Div<JQUIProgressBarChildren, NoAttributes, JQUIProgressBarFeatures, JQUIProgressBarEvents, JQUIProgressBar> implements IJQUIProgressBar
{

    private static final long serialVersionUID = 1L;
    /**
     * The feature for the progress bar
     */
    private JQUIProgressBarFeature feature;

    /**
     *
     */
    public JQUIProgressBar()
    {
        addFeature(feature = new JQUIProgressBarFeature(this));
    }

    /**
     * Returns the feature for this progress bar
     * <p>
     * @return
     */
    public JQUIProgressBarFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIProgressBarFeature(this);
        }
        return feature;
    }

    /**
     * Returns the Progress bar options
     * <p>
     * @return
     */
    @Override
    public JQUIProgressBarOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * A neater view
     *
     * @return
     */
    public IJQUIProgressBar asMe()
    {
        return this;
    }
}
