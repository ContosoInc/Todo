package com.microsoft.tfs.sdk.build.model;

import com.microsoft.tfs.sdk.build.model.enumeration.ArtifactResourceType;

/**
 * Created by yacao on 12/12/2014.
 */
public final class LogLocationReference {
    private ArtifactResourceType type;
    private String url;

    public ArtifactResourceType getType() {
        return type;
    }

    public void setType(ArtifactResourceType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
