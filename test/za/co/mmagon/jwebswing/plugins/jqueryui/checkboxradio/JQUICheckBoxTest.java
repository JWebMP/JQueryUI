/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import org.junit.Test;

/**
 *
 * @author GedMarc
 */
public class JQUICheckBoxTest
{

    public JQUICheckBoxTest()
    {
    }

    @Test
    public void testGetLabel()
    {
        za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio.JQUICheckBox cb = new za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio.JQUICheckBox();
        cb.asMe().setValue("Value 1");
        cb.getOptions().setIcon("Icon");
        cb.getOptions().getClasses().put("class1", "value1");

        System.out.println(cb.toString(true));
        System.out.println(cb.renderJavascript());
    }

}
