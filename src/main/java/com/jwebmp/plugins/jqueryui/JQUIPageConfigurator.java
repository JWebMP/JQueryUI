package com.jwebmp.plugins.jqueryui;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;

/**
 * Checks if a UI component is used on the page and adds
 *
 * @author GedMarc
 * @since 13 Feb 2017
 */
@PluginInformation(pluginName = "JQuery UI",
        pluginUniqueName = "jquery-ui",
        pluginDescription = "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.",
        pluginVersion = "1.14.2",
        pluginDependancyUniqueIDs = "jquery",
        pluginCategories = "jquery, ui, jquery-ui, themes, styles, styling, framework",
        pluginSubtitle = "A complete UI framework built using JQuery",
        pluginGitUrl = "https://github.com/JWebMP/JWebMP",
        pluginSourceUrl = "https://github.com/jquery/jquery-ui",
        pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
        pluginOriginalHomepage = "https://jqueryui.com/",
        pluginDownloadUrl = "https://jwebmp.com/",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginLastUpdatedDate = "2025/03/01",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "jquery-ui",
        pluginModuleName = "com.jwebmp.plugins.jqueryui",
        pluginSourceDonateUrl = "https://js.foundation/about/donate",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "jquery-ui", version = "^1.14.2")
@NgScript(value = "jquery-ui/dist/jquery-ui.js", sortOrder = 15)
@NgStyleSheet("jquery-ui/dist/themes/base/jquery-ui.css")
public class JQUIPageConfigurator
        implements IPageConfigurator<JQUIPageConfigurator>
{
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled()
    {
        return JQUIPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable)
    {
        JQUIPageConfigurator.enabled = mustEnable;
    }

    @NotNull
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return JQUIPageConfigurator.enabled;
    }
}
