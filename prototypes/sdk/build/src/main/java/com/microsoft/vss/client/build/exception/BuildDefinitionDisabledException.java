package com.microsoft.vss.client.build.exception;

public class BuildDefinitionDisabledException
    extends BuildException {

    public BuildDefinitionDisabledException(final String message) {
        super(message);
    }

    public BuildDefinitionDisabledException(final String message, final Exception e) {
        super(message, e);
    }
}
