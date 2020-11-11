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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqueryui.pools.JQueryUIReferencePool;

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
		pluginVersion = "1.12.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "jquery, ui, jquery-ui,themes, styles, styling",
		pluginSubtitle = "A complete UI framework built using JQuery",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin",
		pluginSourceUrl = "http://jqueryui.com/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki",
		pluginOriginalHomepage = "http://jqueryui.com/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/JQueryUIPlugin.jar/download",
		pluginIconUrl = "bower_components/jquery-ui/jqueryui_icon.ico",
		pluginIconImageUrl = "bower_components/jquery-ui/jqueryui_example.jpg",
		pluginLastUpdatedDate = "2017/03/04")
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
	public Page configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .getJavascriptReferences()
			    .add(JQueryUIReferencePool.Core.getJavaScriptReference());
			page.getBody()
			    .getCssReferences()
			    .add(JQueryUIReferencePool.Core.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return JQUIPageConfigurator.enabled;
	}
}
