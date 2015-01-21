package com.microsoft.vss.client.sourcecontrol.model;

import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitVersionOptions;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitVersionType;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.VersionControlRecursionType;

public class GitItemDescriptor {
    private String path;
    private String version;
    private GitVersionType versionType;
    private GitVersionOptions versionOptions;
    private VersionControlRecursionType recursionLevel;

    /**
     * Path to item
     */
    public String getPath() {
        return path;
    }

    /**
     * Path to item
     */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
     * Version string (interpretation based on VersionType defined in subclass
     */
    public String getVersion() {
        return version;
    }

    /**
     * Version string (interpretation based on VersionType defined in subclass
     */
    public void setVersion(final String version) {
        this.version = version;
    }

    /**
     * How to interpret version (branch,tag,commit)
     */
    public GitVersionType getVersionType() {
        return versionType;
    }

    /**
     * How to interpret version (branch,tag,commit)
     */
    public void setVersionType(final GitVersionType versionType) {
        this.versionType = versionType;
    }

    /**
     * Version modifiers (e.g. previous)
     */
    public GitVersionOptions getVersionOptions() {
        return versionOptions;
    }

    /**
     * Version modifiers (e.g. previous)
     */
    public void setVersionOptions(final GitVersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    /**
     * Specifies whether to include children (OneLevel), all descendants (Full),
     * or None
     */
    public VersionControlRecursionType getRecursionLevel() {
        return recursionLevel;
    }

    /**
     * Specifies whether to include children (OneLevel), all descendants (Full),
     * or None
     */
    public void setRecursionLevel(final VersionControlRecursionType recursionLevel) {
        this.recursionLevel = recursionLevel;
    }
}
