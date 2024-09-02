/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.jqueryui.spinner;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.globalize.cultures.GlobalizeCultures;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.IJQUISpinner;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerChildren;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerEvents;
import com.jwebmp.plugins.jqueryui.spinner.interfaces.JQUISpinnerFeatures;
import com.jwebmp.plugins.jqueryui.spinner.options.JQUISpinnerOptions;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * @since Mar 9, 2015
 */
@ComponentInformation(name = "JQuery UI Spinner",
                      description = "The Spinner, or number stepper widget, is perfect for handling all " +
                              "kinds" +
                              " of numeric input. It allows users to type a value " +
                              "directly, or " +
                              "modify an existing value by spinning with the " +
                              "keyboard, mouse or " +
                              "scrollwheel. When combined with " +
                              "Globalize, you can even spin " +
                              "currencies and dates in a " +
                              "variety of locales.",
                      url = "http://jqueryui.com/spinner/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")

public class JQUISpinner<J extends JQUISpinner<J>>
        extends Div<JQUISpinnerChildren, NoAttributes, JQUISpinnerFeatures, JQUISpinnerEvents, J>
        implements IJQUISpinner
{
    /**
     * The header text for the spinner
     */
    private String headerText;
    /**
     * The actual input
     */
    private JQUISpinnerInput<?, ?> input;

    /**
     * The pre-child labour
     */
    private JQUISpinnerLabel<?> label;
    /**
     * The spinner feature
     */
    private JQUISpinnerFeature<?> feature;

    /**
     * Constructs a new spinner paragraph object
     * <p>
     */
    public JQUISpinner()
    {
        this(null);
    }

    /**
     * Constructs a new spinner paragraph object
     * <p>
     *
     * @param labelText THe label of the Spinner
     */
    public JQUISpinner(String labelText)
    {
        input = new JQUISpinnerInput<>();
        input.addFeature(getFeature());
        input.setID(getID() + "_spinnerInput");
        if (labelText != null)
        {
            label = new JQUISpinnerLabel<>(labelText);
            label.setForInputComponent(input);
        }
    }

    public final JQUISpinnerFeature<?> getFeature()
    {
        if (feature == null)
        {
            feature = new JQUISpinnerFeature<>(input);
        }
        return feature;
    }

    /**
     * Adds the specific culture to the options
     *
     * @param culture
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    @NotNull
    public J addGlobalization(GlobalizeCultures culture)
    {
        getOptions().setCulture(culture);
        return (J) this;
    }

    /**
     * Returns the options associated with this spinner
     * <p>
     *
     * @return
     */
    @Override
    @NotNull
    public JQUISpinnerOptions<?> getOptions()
    {
        return feature.getOptions();
    }

    /**
     * Sets the header text
     *
     * @return
     */
    @Override
    public String getHeaderText()
    {
        return headerText;
    }

    /**
     * Returns the input option
     *
     * @return
     */
    @Override
    public JQUISpinnerInput<?, ?> getInput()
    {
        return input;
    }

    /**
     * Returns the label object with this spinner
     * <p>
     *
     * @return
     */
    @Override
    public JQUISpinnerLabel<?> getLabel()
    {
        if (label == null)
        {
            label = new JQUISpinnerLabel<>();
        }
        return label;
    }

    /**
     * Sets the entry label with this spinner
     * <p>
     *
     * @param label
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    @NotNull
    public J setLabel(JQUISpinnerLabel<?> label)
    {
        this.label = label;
        return (J) this;
    }

    /**
     * Sets the Input Object
     *
     * @param input
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public J setInput(JQUISpinnerInput<?, ?> input)
    {
        this.input = input;
        return (J) this;
    }

    /**
     * Gets the header text
     *
     * @param headerText
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    @NotNull
    public J setHeaderText(String headerText)
    {
        this.headerText = headerText;
        return (J) this;
    }

    @Override
    protected StringBuilder renderBeforeTag()
    {
        if (getLabel() != null)
        {
            return new StringBuilder().append(getCurrentTabIndentString())
                                      .append(getLabel().toString(true))
                                      .append(getNewLine());
        }
        else
        {
            return null;
        }
    }

    @Override
    protected void preConfigure()
    {
        if (!isConfigured())
        {
            add(getInput());
        }
        super.preConfigure();
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }
}
