/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.build.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.visualstudio.services.forminput.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.model.*;
import com.microsoft.teamfoundation.build.webapi.events.model.*;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ArtifactResource {

    private String data;
    private String downloadUrl;
    private ArtifactResourceType type;
    private String url;

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public ArtifactResourceType getType() {
        return type;
    }

    public void setType(final ArtifactResourceType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
