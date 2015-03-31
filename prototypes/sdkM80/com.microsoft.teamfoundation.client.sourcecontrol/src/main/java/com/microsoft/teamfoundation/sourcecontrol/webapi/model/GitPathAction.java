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

public class GitPathAction {

    private GitPathActions action;
    private String base64Content;
    private String path;
    private String rawTextContent;
    private String targetPath;

    /**
     * Getter for Action
     * @return GitPathActions
     */
    public GitPathActions getAction() {
        return action;
    }

    /**
     * Setter for Action
     * @param action
     */
    public void setAction(final GitPathActions action) {
        this.action = action;
    }

    /**
     * Getter for Base64Content
     * @return String
     */
    public String getBase64Content() {
        return base64Content;
    }

    /**
     * Setter for Base64Content
     * @param base64Content
     */
    public void setBase64Content(final String base64Content) {
        this.base64Content = base64Content;
    }

    /**
     * Getter for Path
     * @return String
     */
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path
     * @param path
     */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
     * Getter for RawTextContent
     * @return String
     */
    public String getRawTextContent() {
        return rawTextContent;
    }

    /**
     * Setter for RawTextContent
     * @param rawTextContent
     */
    public void setRawTextContent(final String rawTextContent) {
        this.rawTextContent = rawTextContent;
    }

    /**
     * Getter for TargetPath
     * @return String
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Setter for TargetPath
     * @param targetPath
     */
    public void setTargetPath(final String targetPath) {
        this.targetPath = targetPath;
    }
}
