package com.microsoft.vss.client.core.exception;

import java.net.URI;
import java.text.MessageFormat;
import java.util.UUID;

import com.microsoft.vss.client.core.Messages;

public class VssResourceNotFoundException
    extends VssServiceException {

    public VssResourceNotFoundException(final UUID locationId) {
        super(MessageFormat.format(Messages.getString("VssResourceNotFoundException.NotRegisteredFormat"), locationId)); //$NON-NLS-1$
    }

    public VssResourceNotFoundException(final UUID locationId, final URI serverBaseUri) {
        super(MessageFormat.format(Messages.getString("VssResourceNotFoundException.NotRegisteredOnFormat"), locationId, serverBaseUri)); //$NON-NLS-1$
    }
}
