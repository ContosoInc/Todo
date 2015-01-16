package com.microsoft.vss.client.build.exception;

public class BuildRequestUpdateException
    extends BuildException {

    public BuildRequestUpdateException(final String message) {
        super(message);
    }

    public BuildRequestUpdateException(final String message, final Exception e) {
        super(message, e);
    }
}
