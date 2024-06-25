package com.vation.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

/**
 * Sling Model for RelatedArticle component.
 * (/apps/vation/components/relatedArticles)
 */
@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class RelatedArticle {

    @SlingObject
    SlingHttpServletRequest slingRequest;

    /**
     * The headingTitle.
     */
    @ValueMapValue
    private String headingTitle;

    /**
     * The headingNavigation.
     */
    @ValueMapValue
    private String headingNavigation;

    /**
     * relatedArticleDetails node
     */
    @ChildResource
    @Via("resource")
    private List<RelatedArticleDetails> relatedArticleDetails;

    /**
     * return headingTitle
     */
    public String getHeadingTitle() {
        return headingTitle;
    }

    /**
     * return headingNavigation
     */
    public String getHeadingNavigation() {
        return headingNavigation;
    }

    /**
     * return relatedArticleDetails node
     */
    public List<RelatedArticleDetails> getRelatedArticleDetails() {
        return relatedArticleDetails;
    }

}
