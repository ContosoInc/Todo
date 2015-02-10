/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GitPushRef {

    private Date date;
    private ReferenceLinks links;
    private UUID pushCorrelationId;
    private IdentityRef pushedBy;
    private int pushId;
    private String url;

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    @JsonProperty("_links")
    public ReferenceLinks getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    public UUID getPushCorrelationId() {
        return pushCorrelationId;
    }

    public void setPushCorrelationId(final UUID pushCorrelationId) {
        this.pushCorrelationId = pushCorrelationId;
    }

    public IdentityRef getPushedBy() {
        return pushedBy;
    }

    public void setPushedBy(final IdentityRef pushedBy) {
        this.pushedBy = pushedBy;
    }

    public int getPushId() {
        return pushId;
    }

    public void setPushId(final int pushId) {
        this.pushId = pushId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
