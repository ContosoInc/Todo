package com.microsoft.vss.client.core.model;

/**
 * Created by yacao on 12/11/2014.
 */
public class IdentityRef {

    private String id;
    private String displayName;
    private String uniqueName;
    private String url;
    private String profileUrl;
    private String imageUrl;
    private boolean isContainer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isContainer() {
        return isContainer;
    }

    public void setContainer(boolean isContainer) {
        this.isContainer = isContainer;
    }
}
