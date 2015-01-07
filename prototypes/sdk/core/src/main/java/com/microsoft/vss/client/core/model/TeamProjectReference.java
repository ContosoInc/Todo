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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

}
