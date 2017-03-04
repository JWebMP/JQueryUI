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

/**
 * iconPosition * Type: String Default: "beginning" Where to display the icon: Valid values are "beginning", "end", "top" and "bottom". In a left-to-right (LTR) display, "beginning" refers to the
 * left, in a right-to-left (RTL, e.g. in Hebrew or Arabic), it refers to the right.
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public enum JQUIButtonIconPositions
{
    Beginning,
    End,
    Top,
    Bottom;

    private JQUIButtonIconPositions()
    {

    }

    @Override
    public String toString()
    {
        return name().toLowerCase();
    }

}
