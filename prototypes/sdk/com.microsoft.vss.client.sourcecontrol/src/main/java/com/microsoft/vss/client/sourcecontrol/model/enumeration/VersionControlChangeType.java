package com.microsoft.vss.client.sourcecontrol.model.enumeration;

public enum VersionControlChangeType {
    None(0), Add(1), Edit(2), Encoding(4), Rename(8), Delete(16), Undelete(32), Branch(64), Merge(128), Lock(256),
    Rollback(512), SourceRename(1024), TargetRename(2048), Property(4096), All(8191);

    private final int value;

    VersionControlChangeType(final int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
