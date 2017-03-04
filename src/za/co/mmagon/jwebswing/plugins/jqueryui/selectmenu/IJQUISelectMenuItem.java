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

/**
 *
 * @author GedMarc
 * @since 28 Feb 2017
 * 
 */
public interface IJQUISelectMenuItem 
{

    /**
     * Sets the item as disabled
     *
     * @param disabled
     * @return
     */
    JQUISelectMenuItem setDisabled(boolean disabled);

    /**
     * Sets the label
     *
     * @param label
     * @return
     */
    JQUISelectMenuItem setLabel(String label);

    /**
     * If the item is selected
     *
     * @param selected
     * @return
     */
    JQUISelectMenuItem setSelected(boolean selected);

}
