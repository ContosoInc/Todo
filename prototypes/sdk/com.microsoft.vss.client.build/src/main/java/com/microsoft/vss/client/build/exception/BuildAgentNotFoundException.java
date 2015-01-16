package com.microsoft.vss.client.build.exception;

public class BuildAgentNotFoundException
    extends BuildException {

    public BuildAgentNotFoundException(final String message) {
        super(message);
    }

    public BuildAgentNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
