/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.core.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.common.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;

public class ProjectMessage {

    private ProjectInfo project;
    private ProjectChangeType projectChangeType;

    /**
     * Getter for Project
     * @return ProjectInfo
     */
    public ProjectInfo getProject() {
        return project;
    }

    /**
     * Setter for Project
     * @param project
     */
    public void setProject(final ProjectInfo project) {
        this.project = project;
    }

    /**
     * Getter for ProjectChangeType
     * @return ProjectChangeType
     */
    public ProjectChangeType getProjectChangeType() {
        return projectChangeType;
    }

    /**
     * Setter for ProjectChangeType
     * @param projectChangeType
     */
    public void setProjectChangeType(final ProjectChangeType projectChangeType) {
        this.projectChangeType = projectChangeType;
    }
}
