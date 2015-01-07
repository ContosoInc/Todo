package com.microsoft.vss.client.build.exception;

public class BuildAgentDeletionException
    extends BuildException {

    public BuildAgentDeletionException(final String message) {
        super(message);
    }

    public BuildAgentDeletionException(final String message, final Exception e) {
        super(message, e);
    }
}
