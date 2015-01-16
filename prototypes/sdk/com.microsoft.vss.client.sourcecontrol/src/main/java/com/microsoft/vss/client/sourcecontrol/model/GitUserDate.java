package com.microsoft.vss.client.sourcecontrol.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GitUserDate {
    private String name;
    private String email;
    private Date date;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(final String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(final String email) {
        this.email = email;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(final Date date) {
        this.date = date;
    }
}
