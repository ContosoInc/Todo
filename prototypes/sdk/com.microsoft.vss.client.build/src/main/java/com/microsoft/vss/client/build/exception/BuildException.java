package com.microsoft.vss.client.build.exception;

import com.microsoft.vss.client.core.exception.VssServiceException;

public class BuildException
    extends VssServiceException {

    public BuildException(final String message) {
        super(message);
    }

    public BuildException(final String message, final Exception e) {
        super(message, e);
    }
}
