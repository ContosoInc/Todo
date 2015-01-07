package com.microsoft.vss.client.build.exception;

public class BuildControllerUpdateException
    extends BuildException {

    public BuildControllerUpdateException(final String message) {
        super(message);
    }

    public BuildControllerUpdateException(final String message, final Exception e) {
        super(message, e);
    }
}
