/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.distributedtask.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.distributedtask.webapi.model.*;

public class JobEndpoint {

    private String authorization;
    private HashMap<String,String> data;
    private int id;
    private String name;
    private String type;
    private String url;

    /**
     * Getter for Authorization
     * @return String
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * Setter for Authorization
     * @param authorization
     */
    public void setAuthorization(final String authorization) {
        this.authorization = authorization;
    }

    /**
     * Getter for Data
     * @return HashMap<String,String>
     */
    public HashMap<String,String> getData() {
        return data;
    }

    /**
     * Setter for Data
     * @param data
     */
    public void setData(final HashMap<String,String> data) {
        this.data = data;
    }

    /**
     * Getter for Id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Setter for Id
     * @param id
     */
    public void setId(final int id) {
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
