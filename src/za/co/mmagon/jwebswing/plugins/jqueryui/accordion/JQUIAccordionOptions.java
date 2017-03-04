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
package za.co.mmagon.jwebswing.plugins.jqueryui.accordion;

import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.events.enumerations.EventTypes;
import za.co.mmagon.jwebswing.plugins.easingeffects.JQEasingAnimationEffectsPart;

/**
 * Specifies all the accordion tabs
 *
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * <p>
 *
 */
public class JQUIAccordionOptions extends JavaScriptPart
{

    private static final long serialVersionUID = 1L;

    /**
     * Which panel index is currently open.
     */
    private Integer active;
    /**
     * The animation to be used
     */
    private JQEasingAnimationEffectsPart animate;
    /**
     * Whether all the sections can be closed at once. Allows collapsing the active section.
     */
    private Boolean collapsible;
    /**
     * Whether or not the accordion is disabled
     */
    private Boolean disabled;
    /**
     * The event that accordion headers will react to in order to activate the associated panel. Multiple events can be specified, separated by a space.
     */
    private EventTypes event;
    /**
     * The header type that denotes a header
     */
    private HeaderTypes header;
    /**
     * The type of height handling to apply
     */
    private JQUIAccordionHeightStyle heightStyle;
    /**
     * The closed and open icon style
     */
    private JQUIAccordionIconOptions icons;

    /**
     * Constructs a new instance of the available JQuery UI Accordion Options
     */
    public JQUIAccordionOptions()
    {
    }

    /**
     * Returns the panel that is active
     *
     * @return
     */
    public Integer getActive()
    {
        return active;
    }

    /**
     * Sets the panel that is active
     *
     * @param active
     * @return
     */
    public JQUIAccordionOptions setActive(Integer active)
    {
        this.active = active;
        return this;
    }

    /**
     * Gets and Sets the Animate
     *
     * @return
     */
    public JQEasingAnimationEffectsPart getAnimate()
    {
        if (animate == null)
        {
            animate = new JQEasingAnimationEffectsPart();
        }
        return animate;
    }

    /**
     * Sets the animation
     *
     * @param animate
     * @return
     */
    public JQUIAccordionOptions setAnimate(JQEasingAnimationEffectsPart animate)
    {
        this.animate = animate;
        return this;
    }

    /**
     * Returns Whether all the sections can be closed at once. Allows collapsing the active section.
     *
     * @return
     */
    public Boolean getCollapsible()
    {
        return collapsible;
    }

    /**
     * Sets Whether all the sections can be closed at once. Allows collapsing the active section.
     *
     * @param collapsible
     * @return
     */
    public JQUIAccordionOptions setCollapsible(Boolean collapsible)
    {
        this.collapsible = collapsible;
        return this;
    }

    /**
     * Gets the disabled flag for the accordion
     *
     * @return
     */
    public Boolean getDisabled()
    {
        return disabled;
    }

    /**
     * Sets the disabled flag for the accordion
     *
     * @param disabled
     * @return
     */
    public JQUIAccordionOptions setDisabled(Boolean disabled)
    {
        this.disabled = disabled;
        return this;
    }

    /**
     * Gets all the events that will trigger the accordion
     *
     * @return
     */
    public EventTypes getEvent()
    {
        return event;
    }

    /**
     * Sets the event that will trigger the accordion
     *
     * @param event
     * @return
     */
    public JQUIAccordionOptions setEvent(EventTypes event)
    {
        this.event = event;
        return this;
    }

    /**
     * Gets the header type that marks a group
     *
     * @return
     */
    public HeaderTypes getHeader()
    {
        return header;
    }

    /**
     * Sets the header type to be used as a group
     *
     * @param header
     * @return
     */
    public JQUIAccordionOptions setHeader(HeaderTypes header)
    {
        this.header = header;
        return this;
    }

    /**
     * Gets the height style
     *
     * @return
     */
    public JQUIAccordionHeightStyle getHeightStyle()
    {
        return heightStyle;
    }

    /**
     * Sets the height style
     *
     * @param heightStyle
     * @return
     */
    public JQUIAccordionOptions setHeightStyle(JQUIAccordionHeightStyle heightStyle)
    {
        this.heightStyle = heightStyle;
        return this;
    }

    /**
     * Gets the Icon Options
     *
     * @return
     */
    public JQUIAccordionIconOptions getIcons()
    {
        if (icons == null)
        {
            icons = new JQUIAccordionIconOptions();
        }
        return icons;
    }

    /**
     * Sets the icon options
     *
     * @param icons
     * @return
     */
    public JQUIAccordionOptions setIcons(JQUIAccordionIconOptions icons)
    {
        this.icons = icons;
        return this;
    }
}
