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

public class VersionControlProjectInfo {

    private TeamProjectReference project;
    private boolean supportsGit;
    private boolean supportsTFVC;

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(final TeamProjectReference project) {
        this.project = project;
    }

    public boolean getSupportsGit() {
        return supportsGit;
    }

    public void setSupportsGit(final boolean supportsGit) {
        this.supportsGit = supportsGit;
    }

    public boolean getSupportsTFVC() {
        return supportsTFVC;
    }

    public void setSupportsTFVC(final boolean supportsTFVC) {
        this.supportsTFVC = supportsTFVC;
    }
}
