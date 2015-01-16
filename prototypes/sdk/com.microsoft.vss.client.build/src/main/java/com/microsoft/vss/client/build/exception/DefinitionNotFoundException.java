package com.microsoft.vss.client.build.exception;

public class DefinitionNotFoundException
    extends BuildException {

    public DefinitionNotFoundException(final String message) {
        super(message);
    }

    public DefinitionNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
