package com.microsoft.vss.client.build.exception;

public class BuildProcessTemplateDeletionException
    extends BuildException {

    public BuildProcessTemplateDeletionException(final String message) {
        super(message);
    }

    public BuildProcessTemplateDeletionException(final String message, final Exception e) {
        super(message, e);
    }
}
