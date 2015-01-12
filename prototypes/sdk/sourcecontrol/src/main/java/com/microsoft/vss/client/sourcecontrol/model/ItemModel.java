package com.microsoft.vss.client.sourcecontrol.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.core.model.ReferenceLinks;

public abstract class ItemModel {
    private String path;
    private boolean isFolder;
    private FileContentMetadata contentMetadata;
    private boolean isSymbolicLink;
    private String url;
    private ReferenceLinks links;

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(final boolean isFolder) {
        this.isFolder = isFolder;
    }

    public FileContentMetadata getContentMetadata() {
        return contentMetadata;
    }

    public void setContentMetadata(final FileContentMetadata contentMetadata) {
        this.contentMetadata = contentMetadata;
    }

    @JsonProperty("isSymLink")
    public boolean isSymbolicLink() {
        return isSymbolicLink;
    }

    @JsonProperty("isSymLink")
    public void setSymbolicLink(final boolean isSymbolicLink) {
        this.isSymbolicLink = isSymbolicLink;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

}
