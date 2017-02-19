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
package za.co.mmagon.jwebswing.plugins.jqueryui.draggable;

/**
 * Valid Axis Settings
 * <p>
 * @since 2014/04/13
 * @version 1.0
 * @author MMagon
 *
 * <p>
 */
/**
 * Specifies Axis that the draggable feature can be put on
 */
public enum Axis
{

    /**
     * The X Axis
     */
    X,
    /**
     * The Y Axis
     */
    Y;

    @Override
    public String toString()
    {
        return super.toString().toLowerCase();
    }

}
