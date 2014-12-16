package com.microsoft.tfs.sdk.core.impl;

import com.microsoft.tfs.sdk.core.AuthorizationHeaderProvider;
import javax.ws.rs.client.Invocation;
import org.apache.commons.codec.binary.Base64;

/**
 * Created by yacao on 12/11/2014.
 */
public class BasicAuthorizationProvider implements AuthorizationHeaderProvider {

    private String basicAuthHeader;

    public BasicAuthorizationProvider(final String username, final String password) {
        if (username != null && password != null) {
            String data = username + ":" + password;
            String encodedCredential = new String(Base64.encodeBase64(data.getBytes()));
            basicAuthHeader = String.format("Basic %s", encodedCredential);
        }
    }

    @Override
    public void addAuthorizationHeader(Invocation.Builder builder) {
        if (this.basicAuthHeader != null) {
            builder.header(this.AUTHORIZATION_HEADER, basicAuthHeader);
        }
    }
}
