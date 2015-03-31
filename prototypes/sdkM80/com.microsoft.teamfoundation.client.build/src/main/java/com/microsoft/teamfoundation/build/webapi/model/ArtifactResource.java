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

public class ArtifactResource {

    private String data;
    private String downloadUrl;
    private ArtifactResourceType type;
    private String url;

    /**
     * Getter for Data
     * @return String
     */
    public String getData() {
        return data;
    }

    /**
     * Setter for Data
     * @param data
     */
    public void setData(final String data) {
        this.data = data;
    }

    /**
     * Getter for DownloadUrl
     * @return String
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Setter for DownloadUrl
     * @param downloadUrl
     */
    public void setDownloadUrl(final String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * Getter for Type
     * @return ArtifactResourceType
     */
    public ArtifactResourceType getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final ArtifactResourceType type) {
        this.type = type;
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
