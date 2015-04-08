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

import com.microsoft.teamfoundation.build.webapi.model.BuildReason;
import com.microsoft.teamfoundation.build.webapi.model.ProcessTemplateType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean getFileExists() {
        return fileExists;
    }

    public void setFileExists(final boolean fileExists) {
        this.fileExists = fileExists;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(final String parameters) {
        this.parameters = parameters;
    }

    public String getServerPath() {
        return serverPath;
    }

    public void setServerPath(final String serverPath) {
        this.serverPath = serverPath;
    }

    public BuildReason getSupportedReasons() {
        return supportedReasons;
    }

    public void setSupportedReasons(final BuildReason supportedReasons) {
        this.supportedReasons = supportedReasons;
    }

    public String getTeamProject() {
        return teamProject;
    }

    public void setTeamProject(final String teamProject) {
        this.teamProject = teamProject;
    }

    public ProcessTemplateType getTemplateType() {
        return templateType;
    }

    public void setTemplateType(final ProcessTemplateType templateType) {
        this.templateType = templateType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }
}
