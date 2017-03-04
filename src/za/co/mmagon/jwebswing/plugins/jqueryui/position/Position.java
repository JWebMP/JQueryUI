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
package za.co.mmagon.jwebswing.plugins.jqueryui.position;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * This defines the JavaScript part for JQuery UI for Position
 *
 * @author MMagon
 * @since 07 Apr 2013
 * @version 1.0
 */
@ComponentInformation(name = "JQuery UI Position", description = "Position an element relative to the window, document, another element, or the cursor/mouse.",
        url = "http://jqueryui.com/position/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class Position extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;
    /**
     * My position of x
     */
    private PositionLocationHorizontal myX;
    /**
     * My position at y
     */
    private PositionLocationVertical myY;
    /**
     * Place component at x
     */
    private PositionLocationHorizontal atX;
    /**
     * Place component ad y
     */
    private PositionLocationVertical atY;

    /**
     * The component id for at
     */
    private String at;
    /**
     * The component ID for my
     */
    private String my;
    /**
     * The component ID for of
     */
    private String of;

    /**
     * Blank instantiation
     */
    public Position()
    {
        //Nothing needed here
    }

    /**
     * Constructs a new JavaScript Part "Position"
     *
     * @param myX My X Location
     * @param myY My Y Location
     * @param atX At X Location
     * @param atY At Y Location
     * @param of Of Which Component
     */
    public Position(PositionLocationHorizontal myX, PositionLocationVertical myY, PositionLocationHorizontal atX, PositionLocationVertical atY, ComponentHierarchyBase of)
    {
        this.myY = myY;
        this.myX = myX;
        this.atX = atX;
        this.atY = atY;
        this.of = of.getID(true);
    }

    /**
     * My x at target X
     * <p>
     * @param myX
     * @param atX
     */
    public Position(PositionLocationHorizontal myX, PositionLocationHorizontal atX)
    {
        this.myX = myX;
        this.atX = atX;
    }

    /**
     * At target X
     * <p>
     * @param atX
     */
    public Position(PositionLocationHorizontal atX)
    {
        this.atX = atX;
    }

    /**
     * My X at X of Component
     * <p>
     * @param myX
     * @param atX
     * @param of
     */
    public Position(PositionLocationHorizontal myX, PositionLocationHorizontal atX, Component of)
    {
        this.myX = myX;
        this.atX = atX;
        this.of = of.getID(true);
    }

    /**
     * My 7 at target Y
     * <p>
     * @param myY
     * @param atY
     */
    public Position(PositionLocationVertical myY, PositionLocationVertical atY)
    {
        this.myY = myY;
        this.atY = atY;
    }

    /**
     * My corners at corners
     * <p>
     * @param myX
     * @param myY
     * @param atX
     * @param atY
     */
    public Position(PositionLocationHorizontal myX, PositionLocationVertical myY, PositionLocationHorizontal atX, PositionLocationVertical atY)
    {
        this.myX = myX;
        this.myY = myY;
        this.atX = atX;
        this.atY = atY;
    }

    /**
     * Gets the My String Part
     *
     * @return The Section of "My" Part
     */
    public String getMyString()
    {
        return myX.name() + " " + myY.name() + "";
    }

    /**
     * Gets the At String Part
     *
     * @return The Section of "At" Part
     */
    public String getAtString()
    {
        return atX.name() + " " + atY.name() + "";
    }

    /**
     * The Of String Part
     *
     * @return The Component ID to position at
     */
    public String getOfString()
    {
        return of;
    }

    /**
     * Set the component
     *
     * @param comp
     */
    public void setOf(Component comp)
    {
        this.of = comp.getID(true);
    }

    /**
     * gets the at component string
     *
     * @return
     */
    public String getAt()
    {
        return at;
    }

    /**
     * Sets the at
     *
     * @param at
     */
    public void setAt(String at)
    {
        this.at = at;
    }

    /**
     * Returns the my
     *
     * @return
     */
    public String getMy()
    {
        return my;
    }

    /**
     * Sets the my
     *
     * @param my
     */
    public void setMy(String my)
    {
        this.my = my;
    }

    /**
     * Returns the id of the component of
     *
     * @return
     */
    public String getOf()
    {
        return of;
    }

    /**
     * sets the #id of the component
     *
     * @param of
     */
    public void setOf(String of)
    {
        this.of = of;
    }

    /**
     * Sets the location for position x
     *
     * @param myX
     */
    public void setMyX(PositionLocationHorizontal myX)
    {
        this.myX = myX;
    }

    /**
     * Sets the location for position y
     *
     * @param myY
     */
    public void setMyY(PositionLocationVertical myY)
    {
        this.myY = myY;
    }

    /**
     * Sets the position at x
     *
     * @param atX
     */
    public void setAtX(PositionLocationHorizontal atX)
    {
        this.atX = atX;
    }

    /**
     * Sets the position at y
     *
     * @param atY
     */
    public void setAtY(PositionLocationVertical atY)
    {
        this.atY = atY;
    }

}
