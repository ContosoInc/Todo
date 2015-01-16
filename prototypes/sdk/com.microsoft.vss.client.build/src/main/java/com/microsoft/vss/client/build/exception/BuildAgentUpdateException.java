package com.microsoft.vss.client.build.exception;

public class BuildAgentUpdateException
    extends BuildException {

    public BuildAgentUpdateException(final String message) {
        super(message);
    }

    public BuildAgentUpdateException(final String message, final Exception e) {
        super(message, e);
    }
}
