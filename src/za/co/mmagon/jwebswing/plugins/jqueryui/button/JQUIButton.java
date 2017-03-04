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

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.*;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqueryui.accordion.JQUIAccordionChildren;

/**
 * This class implements the JQuery UI implementation of a normal button
 *
 * @author MMagon
 * @param <J>
 *
 * @since 09 Mar 2013
 * @version 1.0
 *
 * Update 2014/07/09 - Added attribute for identification in JQuery. Minimizing the JavaScript being sent through.
 */
@ComponentInformation(name = "JQuery UI Button", description = "Enhances standard form elements like buttons, inputs and anchors to themeable buttons with appropriate hover and active styles.",
        url = "http://jqueryui.com/button/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIButton<J extends JQUIButton>
        extends Component<JQUIButtonChildren, ButtonAttributes, JQUIButtonFeatures, JQUIButtonEvents, J>
        implements GlobalChildren, NoNewLineBeforeClosingTag, NoNewLineForRawText, JQUIAccordionChildren
{

    private static final long serialVersionUID = 1L;

    private JQUIButtonFeature feature;

    /**
     * Constructs a new JWButton
     */
    public JQUIButton()
    {
        this(null);
    }

    /**
     * Constructs a new Button of type button
     *
     * @param text
     */
    public JQUIButton(String text)
    {
        super(ComponentTypes.Button);
        setText(text);
        getFeature();
    }

    /**
     * Returns the button options from the feature
     *
     * @return
     */
    @Override
    public JQUIButtonOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Returns the feature associated with this object
     *
     * @return
     */
    public final JQUIButtonFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIButtonFeature(this);
            addFeature(feature);
        }
        return feature;
    }

}
