package com.vation.core.models;

import java.util.List;

public interface Cards {
    String getTitle();
    String getDescription();
    String getSubdescription();
    List<Button> getButtons();
    List<CardItem> getCards();

    interface Button {
        String getLink();
        String getLinktitle();
    }

    interface CardItem {
        String getFileReferenceImage();
        String getImagealttext();
    }
}
