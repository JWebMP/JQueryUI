package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * A specific tab for the JWAccordion
 * <p>
 *
 * @author MMagon
 * @version 1.0
 * @since 29 Mar 2013
 */
public class JQUITab<J extends JQUITab<J>>

{
	/**
	 * The header for a tab
	 */
	private ListItem<?> tabHeader;
	/**
	 * The child component for a tab
	 */
	private JQUITabContent<?> tabDisplayComponent;

	/**
	 * Any tab to be displayed
	 *
	 * @param tabHeader
	 * @param tabDisplayComponent
	 */
	public JQUITab(ListItem<?> tabHeader, JQUITabContent<?> tabDisplayComponent)
	{
		if (tabDisplayComponent != null)
		{
			Link<?> tabLink = new Link<>(STRING_HASH + tabDisplayComponent
					                                      .getID(), null, tabHeader.getText(0)
			                                                                       .toString());
			tabHeader.setText((String) null);
			tabHeader.add(tabLink);
		}
		this.tabHeader = tabHeader;
		this.tabDisplayComponent = tabDisplayComponent;
		if (tabDisplayComponent != null)
		{
			tabDisplayComponent
					.addClass(JQUIThemeBlocks.UI_Widget_Content.toString());
		}
	}

	/**
	 * Returns the tab header
	 *
	 * @return
	 */
	public ListItem<?> getTabHeader()
	{
		return tabHeader;
	}

	/**
	 * Sets the tab header
	 *
	 * @param tabHeader
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabHeader(ListItem<?> tabHeader)
	{
		this.tabHeader = tabHeader;
		return (J) this;
	}

	/**
	 * Returns the children of the tab
	 *
	 * @return
	 */
	public JQUITabContent<?> getTabDisplayComponent()
	{
		return tabDisplayComponent;
	}

	/**
	 * Sets the children of the display
	 *
	 * @param tabDisplayComponent
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTabDisplayComponent(JQUITabContent<?> tabDisplayComponent)
	{
		this.tabDisplayComponent = tabDisplayComponent;
		return (J) this;
	}
}
