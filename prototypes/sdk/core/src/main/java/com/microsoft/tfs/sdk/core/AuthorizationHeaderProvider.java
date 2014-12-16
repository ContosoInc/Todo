package com.microsoft.tfs.sdk.core;

import javax.ws.rs.client.Invocation;

/**
 * Created by yacao on 12/11/2014.
 */
public interface AuthorizationHeaderProvider {

    public final String AUTHORIZATION_HEADER = "Authorization";

    public void addAuthorizationHeader(Invocation.Builder builder);
}
