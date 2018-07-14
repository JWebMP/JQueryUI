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
package com.jwebmp.plugins.jqueryui.position.options;

import com.jwebmp.Component;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationHorizontal;
import com.jwebmp.plugins.jqueryui.position.enumerations.PositionLocationVertical;

import javax.validation.constraints.NotNull;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * This defines the JavaScript part for JQuery UI for Position
 *
 * @author MMagon
 * @version 1.0
 * @since 07 Apr 2013
 */
@ComponentInformation(name = "JQuery UI Position",
		description = "Position an element relative to the window, document, another element, " + "" + "" + "" + "or the cursor/mouse.",
		url = "http://jqueryui.com/position/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class PositionOptions<J extends PositionOptions<J>>
		extends JavaScriptPart<J>
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
	public PositionOptions()
	{
		//Nothing needed here
	}

	/**
	 * Constructs a new JavaScript Part "Position"
	 *
	 * @param myX
	 * 		My X Location
	 * @param myY
	 * 		My Y Location
	 * @param atX
	 * 		At X Location
	 * @param atY
	 * 		At Y Location
	 * @param of
	 * 		Of Which Component
	 */
	public PositionOptions(PositionLocationHorizontal myX, PositionLocationVertical myY, PositionLocationHorizontal atX, PositionLocationVertical atY, ComponentHierarchyBase of)
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
	 *
	 * @param myX
	 * @param atX
	 */
	public PositionOptions(PositionLocationHorizontal myX, PositionLocationHorizontal atX)
	{
		this.myX = myX;
		this.atX = atX;
	}

	/**
	 * At target X
	 * <p>
	 *
	 * @param atX
	 */
	public PositionOptions(PositionLocationHorizontal atX)
	{
		this.atX = atX;
	}

	/**
	 * My X at X of Component
	 * <p>
	 *
	 * @param myX
	 * @param atX
	 * @param of
	 */
	public PositionOptions(PositionLocationHorizontal myX, PositionLocationHorizontal atX, Component of)
	{
		this.myX = myX;
		this.atX = atX;
		this.of = of.getID(true);
	}

	/**
	 * My 7 at target Y
	 * <p>
	 *
	 * @param myY
	 * @param atY
	 */
	public PositionOptions(PositionLocationVertical myY, PositionLocationVertical atY)
	{
		this.myY = myY;
		this.atY = atY;
	}

	/**
	 * My corners at corners
	 * <p>
	 *
	 * @param myX
	 * @param myY
	 * @param atX
	 * @param atY
	 */
	public PositionOptions(PositionLocationHorizontal myX, PositionLocationVertical myY, PositionLocationHorizontal atX, PositionLocationVertical atY)
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
		return myX.name() + STRING_SPACE + myY.name() + STRING_EMPTY;
	}

	/**
	 * Gets the At String Part
	 *
	 * @return The Section of "At" Part
	 */
	public String getAtString()
	{
		return atX.name() + STRING_SPACE + atY.name() + STRING_EMPTY;
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setOf(Component comp)
	{
		of = comp.getID(true);
		return (J) this;
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAt(String at)
	{
		this.at = at;
		return (J) this;
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMy(String my)
	{
		this.my = my;
		return (J) this;
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setOf(String of)
	{
		this.of = of;
		return (J) this;
	}

	/**
	 * Sets the location for position x
	 *
	 * @param myX
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMyX(PositionLocationHorizontal myX)
	{
		this.myX = myX;
		return (J) this;
	}

	/**
	 * Sets the location for position y
	 *
	 * @param myY
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMyY(PositionLocationVertical myY)
	{
		this.myY = myY;
		return (J) this;
	}

	/**
	 * Sets the position at x
	 *
	 * @param atX
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAtX(PositionLocationHorizontal atX)
	{
		this.atX = atX;
		return (J) this;
	}

	/**
	 * Sets the position at y
	 *
	 * @param atY
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setAtY(PositionLocationVertical atY)
	{
		this.atY = atY;
		return (J) this;
	}

}
