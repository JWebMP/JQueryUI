/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.mmagon.jwebswing.plugins.jqueryui.datepicker;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 * 
 */
public interface IJQUIDatePicker 
{

    /**
     * Returns the feature of this date picker
     * <p>
     * @return
     */
    JQUIDatePickerFeature getInputFeature();

    /**
     * Returns the options of an item
     * <p>
     * @return
     */
    JQUIDatePickerOptions getOptions();

}
