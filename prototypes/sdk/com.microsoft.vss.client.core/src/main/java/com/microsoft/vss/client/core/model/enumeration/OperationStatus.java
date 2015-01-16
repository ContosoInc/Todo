package com.microsoft.vss.client.core.model.enumeration;

public enum OperationStatus {
    /**
     * The operation has been queued.
     */
    Queued,

    /**
     * The operation is in progress.
     */
    InProgress,

    /**
     * The operation was cancelled by the user.
     */
    Cancelled,

    /**
     * The operation completed successfully.
     */
    Succeeded,

    /**
     * The operation completed with a failure.
     */
    Failed;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
