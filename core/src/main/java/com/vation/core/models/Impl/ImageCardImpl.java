package com.vation.core.models.Impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.vation.core.models.ImageCard;
import com.vation.core.models.ImageCard.CardItem;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.util.List;

@Model(adaptables = Resource.class, adapters = ImageCard.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageCardImpl implements ImageCard {

    @ValueMapValue
    private String mtitle;

    @ValueMapValue
    private String mdescription;

    @ChildResource(name = "cards")
    private List<CardItemImpl> cards;

    @Override
    public String getMtitle() {
        return mtitle;
    }

    @Override
    public String getMdescription() {
        return mdescription;
    }

    @Override
    public List<CardItem> getCards() {
        return (List<CardItem>) (List<?>) cards;
    }

    @Model(adaptables = Resource.class)
    public static class CardItemImpl implements CardItem {

        @ValueMapValue
        private String title;

        @ValueMapValue
        private String description;

        @ValueMapValue
        private String link;

        @ValueMapValue
        private String linktitle;

        @ValueMapValue
        private String fileReferenceImage;

        @ValueMapValue
        private String imagealttext;

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public String getLink() {
            return link;
        }

        @Override
        public String getLinktitle() {
            return linktitle;
        }

        @Override
        public String getFileReferenceImage() {
            return fileReferenceImage;
        }

        @Override
        public String getImagealttext() {
            return imagealttext;
        }
    }
}
