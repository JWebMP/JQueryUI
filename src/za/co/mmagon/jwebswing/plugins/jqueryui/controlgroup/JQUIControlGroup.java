/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.controlgroup;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
@ComponentInformation(name = "JQuery UI Control Group", description = "Groups multiple buttons and other widgets into one visual set.",
        url = "http://jqueryui.com/controlgroup/#default", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")
public class JQUIControlGroup extends Div
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new control group div
     */
    public JQUIControlGroup()
    {
        addFeature(new JQUIControlGroupFeature(this));
    }
}
