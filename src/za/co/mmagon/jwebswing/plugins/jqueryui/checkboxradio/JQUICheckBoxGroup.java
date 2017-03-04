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
package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import za.co.mmagon.jwebswing.base.html.FieldSet;
import za.co.mmagon.jwebswing.base.html.Legend;
import za.co.mmagon.jwebswing.plugins.jqueryui.controlgroup.JQUIControlGroupFeature;

/**
 *
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * <p>
 * <p>
 */
public class JQUICheckBoxGroup extends FieldSet
{

    private static final long serialVersionUID = 1L;

    private JQUIControlGroupFeature feature;

    private String legendTitle;

    /**
     * Constructs a new Check Box Group
     */
    public JQUICheckBoxGroup()
    {
        addFeature(getFeature());
    }

    /**
     * Adds a new Check Box to the group
     * <p>
     * @param label the label to create
     * @param checkBox the check box to add
     * @return
     */
    public JQUICheckBoxGroup addCheckBox(JQUICheckBox checkBox)
    {
        add(checkBox);
        return this;
    }

    /**
     * Sets the legend title
     *
     * @return
     */
    public String getLegendTitle()
    {
        return legendTitle;
    }

    /**
     * Sets the legend title
     *
     * @param legendTitle
     * @return
     */
    public JQUICheckBoxGroup setLegendTitle(String legendTitle)
    {
        this.legendTitle = legendTitle;
        return this;
    }

    @Override
    protected StringBuilder renderBeforeChildren()
    {
        Legend leg = new Legend();
        leg.setText(legendTitle);
        leg.setTiny(true);
        return new StringBuilder().append(getCurrentTabIndents()).append(leg.toString(true)).append(getNewLine());
    }

    /**
     * Adds a new Check Box to the group
     * <p>
     * @param label the label to create
     * @param checkBox the check box to add
     * @return The label object that is created
     */
    /**
     * Returns this groups feature
     * <p>
     * @return
     */
    public final JQUIControlGroupFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIControlGroupFeature(this);
        }
        return feature;
    }

}
