package com.microsoft.vss.client.build.exception;

public class BuildDefinitionDoesNotExistException
    extends BuildException {

    public BuildDefinitionDoesNotExistException(final String message) {
        super(message);
    }

    public BuildDefinitionDoesNotExistException(final String message, final Exception e) {
        super(message, e);
    }
}
