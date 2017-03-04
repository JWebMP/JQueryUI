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
package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.InputRadioType;
import za.co.mmagon.jwebswing.base.html.Label;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 *
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * <p>
 *
 */
@ComponentInformation(name = "JQuery UI Radio Button", description = "Enhances standard checkbox and radio input element to themeable buttons with appropriate hover and active styles.",
        url = "http://jqueryui.com/button/", wikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki")

public class JQUIRadioButton extends InputRadioType implements IJQUICheckBox
{

    private static final long serialVersionUID = 1L;
    /**
     * The label of this checkbox
     */
    private String label;
    /**
     * The feature
     */
    private final JQUICheckBoxRadioFeature feature;

    /**
     * Constructs a new Check Box with the Button feature applied
     *
     * @param label
     */
    public JQUIRadioButton()
    {
        addFeature(feature = new JQUICheckBoxRadioFeature(this));
    }

    public JQUIRadioButton(String label)
    {
        addFeature(feature = new JQUICheckBoxRadioFeature(this));
        this.label = label;
    }

    /**
     * Sets the label of this checkbox
     *
     * @return
     */
    @Override
    public String getLabel()
    {
        return label;
    }

    /**
     * Sets the label of this checkbox
     *
     * @param label
     */
    @Override
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * Gets the value of this checkbox
     *
     * @return
     */
    @Override
    public String getValue()
    {
        return super.getAttribute(GlobalAttributes.Value);
    }

    @Override
    public Input setValue(String value)
    {
        return super.setValue(value); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * A cleaner view of the check box
     *
     * @return
     */
    public IJQUICheckBox asMe()
    {
        return this;
    }

    /**
     * Returns the feature
     *
     * @return
     */
    public JQUICheckBoxRadioFeature getFeature()
    {
        return feature;
    }

    @Override
    public JQUICheckBoxRadioOptions getOptions()
    {
        return getFeature().getOptions();
    }

    @Override
    protected StringBuilder renderBeforeTag()
    {
        Label legend = new Label();
        legend.setText(label);
        legend.setTiny(true);
        legend.setForInputComponent(this);

        return new StringBuilder().append(getCurrentTabIndentString()).append(legend.toString(true)).append(getNewLine());
    }

}
