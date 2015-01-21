package com.microsoft.vss.client.sourcecontrol.model.enumeration;

public enum GitVersionOptions {
    /**
     * Not specified
     */
    None,

    /**
     * Commit that changed item prior to the current version
     */
    PreviousChange,

    /**
     * First parent of commit (HEAD^)
     */
    FirstParent;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
