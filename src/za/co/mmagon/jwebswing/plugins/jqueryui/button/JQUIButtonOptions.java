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
package za.co.mmagon.jwebswing.plugins.jqueryui.button;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 *
 * @author MXM3727
 */
public class JQUIButtonOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * Specifies if the button is disabled or not
     */
    private Boolean disabled;
    /**
     * The icons to display for the button
     */
    @Deprecated
    private JQUIButtonIconOptions icons;
    /**
     * The new icon class for 1.12
     */
    private String icon;
    /**
     * The icon position
     */
    private JQUIButtonIconPositions iconPosition;
    /**
     * The label of the button
     */
    private String label;
    /**
     * Sets whether or not the label should be shown
     */
    private Boolean showLabel;

    /**
     * Returns if the button is disabled
     *
     * @return
     */
    public Boolean getDisabled()
    {
        return disabled;
    }

    /**
     * Sets the button disabled
     *
     * @param disabled
     * @return
     */
    public JQUIButtonOptions setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }

    /**
     * Gets the icons for the button
     *
     * @return
     */
    @Deprecated
    public JQUIButtonIconOptions getIcons()
    {
        if (icons == null)
        {
            icons = new JQUIButtonIconOptions();
        }
        return icons;
    }

    /**
     * Sets the icons for the button
     *
     * @param icons
     * @return
     */
    @Deprecated
    public JQUIButtonOptions setIcons(JQUIButtonIconOptions icons)
    {
        this.icons = icons;
        return this;
    }

    /**
     * Sets the label for the button
     *
     * @return
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Gets the label for the button
     *
     * @param label
     * @return
     */
    public JQUIButtonOptions setLabel(String label)
    {
        this.label = label;
        return this;
    }

    /**
     * Gets if the label should be shown.
     *
     * @return
     */
    public Boolean getShowLabel()
    {
        return showLabel;
    }

    /**
     * Sets if the label should be shown but the icons option must be enabled, otherwise the text option will be ignored.
     *
     * @param showLabel
     * @return
     */
    public JQUIButtonOptions setShowLabel(Boolean showLabel)
    {
        this.showLabel = showLabel;
        return this;
    }

    /**
     * The icon class
     *
     * @return
     */
    public String getIcon()
    {
        return icon;
    }

    /**
     * Sets the icon class
     *
     * @param icon
     * @return
     */
    public JQUIButtonOptions setIcon(String icon)
    {
        this.icon = icon;
        return this;
    }

    /**
     * The icon position of the button
     *
     * @return
     */
    public JQUIButtonIconPositions getIconPosition()
    {
        return iconPosition;
    }

    /**
     * Sets the icon position
     *
     * @param iconPosition
     * @return
     */
    public JQUIButtonOptions setIconPosition(JQUIButtonIconPositions iconPosition)
    {
        this.iconPosition = iconPosition;
        return this;
    }

}
