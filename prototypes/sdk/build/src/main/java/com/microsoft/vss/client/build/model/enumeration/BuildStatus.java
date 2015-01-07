package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildStatus {
    None(0), InProgress(1), Completed(2), Cancelling(4), Postponed(8), NotStarted(32), All(47);

    private int status;

    BuildStatus(int status) {
        this.status = status;
    }
}
