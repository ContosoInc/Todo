package com.microsoft.vss.client.build.exception;

public class BuildRequestPropertyInvalidException
    extends BuildException {

    public BuildRequestPropertyInvalidException(final String message) {
        super(message);
    }

    public BuildRequestPropertyInvalidException(final String message, final Exception e) {
        super(message, e);
    }
}
