package com.microsoft.tfs.sdk.build.model;

import com.microsoft.tfs.sdk.build.model.enumeration.RepositoryType;

import java.util.Map;

/**
 * Created by yacao on 12/12/2014.
 */
public class BuildRepository {
    private String id;
    private RepositoryType type;
    private String name;
    private String url;
    private String defaultBranch;
    private String localPath;
    private String rootFolder;
    private String clean;
    private Map<String, String> properties;
    private boolean checkoutSubmodules;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RepositoryType getType() {
        return type;
    }

    public void setType(RepositoryType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public String getRootFolder() {
        return rootFolder;
    }

    public void setRootFolder(String rootFolder) {
        this.rootFolder = rootFolder;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public boolean isCheckoutSubmodules() {
        return checkoutSubmodules;
    }

    public void setCheckoutSubmodules(boolean checkoutSubmodules) {
        this.checkoutSubmodules = checkoutSubmodules;
    }
}
