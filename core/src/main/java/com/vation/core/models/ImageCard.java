// 
package com.vation.core.models;

import java.util.List;

public interface ImageCard {
    String getMtitle();
    String getMdescription();
    List<CardItem> getCards();

    interface CardItem {
        String getTitle();
        String getDescription();
        String getLink();
        String getLinktitle();
        String getFileReferenceImage();
        String getImagealttext();
    }
}
