package za.co.mmagon.jwebswing.plugins.jqueryui;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQueryUIReferencePool;

/**
 * Checks if a UI component is used on the page and adds
 *
 * @author GedMarc
 * @since 13 Feb 2017
 *
 */
public class JQUIPageConfigurator implements PageConfigurator
{

    public static String JQueryUIEnabled = "jquery-ui-enabled";

    @Override
    public Page configure(Page page)
    {
        boolean isUsed = page.getBody().readChildrenPropertyFirstResult(JQueryUIEnabled, true);
        if (isUsed)
        {
            page.getBody().getJavascriptReferences().add(JQueryUIReferencePool.Core.getJavaScriptReference());
            page.getBody().getCssReferences().add(JQueryUIReferencePool.Core.getCssReference());
        }
        return page;
    }
}
