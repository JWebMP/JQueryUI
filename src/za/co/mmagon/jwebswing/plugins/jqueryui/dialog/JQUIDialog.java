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
package za.co.mmagon.jwebswing.plugins.jqueryui.dialog;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;

/**
 * A JQuery UI Panel with all bells
 *
 * @author Marc Magon
 */
public class JQUIDialog extends Div<JQUIDialogChildren, NoAttributes, JQUIDialogFeatures, JQUIDialogEvents, JQUIDialog>
{

    private static final long serialVersionUID = 1L;

    private final JQUIDialogFeature jwDialogFeature;
    private JQUIDialogOptions options;

    /**
     * Constructs a new JQuery Dialog with the given title as an attribute
     * <p>
     * @param title The title to build with
     */
    public JQUIDialog(String title)
    {
        jwDialogFeature = new JQUIDialogFeature(this);
        addFeature(jwDialogFeature);
        addAttribute(GlobalAttributes.Title, title);
    }

    /**
     * Instantiates the options on call
     * <p>
     * @return
     */
    @Override
    public JQUIDialogOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUIDialogOptions();
        }
        return options;
    }
}
