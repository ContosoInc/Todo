package com.microsoft.vss.client.build.exception;

public class BuildProcessTemplateNotFoundException
    extends BuildException {

    public BuildProcessTemplateNotFoundException(final String message) {
        super(message);
    }

    public BuildProcessTemplateNotFoundException(final String message, final Exception e) {
        super(message, e);
    }
}
