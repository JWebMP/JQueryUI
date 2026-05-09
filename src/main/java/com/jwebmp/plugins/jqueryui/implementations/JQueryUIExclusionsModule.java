package com.jwebmp.plugins.jqueryui.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleExclusions;

import java.util.Set;

public class JQueryUIExclusionsModule
        implements IGuiceScanModuleExclusions<JQueryUIExclusionsModule>
{
    @Override
    public Set<String> excludeModules()
    {
        return Set.of("com.jwebmp.plugins.jqueryui");
    }
}
