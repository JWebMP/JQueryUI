/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.autocomplete;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * The data auto complete entry set
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public class AutoCompleteEntrySet extends JavaScriptPart
{

    /**
     * The available category selections
     * <p>
     * Array: An array can be used for local data. There are two supported formats:
     * <p>
     * An array of strings: [ "Choice1", "Choice2" ] An array of objects with label and value properties: [ { label: "Choice1", value: "value1" }, ... ]
     * <p>
     * The label property is displayed in the suggestion menu. The value will be inserted into the input element when a user selects an item. If just one property is specified, it will be used for
     * both, e.g., if you provide only value properties, the value will also be used as the label.
     */
    private List<AutoCompleteEntries> source;

    private static final long serialVersionUID = 1L;

    public AutoCompleteEntrySet()
    {

    }

    @JsonRawValue
    @JsonValue
    /**
     * Array: An array can be used for local data. There are two supported formats:
     * <p>
     * An array of strings: [ "Choice1", "Choice2" ] An array of objects with label and value properties: [ { label: "Choice1", value: "value1" }, ... ]
     * <p>
     * The label property is displayed in the suggestion menu. The value will be inserted into the input element when a user selects an item. If just one property is specified, it will be used for
     * both, e.g., if you provide only value properties, the value will also be used as the label.
     *
     * @return
     */
    public List<AutoCompleteEntries> getSource()
    {
        if (source == null)
        {
            source = new ArrayList<>();
        }
        return source;
    }

}
