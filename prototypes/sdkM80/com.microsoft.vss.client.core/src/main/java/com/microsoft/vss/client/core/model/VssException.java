package com.microsoft.vss.client.core.model;

import com.microsoft.vss.client.core.utils.StringUtil;

/**
 * <p>
 * Base class for all custom exceptions thrown from Vss and Tfs code.
 * </p>
 * <p>
 * All Exceptions in the VSS space -- any exception that flows across a REST API
 * boudary -- should derive from VssServiceException. This is likely almost ALL
 * new exceptions. Legacy TFS exceptions that do not flow through REST derive
 * from TeamFoundationServerException or TeamFoundationServiceException
 * </p>
 */
public abstract class VssException
    extends RuntimeException {

    private int errorCode;
    private boolean logException;
    private int eventId;
    private String helpLink;

    public VssException() {
        super();
    }

    public VssException(final int errorCode) {
        this(errorCode, false);
    }

    public VssException(final int errorCode, final boolean logException) {
        this.errorCode = errorCode;
        this.logException = logException;
    }

    public VssException(final String message, final int errorCode, final boolean logException) {
        super(StringUtil.ScrubPassword(message));
        this.errorCode = errorCode;
        this.logException = logException;
    }

    public VssException(final String message) {
        this(message, 0, false);
    }

    public VssException(final String message, final int errorCode) {
        this(message, errorCode, false);
    }

    public VssException(final String message, final boolean logException) {
        this(message, 0, logException);
    }

    public VssException(
        final String message,
        final int errorCode,
        final boolean logException,
        final Exception innerException) {
        super(StringUtil.ScrubPassword(message), innerException);
        this.errorCode = errorCode;
        this.logException = logException;
    }

    public VssException(final String message, final Exception innerException) {
        this(StringUtil.ScrubPassword(message), 0, false, innerException);
    }

    public VssException(final String message, final int errorCode, final Exception innerException) {
        this(StringUtil.ScrubPassword(message), errorCode, false, innerException);
    }

    public VssException(final String message, final boolean logException, final Exception innerException) {
        this(StringUtil.ScrubPassword(message), 0, logException, innerException);
    }

    /**
     * Getter for error code
     * @return int
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for error code
     * @param errorCode
     */
    public void setErrorCode(final int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter to check if exception logging is enabled
     * @return boolean
     */
    public boolean getLogException() {
        return logException;
    }

    /**
     * Setter to indicate if exception logging is enabled
     * @param logException
     */
    public void setLogException(final boolean logException) {
        this.logException = logException;
    }

    /**
     * Getter for event id
     * @return int
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Setter for event id
     * @param eventId
     */
    public void setEventId(final int eventId) {
        this.eventId = eventId;
    }

    /**
     * Getter for help link
     * @return String
     */
    public String getHelpLink() {
        return helpLink;
    }

    /**
     * Setter for help link
     * @param helpLink
     */
    public void setHelpLink(final String helpLink) {
        this.helpLink = helpLink;
    }
}
