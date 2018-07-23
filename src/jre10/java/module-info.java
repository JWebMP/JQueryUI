import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.jqueryui.JQUIPageConfigurator;

module com.jwebmp.plugins.jqueryui {

	exports com.jwebmp.plugins.jqueryui;
	exports com.jwebmp.plugins.jqueryui.events;
	exports com.jwebmp.plugins.jqueryui.accordion;
	exports com.jwebmp.plugins.jqueryui.accordion.enumerations;
	exports com.jwebmp.plugins.jqueryui.accordion.interfaces;
	exports com.jwebmp.plugins.jqueryui.accordion.options;
	exports com.jwebmp.plugins.jqueryui.autocomplete;
	exports com.jwebmp.plugins.jqueryui.autocomplete.enumerations;
	exports com.jwebmp.plugins.jqueryui.autocomplete.interfaces;
	exports com.jwebmp.plugins.jqueryui.autocomplete.options;
	exports com.jwebmp.plugins.jqueryui.button;
	exports com.jwebmp.plugins.jqueryui.button.enumerations;
	exports com.jwebmp.plugins.jqueryui.button.interfaces;
	exports com.jwebmp.plugins.jqueryui.button.options;
	exports com.jwebmp.plugins.jqueryui.checkboxradio.interfaces;
	exports com.jwebmp.plugins.jqueryui.checkboxradio.options;
	exports com.jwebmp.plugins.jqueryui.controlgroup;
	exports com.jwebmp.plugins.jqueryui.controlgroup.options;
	exports com.jwebmp.plugins.jqueryui.datepicker;
	exports com.jwebmp.plugins.jqueryui.datepicker.interfaces;
	exports com.jwebmp.plugins.jqueryui.datepicker.options;
	exports com.jwebmp.plugins.jqueryui.dialog;
	exports com.jwebmp.plugins.jqueryui.dialog.interfaces;
	exports com.jwebmp.plugins.jqueryui.dialog.options;
	exports com.jwebmp.plugins.jqueryui.draggable;
	exports com.jwebmp.plugins.jqueryui.draggable.enumerations;
	exports com.jwebmp.plugins.jqueryui.draggable.interfaces;
	exports com.jwebmp.plugins.jqueryui.draggable.options;
	exports com.jwebmp.plugins.jqueryui.droppable;
	exports com.jwebmp.plugins.jqueryui.droppable.enumerations;
	exports com.jwebmp.plugins.jqueryui.droppable.interfaces;
	exports com.jwebmp.plugins.jqueryui.droppable.options;
	exports com.jwebmp.plugins.jqueryui.menu;
	exports com.jwebmp.plugins.jqueryui.menu.interfaces;
	exports com.jwebmp.plugins.jqueryui.menu.options;
	exports com.jwebmp.plugins.jqueryui.position;
	exports com.jwebmp.plugins.jqueryui.position.enumerations;
	exports com.jwebmp.plugins.jqueryui.position.options;
	exports com.jwebmp.plugins.jqueryui.progressbar;
	exports com.jwebmp.plugins.jqueryui.progressbar.interfaces;
	exports com.jwebmp.plugins.jqueryui.progressbar.options;
	exports com.jwebmp.plugins.jqueryui.resizable;
	exports com.jwebmp.plugins.jqueryui.resizable.interfaces;
	exports com.jwebmp.plugins.jqueryui.resizable.options;
	exports com.jwebmp.plugins.jqueryui.selectable;
	exports com.jwebmp.plugins.jqueryui.selectable.interfaces;
	exports com.jwebmp.plugins.jqueryui.selectable.options;
	exports com.jwebmp.plugins.jqueryui.selectmenu;
	exports com.jwebmp.plugins.jqueryui.selectmenu.interfaces;
	exports com.jwebmp.plugins.jqueryui.selectmenu.options;
	exports com.jwebmp.plugins.jqueryui.slider;
	exports com.jwebmp.plugins.jqueryui.slider.enumerations;
	exports com.jwebmp.plugins.jqueryui.slider.interfaces;
	exports com.jwebmp.plugins.jqueryui.slider.options;
	exports com.jwebmp.plugins.jqueryui.sortable;
	exports com.jwebmp.plugins.jqueryui.sortable.enumerations;
	exports com.jwebmp.plugins.jqueryui.sortable.interfaces;
	exports com.jwebmp.plugins.jqueryui.sortable.options;
	exports com.jwebmp.plugins.jqueryui.spinner;
	exports com.jwebmp.plugins.jqueryui.spinner.interfaces;
	exports com.jwebmp.plugins.jqueryui.spinner.options;
	exports com.jwebmp.plugins.jqueryui.tabs;
	exports com.jwebmp.plugins.jqueryui.tabs.interfaces;
	exports com.jwebmp.plugins.jqueryui.tabs.options;
	exports com.jwebmp.plugins.jqueryui.themes;
	exports com.jwebmp.plugins.jqueryui.tooltips;
	exports com.jwebmp.plugins.jqueryui.tooltips.interfaces;
	exports com.jwebmp.plugins.jqueryui.tooltips.options;

	exports com.jwebmp.plugins.jqueryui.pools;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.plugins.globalize.cultures;
	requires com.jwebmp.guicedservlets;

	provides IPageConfigurator with JQUIPageConfigurator;

}
