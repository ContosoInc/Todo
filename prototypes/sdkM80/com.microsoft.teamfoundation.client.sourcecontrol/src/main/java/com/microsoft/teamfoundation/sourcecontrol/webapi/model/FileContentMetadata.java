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

public class FileContentMetadata {

    private String contentType;
    private int encoding;
    private String extension;
    private String fileName;
    private boolean isBinary;
    private boolean isImage;
    private String visualStudioWebLink;

    /**
     * Getter for ContentType
     * @return String
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType
     * @param contentType
     */
    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Encoding
     * @return int
     */
    public int getEncoding() {
        return encoding;
    }

    /**
     * Setter for Encoding
     * @param encoding
     */
    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    /**
     * Getter for Extension
     * @return String
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Setter for Extension
     * @param extension
     */
    public void setExtension(final String extension) {
        this.extension = extension;
    }

    /**
     * Getter for FileName
     * @return String
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Setter for FileName
     * @param fileName
     */
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    /**
     * Getter for IsBinary
     * @return boolean
     */
    public boolean getIsBinary() {
        return isBinary;
    }

    /**
     * Setter for IsBinary
     * @param isBinary
     */
    public void setIsBinary(final boolean isBinary) {
        this.isBinary = isBinary;
    }

    /**
     * Getter for IsImage
     * @return boolean
     */
    public boolean getIsImage() {
        return isImage;
    }

    /**
     * Setter for IsImage
     * @param isImage
     */
    public void setIsImage(final boolean isImage) {
        this.isImage = isImage;
    }

    /**
     * Getter for VisualStudioWebLink
     * @return String
     */
    public String getVisualStudioWebLink() {
        return visualStudioWebLink;
    }

    /**
     * Setter for VisualStudioWebLink
     * @param visualStudioWebLink
     */
    public void setVisualStudioWebLink(final String visualStudioWebLink) {
        this.visualStudioWebLink = visualStudioWebLink;
    }
}
