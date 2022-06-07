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
package com.jwebmp.plugins.jqueryui;

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

/**
 * Checks if a UI component is used on the page and adds
 *
 * @author GedMarc
 * @since 13 Feb 2017
 */
@PluginInformation(pluginName = "JQuery UI",
		pluginUniqueName = "jquery-ui",
		pluginDescription = "jQuery UI is a curated set of user interface interactions, effects, widgets, and themes built on top of the jQuery JavaScript Library. Whether you're building highly interactive web applications or you just need to add a date picker to a form control, jQuery UI is the perfect choice.",
		pluginVersion = "1.13.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jquery, ui, jquery-ui,themes, styles, styling,framework",
		pluginSubtitle = "A complete UI framework built using JQuery",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin",
		pluginSourceUrl = "https://github.com/jquery/jquery-ui",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki",
		pluginOriginalHomepage = "http://jqueryui.com/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.jquery/jwebmp-jquery-ui",
		pluginIconUrl = "bower_components/jquery-ui/jqueryui_icon.ico",
		pluginIconImageUrl = "bower_components/jquery-ui/jqueryui_example.jpg",
		pluginLastUpdatedDate = "2021/10/08",
		pluginGroupId = "com.jwebmp.plugins.jquery",
		pluginArtifactId = "jwebmp-jquery-ui",
		pluginModuleName = "com.jwebmp.plugins.jqueryui",
		pluginSourceDonateUrl = "https://js.foundation/about/donate",
		pluginStatus = PluginStatus.Released
)
@TsDependency(value = "jquery-ui-dist",version = "^1.13.1")
@NgScript(value = "jquery-ui-dist/jquery-ui.js",sortOrder = 15)
@NgStyleSheet("jquery-ui-dist/jquery-ui.css")
@NgStyleSheet("jquery-ui-dist/jquery-ui.theme.css")
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
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		JQUIPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQUIPageConfigurator.enabled;
	}
}
