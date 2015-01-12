package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.ArtifactResourceType;

public class ArtifactResource {
    private ArtifactResourceType type;
    private String data;
    private String url;
    private String downloadUrl;

    /**
     * The type of the resource: File container, version control folder, UNC
     * path, etc.
     */
    public ArtifactResourceType getType() {
        return type;
    }

    /**
     * The type of the resource: File container, version control folder, UNC
     * path, etc.
     */
    public void setType(final ArtifactResourceType type) {
        this.type = type;
    }

    /**
     * The type-specific resource data. For example, "#/10002/5/drop",
     * "$/drops/5", "\\myshare\myfolder\mydrops\5"
     */
    public String getData() {
        return data;
    }

    /**
     * The type-specific resource data. For example, "#/10002/5/drop",
     * "$/drops/5", "\\myshare\myfolder\mydrops\5"
     */
    public void setData(final String data) {
        this.data = data;
    }

    /**
     * Link to the resource
     */
    public String getUrl() {
        return url;
    }

    /**
     * Link to the resource
     */
    public void setUrl(final String url) {
        this.url = url;
    }

    /**
     * Link to the resource. This might include things like query parameters to
     * download as a zip file
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Link to the resource. This might include things like query parameters to
     * download as a zip file
     */
    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
