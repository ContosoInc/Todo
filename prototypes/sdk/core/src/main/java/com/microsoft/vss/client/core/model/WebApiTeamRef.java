package com.microsoft.vss.client.core.model;

import java.util.UUID;

public class WebApiTeamRef {
    private UUID id;
    private String name;
    private String url;

    /**
     * Team (Identity) Guid. A Team Foundation ID.
     */
    public UUID getId() {
        return id;
    }

    /**
     * Team (Identity) Guid. A Team Foundation ID.
     */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
     * Team name
     */
    public String getName() {
        return name;
    }

    /**
     * Team name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Team REST API Url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

}
