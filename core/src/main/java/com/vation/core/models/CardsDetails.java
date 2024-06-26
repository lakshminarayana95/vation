
package com.vation.core.models;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardsDetails {

  
    @ValueMapValue
    private String fileReferenceImage;

   
    @ValueMapValue
    private String imagealttext;

    public String getFileReferenceImage() {
        return fileReferenceImage;
    }

    public String getImagealttext() {
        return imagealttext;
    }

}
