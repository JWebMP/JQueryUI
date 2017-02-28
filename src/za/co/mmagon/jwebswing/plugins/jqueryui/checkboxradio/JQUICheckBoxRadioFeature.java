/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.checkboxradio;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.plugins.pools.jqueryui.JQUIReferencePool;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public class JQUICheckBoxRadioFeature extends Feature
{

    private static final long serialVersionUID = 1L;
    private JQUICheckBoxRadioOptions options;

    public JQUICheckBoxRadioFeature(Component component)
    {
        super("JQUICHeckBoxRadioFeature");
        setComponent(component);
        getJavascriptReferences().add(JQUIReferencePool.Core.getJavaScriptReference());
        getJavascriptReferences().add(JQUIReferencePool.Widget.getJavaScriptReference());
        getCssReferences().add(JQUIReferencePool.Core.getCssReference());
        getCssReferences().add(JQUIReferencePool.Widget.getCssReference());
    }

    @Override
    public JQUICheckBoxRadioOptions getOptions()
    {
        if (options == null)
        {
            options = new JQUICheckBoxRadioOptions();
        }

        return options;
    }

    @Override
    protected void assignFunctionsToComponent()
    {
        addQuery(getComponent().getJQueryID() + "checkboxradio(" + getOptions() + ");");
    }

}
