package com.microsoft.vss.client.sourcecontrol.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileContentMetadata {
    private int encoding;
    private String contentType;
    private String fileName;
    private String extension;
    private boolean isBinary;
    private boolean isImage;
    private String visualStudioWebLink;

    @JsonProperty("encoding")
    public int getEncoding() {
        return encoding;
    }

    @JsonProperty("encoding")
    public void setEncoding(int encoding) {
        this.encoding = encoding;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("fileName")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("fileName")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("extension")
    public String getExtension() {
        return extension;
    }

    @JsonProperty("extension")
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @JsonProperty("isBinary")
    public boolean isBinary() {
        return isBinary;
    }

    @JsonProperty("isBinary")
    public void setBinary(boolean isBinary) {
        this.isBinary = isBinary;
    }

    @JsonProperty("isImage")
    public boolean isImage() {
        return isImage;
    }

    @JsonProperty("isImage")
    public void setImage(boolean isImage) {
        this.isImage = isImage;
    }

    @JsonProperty("vsLink")
    public String getVisualStudioWebLink() {
        return visualStudioWebLink;
    }

    @JsonProperty("vsLink")
    public void setVisualStudioWebLink(String visualStudioWebLink) {
        this.visualStudioWebLink = visualStudioWebLink;
    }

}
