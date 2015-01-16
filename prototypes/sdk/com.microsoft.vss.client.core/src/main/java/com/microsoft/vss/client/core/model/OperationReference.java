package com.microsoft.vss.client.core.model;

import com.microsoft.vss.client.core.model.enumeration.OperationStatus;

public class OperationReference {
    private String id;
    private OperationStatus status;
    private String url;

    /**
     * The identifier for this operation.
     * 
     * The Id is an aggregate of the operationType and GUID identifier. E.g.,
     * Servicing-82387065983F4BCEB29101740FA8249E.
     */
    public String getId() {
        return id;
    }

    /**
     * The identifier for this operation.
     * 
     * The Id is an aggregate of the operationType and GUID identifier. E.g.,
     * Servicing-82387065983F4BCEB29101740FA8249E.
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * The current status of the operation.
     */
    public OperationStatus getStatus() {
        return status;
    }

    /**
     * The current status of the operation.
     */
    public void setStatus(final OperationStatus status) {
        this.status = status;
    }

    /**
     * Url to get the full object.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Url to get the full object.
     */
    public void setUrl(final String url) {
        this.url = url;
    }
}
