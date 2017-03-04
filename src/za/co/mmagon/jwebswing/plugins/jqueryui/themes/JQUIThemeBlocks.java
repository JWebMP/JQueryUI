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

import java.util.EnumSet;
import za.co.mmagon.jwebswing.base.interfaces.ICSSClassName;

/**
 * All the class names to work with JQuery UI Themes
 *
 * @author MMagon
 * @since 21 Jul 2013
 * @version 1.0
 */
public enum JQUIThemeBlocks implements ICSSClassName
{
    /**
     * Specifies the container must adopt the widget
     */
    UI_Widget,
    /**
     * Container
     */
    UI_Widget_Content,
    /**
     * Header
     */
    UI_Widget_Header,
    /**
     * Footer
     */
    UI_Widget_Footer,
    /**
     * Widget Shadow
     */
    UI_Widget_Shadow,
    /**
     * Footer
     */
    UI_Widget_Input,
    /**
     * Disabled State
     */
    UI_State_Disabled,
    /**
     * Enabled State
     */
    UI_State_Enabled,
    /**
     * Hover State
     */
    UI_State_Hover,
    /**
     * On Focus
     */
    UI_State_Focus,
    /**
     * On Blur
     */
    UI_State_Blur,
    /**
     * Active State
     */
    UI_State_Active,
    /**
     * Visited State
     */
    UI_State_Visited,
    /**
     * Link State
     */
    UI_State_Link,
    /**
     * State Default
     */
    UI_State_Default,
    /**
     * State Highlighted
     */
    UI_State_Highlight,
    /**
     * State Error
     */
    UI_State_Error,
    /**
     * Priorities
     */
    /**
     * Primary Priority
     */
    UI_Priority_Primary,
    /**
     * Secondary Priority
     */
    UI_Priority_Secondary,
    /**
     * Apply corners to all
     */
    UI_Corner_All,
    /**
     * Corners on the Top
     */
    UI_Corner_Top,
    /**
     * Corners on the left
     */
    UI_Corner_Left,
    /**
     * Corners on the right
     */
    UI_Corner_Right,
    /**
     * Corners on the bottom
     */
    UI_Corner_Bottom;

    /**
     * Enabled or Disabled States
     */
    protected static final EnumSet<JQUIThemeBlocks> ThemeStates = EnumSet.of(UI_State_Enabled, UI_State_Disabled);

    /**
     * Priorities
     * <p>
     */
    protected static final EnumSet<JQUIThemeBlocks> ThemePriorities = EnumSet.of(UI_Priority_Primary, UI_Priority_Secondary);

    /**
     * Link Types
     */
    protected static final EnumSet<JQUIThemeBlocks> ThemeLinks = EnumSet.of(UI_State_Active, UI_State_Hover, UI_State_Link, UI_State_Visited);

    /**
     * Theme Status (Error,Highlight,Default)
     */
    protected static final EnumSet<JQUIThemeBlocks> ThemeStatus = EnumSet.of(UI_State_Error, UI_State_Highlight, UI_State_Default);

    /**
     * Radius Settings
     */
    protected static final EnumSet<JQUIThemeBlocks> ThemeCorners = EnumSet.of(UI_Corner_All, UI_Corner_Top, UI_Corner_Left, UI_Corner_Right, UI_Corner_Bottom);

    @Override
    public String toString()
    {
        return name().toLowerCase().replace("_", "-");
    }

    /**
     * Returns the theme states
     *
     * @return
     */
    public static EnumSet<JQUIThemeBlocks> getThemeStates()
    {
        return ThemeStates;
    }

    /**
     * Sets the theme priorities
     *
     * @return
     */
    public static EnumSet<JQUIThemeBlocks> getThemePriorities()
    {
        return ThemePriorities;
    }

    /**
     * Gets the theme links
     *
     * @return
     */
    public static EnumSet<JQUIThemeBlocks> getThemeLinks()
    {
        return ThemeLinks;
    }

    /**
     * Gets the theme status items
     *
     * @return
     */
    public static EnumSet<JQUIThemeBlocks> getThemeStatus()
    {
        return ThemeStatus;
    }

    /**
     * Gets the theme corners
     *
     * @return
     */
    public static EnumSet<JQUIThemeBlocks> getThemeCorners()
    {
        return ThemeCorners;
    }

}
