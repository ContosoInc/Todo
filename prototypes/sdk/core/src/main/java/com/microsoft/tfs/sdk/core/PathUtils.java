package com.microsoft.tfs.sdk.core;

import javax.ws.rs.core.UriBuilder;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Created by yacao on 12/12/2014.
 */
public class PathUtils {

    public final String DEFAULT_COLLECTION = "defaultCollection";
    public final String APIS = "_apis";

    private boolean onlyAllowHttps;

    public PathUtils() {
        this.onlyAllowHttps = true;
    }

    public PathUtils(boolean onlyAllowHttps) {
        this.onlyAllowHttps = onlyAllowHttps;
    }

    public URI combinePath(URI base, List<String> paths, Map<String, List<String>> queryParams) {
        UriBuilder builder = UriBuilder.fromUri(base);
        if (this.onlyAllowHttps) {
            builder.scheme("https");
        }

        // Add default collection
        builder.segment(DEFAULT_COLLECTION);

        // Add default API path
        builder.segment(APIS);

        // Add provided path segments
        builder.segment(paths.toArray(new String[0]));

        for (Map.Entry<String, List<String>> param : queryParams.entrySet()) {
            builder.queryParam(param.getKey(), param.getValue().toArray(new String[0]));
        }

        return builder.build();
    }
}
