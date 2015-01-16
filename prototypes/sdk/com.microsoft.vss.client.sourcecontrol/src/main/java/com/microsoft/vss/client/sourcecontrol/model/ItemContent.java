package com.microsoft.vss.client.sourcecontrol.model;

import com.microsoft.vss.client.sourcecontrol.model.enumeration.ItemContentType;

public class ItemContent {
    private String content;
    private ItemContentType contentType;

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public ItemContentType getContentType() {
        return contentType;
    }

    public void setContentType(final ItemContentType contentType) {
        this.contentType = contentType;
    }
}
