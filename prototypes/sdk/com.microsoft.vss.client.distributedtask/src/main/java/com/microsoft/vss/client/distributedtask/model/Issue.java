package com.microsoft.vss.client.distributedtask.model;

import java.util.HashMap;
import java.util.Map;

import com.microsoft.vss.client.distributedtask.model.enumeration.IssueType;

public class Issue {
    private IssueType type;
    private String category;
    private String message;
    public Map<String, String> data = new HashMap<String, String>();

    public IssueType getType() {
        return type;
    }

    public void setType(final IssueType type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

}
