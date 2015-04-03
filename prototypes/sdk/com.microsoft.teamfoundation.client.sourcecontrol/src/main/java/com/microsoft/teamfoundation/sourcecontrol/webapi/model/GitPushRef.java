/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.visualstudio.services.webapi.model.IdentityRef;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GitPushRef {

    private ReferenceLinks _links;
    private Date date;
    private UUID pushCorrelationId;
    private IdentityRef pushedBy;
    private int pushId;
    private String url;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
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
