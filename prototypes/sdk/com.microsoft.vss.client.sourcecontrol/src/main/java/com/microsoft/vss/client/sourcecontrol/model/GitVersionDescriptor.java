package com.microsoft.vss.client.sourcecontrol.model;

import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitVersionOptions;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitVersionType;

public class GitVersionDescriptor {
    private GitVersionType versionType;
    private String version;
    private GitVersionOptions versionOptions;

    /**
     * Version type (branch, tag, or commit). Determines how Id is interpreted
     */
    public GitVersionType getVersionType() {
        return versionType;
    }

    /**
     * Version type (branch, tag, or commit). Determines how Id is interpreted
     */
    public void setVersionType(final GitVersionType versionType) {
        this.versionType = versionType;
    }

    /**
     * Version string identifier (name of tag/branch, SHA1 of commit)
     */
    public String getVersion() {
        return version;
    }

    /**
     * Version string identifier (name of tag/branch, SHA1 of commit)
     */
    public void setVersion(final String version) {
        this.version = version;
    }

    /**
     * Version options - Specify additional modifiers to version (e.g Previous)
     */
    public GitVersionOptions getVersionOptions() {
        return versionOptions;
    }

    /**
     * Version options - Specify additional modifiers to version (e.g Previous)
     */
    public void setVersionOptions(final GitVersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

}
