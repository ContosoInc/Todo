package com.microsoft.vss.client.build.exception;

public class BuildControllerDeletionException
    extends BuildException {

    public BuildControllerDeletionException(final String message) {
        super(message);
    }

    public BuildControllerDeletionException(final String message, final Exception e) {
        super(message, e);
    }
}
