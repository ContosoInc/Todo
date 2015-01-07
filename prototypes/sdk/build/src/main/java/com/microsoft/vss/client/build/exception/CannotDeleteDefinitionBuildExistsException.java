package com.microsoft.vss.client.build.exception;

public class CannotDeleteDefinitionBuildExistsException
    extends BuildException {

    public CannotDeleteDefinitionBuildExistsException(final String message) {
        super(message);
    }

    public CannotDeleteDefinitionBuildExistsException(final String message, final Exception e) {
        super(message, e);
    }
}
