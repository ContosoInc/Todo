package com.microsoft.vss.client.build.model;

public class ShallowReference {
    private int id;
    private String name;
    private String url;

    /**
     * Id of the resource
     */
    public int getId() {
        return id;
    }

    /**
     * Id of the resource
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Name of the linked resource (definition name, controller name, etc.)
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the linked resource (definition name, controller name, etc.)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Full http link to the resource
     */
    public String getUrl() {
        return url;
    }

    /**
     * Full http link to the resource
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
