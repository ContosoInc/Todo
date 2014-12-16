package com.microsoft.tfs.sdk.core;

import javax.ws.rs.core.Response;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * Created by yacao on 12/11/2014.
 */
public interface RESTClient {

    public <T> T get(URI uri, Class<T> tClass);
    public <T> T getWithHeaders(final URI uri, Map<String, String> headers, Class<T> tClass);
    public <T> Future<T> getAsync(final URI uri, Class<T> tClass);
    public <T> Future<T> getWithHeadersAsync(final URI uri, Map<String, String> headers, Class<T> tClass);

}
