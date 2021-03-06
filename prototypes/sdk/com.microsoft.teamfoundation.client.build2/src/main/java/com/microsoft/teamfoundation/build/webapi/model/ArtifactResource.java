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

package com.microsoft.teamfoundation.build.webapi.model;


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
