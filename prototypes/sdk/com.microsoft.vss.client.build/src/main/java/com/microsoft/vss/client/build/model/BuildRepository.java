package com.microsoft.vss.client.build.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.vss.client.build.model.enumeration.RepositoryType;

/**
 * Created by yacao on 12/12/2014.
 */
public class BuildRepository {
    private String id;
    private RepositoryType type;
    private String name;
    private String url;
    private String defaultBranch;
    private String rootFolder;
    private String clean;
    private Map<String, String> properties;
    private boolean checkoutSubmodules;

    public BuildRepository() {
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public RepositoryType getType() {
        return type;
    }

    public void setType(final RepositoryType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(final String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public String getRootFolder() {
        return rootFolder;
    }

    public void setRootFolder(final String rootFolder) {
        this.rootFolder = rootFolder;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(final String clean) {
        this.clean = clean;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(final Map<String, String> properties) {
        this.properties = properties;
    }

    @JsonProperty("CheckoutSubmodules")
    public boolean shouldCheckoutSubmodules() {
        return checkoutSubmodules;
    }

    @JsonProperty("CheckoutSubmodules")
    public void setCheckoutSubmodules(final boolean checkoutSubmodules) {
        this.checkoutSubmodules = checkoutSubmodules;
    }
}
