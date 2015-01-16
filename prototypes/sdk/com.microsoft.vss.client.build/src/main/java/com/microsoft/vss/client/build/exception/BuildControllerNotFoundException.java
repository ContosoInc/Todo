package com.microsoft.vss.client.build.exception;

public class BuildControllerNotFoundException
    extends BuildException {

    public BuildControllerNotFoundException(final String message) {
        super(message);
    }

    public BuildControllerNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
