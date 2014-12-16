package com.microsoft.tfs.sdk.core.impl;

import com.microsoft.tfs.sdk.core.AuthorizationHeaderProvider;
import com.microsoft.tfs.sdk.core.RESTClient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by yacao on 12/11/2014.
 */
public class RESTClientImpl implements RESTClient {

    private final Client client;
    private final AuthorizationHeaderProvider credProvider;

    public RESTClientImpl(final AuthorizationHeaderProvider credProvider) {
        this.client = ClientBuilder.newClient();
        this.credProvider = credProvider;
    }

    public <T> T get(final URI uri, Class<T> tClass) {
        return getWithHeaders(uri, null, tClass);
    }

    public <T> T getWithHeaders(final URI uri, Map<String, String> headers, Class<T> tClass) {
        return getWithHeadersAndCred(uri, headers, tClass);
    }

    private <T> T getWithHeadersAndCred(final URI uri, Map<String, String> headers, Class<T> tClass) {
        Invocation.Builder builder = getBuilderWithCred(uri, headers);

        return builder.buildGet().invoke(tClass);
    }

    public <T> Future<T> getAsync(final URI uri, Class<T> tClass) {
        return getWithHeadersAsync(uri, null, tClass);
    }

    public <T> Future<T> getWithHeadersAsync(final URI uri, Map<String, String> headers, Class<T> tClass) {
        return getWithHeadersAndCredAsync(uri, headers, tClass);
    }

    private <T> Future<T> getWithHeadersAndCredAsync(final URI uri, Map<String, String> headers, Class<T> tClass) {
        Invocation.Builder builder = getBuilderWithCred(uri, headers);

        return builder.async().get(tClass);
    }

    private Invocation.Builder getBuilderWithCred(URI uri, Map<String, String> headers) {
        Invocation.Builder builder = client.target(uri).request();
        credProvider.addAuthorizationHeader(builder);

        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                builder.header(entry.getKey(), entry.getValue());
            }
        }

        builder.header("Accept", "application/json;api-version=2.0-preview.2");

        return builder;
    }
}
