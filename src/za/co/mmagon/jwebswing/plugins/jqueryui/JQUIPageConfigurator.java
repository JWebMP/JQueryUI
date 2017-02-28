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
@PluginInformation(pluginName = "JQuery UI", pluginUniqueName = "jquery-ui",
        pluginDescription = "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.",
        pluginVersion = "1.12.1",
        pluginDependancyUniqueIDs = "",
        pluginCategories = "jquery, ui, jquery-ui",
        pluginSubtitle = "A complete UI framework built using JQuery",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin",
        pluginSourceUrl = "http://jqueryui.com/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-JQueryUIPlugin/wiki",
        pluginOriginalHomepage = "http://jqueryui.com/")
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
            boolean isUsed = page.getBody().readChildrenPropertyFirstResult(JQueryUIEnabled, true);
            if (isUsed)
            {
                page.getBody().getJavascriptReferences().add(JQueryUIReferencePool.Core.getJavaScriptReference());
                page.getBody().getCssReferences().add(JQueryUIReferencePool.Core.getCssReference());
            }
        }
        return page;
    }
}
