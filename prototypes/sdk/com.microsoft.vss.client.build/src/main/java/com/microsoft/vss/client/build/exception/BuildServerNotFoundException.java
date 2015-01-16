package com.microsoft.vss.client.build.exception;

public class BuildServerNotFoundException
    extends BuildException {

    public BuildServerNotFoundException(final String message) {
        super(message);
    }

    public BuildServerNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
