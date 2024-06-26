package com.vation.core.models;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LabelDetails {

   
    @ValueMapValue
    private String linktitle;

   
    @ValueMapValue
    private String link;

    public String getLinktitle() {
        return linktitle;
    }

    public String getLink() {
        return link;
    }

    
}
