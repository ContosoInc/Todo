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


public class BuildLogReference {

    private int id;
    private ArtifactResourceType type;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
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
