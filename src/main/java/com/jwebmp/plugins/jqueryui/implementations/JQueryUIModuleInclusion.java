package com.jwebmp.plugins.jqueryui.implementations;

import com.guicedee.client.services.config.IGuiceScanModuleInclusions;

import java.util.Set;

public class JQueryUIModuleInclusion implements IGuiceScanModuleInclusions<JQueryUIModuleInclusion>
{
    @Override
    public Set<String> includeModules()
    {
        return Set.of("com.jwebmp.plugins.jqueryui");
    }
}
