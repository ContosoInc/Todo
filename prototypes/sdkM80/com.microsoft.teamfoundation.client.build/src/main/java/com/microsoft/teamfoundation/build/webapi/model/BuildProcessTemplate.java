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

public class BuildProcessTemplate {

    private String description;
    private boolean fileExists;
    private int id;
    private String parameters;
    private String serverPath;
    private BuildReason supportedReasons;
    private String teamProject;
    private ProcessTemplateType templateType;
    private String url;
    private String version;

    /**
     * Getter for Description
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description
     * @param description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Getter for FileExists
     * @return boolean
     */
    public boolean getFileExists() {
        return fileExists;
    }

    /**
     * Setter for FileExists
     * @param fileExists
     */
    public void setFileExists(final boolean fileExists) {
        this.fileExists = fileExists;
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
     * Getter for Parameters
     * @return String
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * Setter for Parameters
     * @param parameters
     */
    public void setParameters(final String parameters) {
        this.parameters = parameters;
    }

    /**
     * Getter for ServerPath
     * @return String
     */
    public String getServerPath() {
        return serverPath;
    }

    /**
     * Setter for ServerPath
     * @param serverPath
     */
    public void setServerPath(final String serverPath) {
        this.serverPath = serverPath;
    }

    /**
     * Getter for SupportedReasons
     * @return BuildReason
     */
    public BuildReason getSupportedReasons() {
        return supportedReasons;
    }

    /**
     * Setter for SupportedReasons
     * @param supportedReasons
     */
    public void setSupportedReasons(final BuildReason supportedReasons) {
        this.supportedReasons = supportedReasons;
    }

    /**
     * Getter for TeamProject
     * @return String
     */
    public String getTeamProject() {
        return teamProject;
    }

    /**
     * Setter for TeamProject
     * @param teamProject
     */
    public void setTeamProject(final String teamProject) {
        this.teamProject = teamProject;
    }

    /**
     * Getter for TemplateType
     * @return ProcessTemplateType
     */
    public ProcessTemplateType getTemplateType() {
        return templateType;
    }

    /**
     * Setter for TemplateType
     * @param templateType
     */
    public void setTemplateType(final ProcessTemplateType templateType) {
        this.templateType = templateType;
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
     * Getter for Version
     * @return String
     */
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version
     * @param version
     */
    public void setVersion(final String version) {
        this.version = version;
    }
}
