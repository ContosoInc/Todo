package com.microsoft.tfs.sdk.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum BuildResult {
    None(0),
    Succeeded(2),
    PartiallySucceeded(4),
    Failed(8),
    Stopped(16),
    Canceled(32);

    private int result;
    BuildResult(int result) {
        this.result = result;
    }
}
