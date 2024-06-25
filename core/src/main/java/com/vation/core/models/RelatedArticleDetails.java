package com.vation.core.models;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RelatedArticleDetails {

    /**
     * The relatedArticleImage.
     */
    @ValueMapValue
    private String relatedArticleImage;

    /**
     * The imageTitle.
     */
    @ValueMapValue
    private String imageTitle;

    /**
     * The imageTitleNavigation.
     */
    @ValueMapValue
    private String imageTitleNavigation;

    /**
     * return relatedArticleImage
     */
    public String getRelatedArticleImage() {
        return relatedArticleImage;
    }

    /**
     * return imageTitle
     */
    public String getImageTitle() {
        return imageTitle;
    }

    /**
     * return imageTitleNavigation
     */
    public String getImageTitleNavigation() {
        return imageTitleNavigation;
    }

}
