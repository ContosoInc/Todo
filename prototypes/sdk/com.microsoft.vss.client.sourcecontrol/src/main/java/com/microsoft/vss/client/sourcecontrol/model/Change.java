package com.microsoft.vss.client.sourcecontrol.model;

import com.microsoft.vss.client.sourcecontrol.model.enumeration.VersionControlChangeType;

public class Change<T> {
    private T item;
    private String sourceServerItem;
    private VersionControlChangeType changeType;
    private ItemContent newContent;
    public String url;

    public T getItem() {
        return item;
    }

    public void setItem(final T item) {
        this.item = item;
    }

    public String getSourceServerItem() {
        return sourceServerItem;
    }

    public void setSourceServerItem(final String sourceServerItem) {
        this.sourceServerItem = sourceServerItem;
    }

    public VersionControlChangeType getChangeType() {
        return changeType;
    }

    public void setChangeType(final VersionControlChangeType changeType) {
        this.changeType = changeType;
    }

    public ItemContent getNewContent() {
        return newContent;
    }

    public void setNewContent(final ItemContent newContent) {
        this.newContent = newContent;
    }

}
