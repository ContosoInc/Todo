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

public class AssociatedWorkItem {

    private String assignedTo;
    private int id;
    private String state;
    private String title;
    private String url;
    private String webUrl;
    private String workItemType;

    /**
     * Getter for AssignedTo
     * @return String
     */
    public String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Setter for AssignedTo
     * @param assignedTo
     */
    public void setAssignedTo(final String assignedTo) {
        this.assignedTo = assignedTo;
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
     * Getter for State
     * @return String
     */
    public String getState() {
        return state;
    }

    /**
     * Setter for State
     * @param state
     */
    public void setState(final String state) {
        this.state = state;
    }

    /**
     * Getter for Title
     * @return String
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for Title
     * @param title
     */
    public void setTitle(final String title) {
        this.title = title;
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

    /**
     * Getter for WebUrl
     * @return String
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Setter for WebUrl
     * @param webUrl
     */
    public void setWebUrl(final String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * Getter for WorkItemType
     * @return String
     */
    public String getWorkItemType() {
        return workItemType;
    }

    /**
     * Setter for WorkItemType
     * @param workItemType
     */
    public void setWorkItemType(final String workItemType) {
        this.workItemType = workItemType;
    }
}
