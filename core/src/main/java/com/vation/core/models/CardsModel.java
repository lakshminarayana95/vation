package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;


@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardsModel {

    @SlingObject
    SlingHttpServletRequest slingRequest;

  
    @ValueMapValue
    private String title;

    
    @ValueMapValue
    private String description;

    @ValueMapValue
    private String subdescription;


    @ChildResource
    @Via("resource")
    private List<LabelDetails> label;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSubdescription() {
        return subdescription;
    }

    public List<LabelDetails> getLabel() {
        return label;
    }

    public List<CardsDetails> getCardsDetails() {
        return cardsDetails;
    }

    @ChildResource
    @Via("resource")
    private List<CardsDetails> cardsDetails;

}