package com.microsoft.vss.client.core.model;

/**
 * Created by yacao on 12/11/2014.
 */
public class ShallowReference {

    private int id;
    private String name;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
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
}
