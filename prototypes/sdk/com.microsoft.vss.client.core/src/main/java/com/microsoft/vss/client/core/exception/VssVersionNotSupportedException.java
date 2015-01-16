package com.microsoft.vss.client.core.exception;

import java.text.MessageFormat;

import com.microsoft.vss.client.core.Messages;
import com.microsoft.vss.client.core.model.ApiResourceLocation;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.sun.jndi.toolkit.url.Uri;

public class VssVersionNotSupportedException
    extends VssResourceVersionException {

    private final static String ClientResourceVersionNotSupportedError =
        Messages.getString("VssVersionNotSupportedException.NotSupportedFormat"); //$NON-NLS-1$

    public VssVersionNotSupportedException(
        ApiResourceLocation location,
        ApiResourceVersion requestedVersion,
        ApiResourceVersion minSupportedVersion,
        Uri serverBaseUri) {
        super(MessageFormat.format(
            ClientResourceVersionNotSupportedError,
            location.getArea() + ":" + location.getResourceName() + " " + location.getId(), //$NON-NLS-1$ //$NON-NLS-2$
            requestedVersion,
            minSupportedVersion,
            serverBaseUri));
    }
}
