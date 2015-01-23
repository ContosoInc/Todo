package com.microsoft.vss.client.distributedtask.model.enumeration;

public enum IssueType {
    None, Error, Warning;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
