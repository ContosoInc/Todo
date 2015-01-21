package com.microsoft.vss.client.sourcecontrol.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.core.model.IdentityRef;
import com.microsoft.vss.client.core.model.ReferenceLinks;

public class GitRef {
    private String name;
    private String objectId;
    private IdentityRef isLockedBy;
    public String url;
    private ReferenceLinks links;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(final String objectId) {
        this.objectId = objectId;
    }

    public IdentityRef getIsLockedBy() {
        return isLockedBy;
    }

    public void setIsLockedBy(final IdentityRef isLockedBy) {
        this.isLockedBy = isLockedBy;
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
