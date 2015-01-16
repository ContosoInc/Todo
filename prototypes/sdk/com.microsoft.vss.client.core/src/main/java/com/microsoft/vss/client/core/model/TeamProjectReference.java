package com.microsoft.vss.client.core.model;

import java.util.UUID;

/**
 * Created by yacao on 12/12/2014.
 */
public class TeamProjectReference {
    private UUID id;
    private String abbreviation;
    private String name;
    private String url;

    /**
     * Project abbreviation.
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Project abbreviation.
     */
    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * Project identifier.
     */
    public UUID getId() {
        return id;
    }

    /**
     * Project identifier.
     */
    public void setId(final UUID id) {
        this.id = id;
    }

    /**
     * Project name.
     */
    public String getName() {
        return name;
    }

    /**
     * Project name.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Url to the full version of the object.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Url to the full version of the object.
     */
    public void setUrl(final String url) {
        this.url = url;
    }

}
