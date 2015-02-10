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
import com.fasterxml.jackson.annotation.JsonProperty;

public class FileContentMetadata {

    private String contentType;
    private int encoding;
    private String extension;
    private String fileName;
    private boolean isBinary;
    private boolean isImage;
    private String visualStudioWebLink;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(final String extension) {
        this.extension = extension;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public boolean getIsBinary() {
        return isBinary;
    }

    public void setIsBinary(final boolean isBinary) {
        this.isBinary = isBinary;
    }

    public boolean getIsImage() {
        return isImage;
    }

    public void setIsImage(final boolean isImage) {
        this.isImage = isImage;
    }

    @JsonProperty("vsLink")
    public String getVisualStudioWebLink() {
        return visualStudioWebLink;
    }

    @JsonProperty("vsLink")
    public void setVisualStudioWebLink(final String visualStudioWebLink) {
        this.visualStudioWebLink = visualStudioWebLink;
    }
}
