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
package za.co.mmagon.jwebswing.plugins.jqueryui;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQueryUIReferencePool;
import za.co.mmagon.logger.LogFactory;

/**
 * Checks if a UI component is used on the page and adds
 *
 * @author GedMarc
 * @since 13 Feb 2017
 *
 */
@PluginInformation(pluginName = "JQuery UI",
                   pluginUniqueName = "jquery-ui",
                   pluginDescription = "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.",
                   pluginVersion = "1.12.1",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "jquery, ui, jquery-ui,themes, styles, styling",
                   pluginSubtitle = "A complete UI framework built using JQuery",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin",
                   pluginSourceUrl = "http://jqueryui.com/",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki",
                   pluginOriginalHomepage = "http://jqueryui.com/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryUIPlugin.jar/download",
                   pluginIconUrl = "bower_components/jquery-ui/jqueryui_icon.ico",
                   pluginIconImageUrl = "bower_components/jquery-ui/jqueryui_example.jpg",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class JQUIPageConfigurator extends PageConfigurator
{

    private static final Logger log = LogFactory.getInstance().getLogger("JQueryUIConfigurator");
    public static String JQueryUIEnabled = "jquery-ui-enabled";
    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            //boolean isUsed = page.getBody().readChildrenPropertyFirstResult(JQueryUIEnabled, true);
            //if (isUsed)
            //{
            page.getBody().getJavascriptReferences().add(JQueryUIReferencePool.Core.getJavaScriptReference());
            page.getBody().getCssReferences().add(JQueryUIReferencePool.Core.getCssReference());
            //}
        }
        return page;
    }
}
