package com.microsoft.vss.client.build.exception;

public class BuildRequestNotFoundException
    extends BuildException {

    public BuildRequestNotFoundException(final String message) {
        super(message);
    }

    public BuildRequestNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
