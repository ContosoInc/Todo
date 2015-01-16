package com.microsoft.vss.client.core;

public abstract class VssHttpHeaders {
    public final static String ACTIVITY_ID = "ActivityId"; //$NON-NLS-1$
    public final static String TFS_VERSION = "X-TFS-Version"; //$NON-NLS-1$
    public final static String TFS_REDIRECT = "X-TFS-Redirect"; //$NON-NLS-1$
    public final static String TFS_EXCEPTION = "X-TFS-Exception"; //$NON-NLS-1$
    public final static String TFS_SERVICE_ERROR = "X-TFS-ServiceError"; //$NON-NLS-1$
    public final static String TFS_SESSION_HEADER = "X-TFS-Session"; //$NON-NLS-1$
    public final static String TFS_FED_AUTH_REALM = "X-TFS-FedAuthRealm"; //$NON-NLS-1$
    public final static String TFS_FED_AUTH_ISSUER = "X-TFS-FedAuthIssuer"; //$NON-NLS-1$
    public final static String TFS_FED_AUTH_REDIRECT = "X-TFS-FedAuthRedirect"; //$NON-NLS-1$
    public final static String VSS_PAGE_HANDLERS = "X-VSS-PageHandlers"; //$NON-NLS-1$
    public final static String VSS_USER_DATA = "X-VSS-UserData"; //$NON-NLS-1$
    public final static String VSS_AGENT_HEADER = "X-VSS-Agent"; //$NON-NLS-1$
    public final static String VSS_AUTHENTICATE_ERROR = "X-VSS-AuthenticateError"; //$NON-NLS-1$
}
