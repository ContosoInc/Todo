package com.microsoft.vss.client.sourcecontrol.model.enumeration;

public enum GitObjectType {
    Bad, Commit, Tree, Blob, Tag, Ext2, OfsDelta, RefDelta;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
