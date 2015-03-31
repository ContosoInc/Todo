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

public class GitPushRef {

    private Date date;
    private ReferenceLinks links;
    private UUID pushCorrelationId;
    private IdentityRef pushedBy;
    private int pushId;
    private String url;

    /**
     * Getter for Date
     * @return Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Setter for Date
     * @param date
     */
    public void setDate(final Date date) {
        this.date = date;
    }

    /**
     * Getter for Links
     * @return ReferenceLinks
     */
    public ReferenceLinks getLinks() {
        return links;
    }

    /**
     * Setter for Links
     * @param links
     */
    public void setLinks(final ReferenceLinks links) {
        this.links = links;
    }

    /**
     * Getter for PushCorrelationId
     * @return UUID
     */
    public UUID getPushCorrelationId() {
        return pushCorrelationId;
    }

    /**
     * Setter for PushCorrelationId
     * @param pushCorrelationId
     */
    public void setPushCorrelationId(final UUID pushCorrelationId) {
        this.pushCorrelationId = pushCorrelationId;
    }

    /**
     * Getter for PushedBy
     * @return IdentityRef
     */
    public IdentityRef getPushedBy() {
        return pushedBy;
    }

    /**
     * Setter for PushedBy
     * @param pushedBy
     */
    public void setPushedBy(final IdentityRef pushedBy) {
        this.pushedBy = pushedBy;
    }

    /**
     * Getter for PushId
     * @return int
     */
    public int getPushId() {
        return pushId;
    }

    /**
     * Setter for PushId
     * @param pushId
     */
    public void setPushId(final int pushId) {
        this.pushId = pushId;
    }

    /**
     * Getter for Url
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url
     * @param url
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
