package com.microsoft.vss.client.sourcecontrol.model.enumeration;

public enum GitVersionType {
    /**
     * Interpret the version as a branch name
     */
    Branch,

    /**
     * Interpret the version as a tag name
     */
    Tag,

    /**
     * Interpret the version as a commit ID (SHA1)
     */
    Commit;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
