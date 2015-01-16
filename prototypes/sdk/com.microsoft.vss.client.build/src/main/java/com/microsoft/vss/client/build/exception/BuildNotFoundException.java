package com.microsoft.vss.client.build.exception;

public class BuildNotFoundException
    extends BuildException {

    public BuildNotFoundException(final String message) {
        super(message);
    }

    public BuildNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
