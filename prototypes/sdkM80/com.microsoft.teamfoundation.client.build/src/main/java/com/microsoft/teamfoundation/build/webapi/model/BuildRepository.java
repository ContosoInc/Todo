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

    /**
     * Getter for CheckoutSubmodules
     * @return boolean
     */
    public boolean getCheckoutSubmodules() {
        return checkoutSubmodules;
    }

    /**
     * Setter for CheckoutSubmodules
     * @param checkoutSubmodules
     */
    public void setCheckoutSubmodules(final boolean checkoutSubmodules) {
        this.checkoutSubmodules = checkoutSubmodules;
    }

    /**
     * Getter for Clean
     * @return String
     */
    public String getClean() {
        return clean;
    }

    /**
     * Setter for Clean
     * @param clean
     */
    public void setClean(final String clean) {
        this.clean = clean;
    }

    /**
     * Getter for DefaultBranch
     * @return String
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    /**
     * Setter for DefaultBranch
     * @param defaultBranch
     */
    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    /**
     * Getter for Id
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * Getter for Name
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for Name
     * @param name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for Properties
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getProperties() {
        return properties;
    }

    /**
     * Setter for Properties
     * @param properties
     */
    public void setProperties(final HashMap<String,String> properties) {
        this.properties = properties;
    }

    /**
     * Getter for RootFolder
     * @return String
     */
    public String getRootFolder() {
        return rootFolder;
    }

    /**
     * Setter for RootFolder
     * @param rootFolder
     */
    public void setRootFolder(final String rootFolder) {
        this.rootFolder = rootFolder;
    }

    /**
     * Getter for Type
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for Type
     * @param type
     */
    public void setType(final String type) {
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
