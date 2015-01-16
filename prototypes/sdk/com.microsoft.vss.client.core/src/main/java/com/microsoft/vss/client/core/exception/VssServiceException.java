package com.microsoft.vss.client.core.exception;

public class VssServiceException
    extends VssException {

    public VssServiceException() {
        super();
    }

    public VssServiceException(final String message, final Exception innerException) {
        super(message, innerException);

    }

    public VssServiceException(final String message) {
        super(message);

    }

}
