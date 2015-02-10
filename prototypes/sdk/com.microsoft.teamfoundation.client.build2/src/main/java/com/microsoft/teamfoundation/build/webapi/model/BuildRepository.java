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

public class BuildRepository {

    private boolean checkoutSubmodules;
    private String clean;
    private String defaultBranch;
    private String id;
    private String name;
    private HashMap<String,String> properties;
    private String rootFolder;
    private String type;
    private String url;

    public boolean getCheckoutSubmodules() {
        return checkoutSubmodules;
    }

    public void setCheckoutSubmodules(final boolean checkoutSubmodules) {
        this.checkoutSubmodules = checkoutSubmodules;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(final String clean) {
        this.clean = clean;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String,String> getProperties() {
        return properties;
    }

    public void setProperties(final HashMap<String,String> properties) {
        this.properties = properties;
    }

    public String getRootFolder() {
        return rootFolder;
    }

    public void setRootFolder(final String rootFolder) {
        this.rootFolder = rootFolder;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
