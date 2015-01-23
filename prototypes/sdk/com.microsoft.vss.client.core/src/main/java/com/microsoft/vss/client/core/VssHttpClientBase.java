package com.microsoft.vss.client.core;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import com.microsoft.vss.client.core.exception.ProxyAuthenticationRequiredException;
import com.microsoft.vss.client.core.exception.VssException;
import com.microsoft.vss.client.core.exception.VssResourceNotFoundException;
import com.microsoft.vss.client.core.exception.VssServiceException;
import com.microsoft.vss.client.core.exception.VssServiceResponseException;
import com.microsoft.vss.client.core.exception.WrappedException;
import com.microsoft.vss.client.core.jaxrs.ApiResourceEntityProvider;
import com.microsoft.vss.client.core.model.ApiResourceLocation;
import com.microsoft.vss.client.core.model.ApiResourceLocationCollection;
import com.microsoft.vss.client.core.model.ApiResourceVersion;

public abstract class VssHttpClientBase {

    private final static String OPTIONS_RELATIVE_PATH = "_apis"; //$NON-NLS-1$
    private final static String AREA_PARAMETER_NAME = "area"; //$NON-NLS-1$
    private final static String RESOURCE_PARAMETER_NAME = "resource"; //$NON-NLS-1$
    private final static String ROUTE_TEMPLATE_SEPARATOR = "/"; //$NON-NLS-1$

    private final static ApiResourceVersion DEFAULT_API_VERSION = new ApiResourceVersion(1, 0);

    private final static String API_VERSION_PARAMETER_NAME = "api-version"; //$NON-NLS-1$
    private final static String CHARSET_PARAMETER_NAME = "charset"; //$NON-NLS-1$
    private final static String UTF8_CHARSET = "UTF-8"; //$NON-NLS-1$

    private final Client rsClient;
    private final URI baseUrl;
    private final WebTarget baseTarget;

    private ApiResourceLocationCollection resourceLocations;

    protected VssHttpClientBase(final Client rsClient, final URI baseUrl) {
        this.rsClient = rsClient;
        this.baseUrl = baseUrl;
        this.baseTarget = this.rsClient.target(baseUrl).register(ApiResourceEntityProvider.class);
    }

    public Client getClient() {
        return rsClient;
    }

    public URI getBaseUrl() {
        return baseUrl;
    }

    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return null;
    }

    protected Response delete(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version) {
        return delete(locationId, routeValues, version, null);
    }

    protected Response delete(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Map<String, String> queryParameters) {

        final Invocation request = createRequest(HttpMethod.DELETE, locationId, routeValues, version, queryParameters);
        final Response response = sendRequest(request);

        return response;
    }

    protected <TResult> TResult get(final UUID locationId, final ApiResourceVersion version,
        final Class<TResult> resultClazz) {

        return get(locationId, null, version, null, resultClazz);
    }

    protected <TResult> TResult get(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Class<TResult> resultClazz) {

        return get(locationId, routeValues, version, null, resultClazz);
    }

    protected <TResult> TResult get(final UUID locationId, final ApiResourceVersion version,
        final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        return get(locationId, null, version, queryParameters, resultClazz);
    }

    protected <TResult> TResult get(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        final Invocation request = createRequest(HttpMethod.GET, locationId, routeValues, version, queryParameters);
        final TResult result = sendRequest(request, resultClazz);

        return result;
    }

    protected Response patch(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Map<String, String> queryParameters) {

        final Invocation request = createRequest(HttpMethod.PATCH, locationId, routeValues, version, queryParameters);
        final Response response = sendRequest(request);

        return response;
    }

    protected <TEntity> Response patch(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters) {

        final Invocation request =
            createRequest(HttpMethod.PATCH, locationId, routeValues, version, value, queryParameters);
        final Response response = sendRequest(request);

        return response;
    }

    protected <TResult> TResult patch(final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        final Invocation request = createRequest(HttpMethod.PATCH, locationId, routeValues, version, queryParameters);
        final TResult result = sendRequest(request, resultClazz);

        return result;
    }

    protected <TEntity, TResult> TResult patch(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version, final Class<TResult> resultClazz) {
        return patch(value, locationId, routeValues, version, null, resultClazz);
    }

    protected <TEntity, TResult> TResult patch(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        final Invocation request =
            createRequest(HttpMethod.PATCH, locationId, routeValues, version, value, queryParameters);
        final TResult result = sendRequest(request, resultClazz);

        return result;
    }

    protected <TEntity, TResult> TResult post(final TEntity value, final UUID locationId,
        final ApiResourceVersion version, final Class<TResult> resultClazz) {
        return post(value, locationId, null, version, null, resultClazz);
    }

    protected <TEntity, TResult> TResult post(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version, final Class<TResult> resultClazz) {
        return post(value, locationId, routeValues, version, null, resultClazz);
    }

    protected <TEntity, TResult> TResult post(final TEntity value, final UUID locationId,
        final ApiResourceVersion version, final Map<String, String> queryParameters, final Class<TResult> resultClazz) {
        return post(value, locationId, null, version, queryParameters, resultClazz);
    }

    protected <TEntity> Response post(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters) {

        final Invocation request =
            createRequest(HttpMethod.POST, locationId, routeValues, version, value, queryParameters);
        final Response response = sendRequest(request);

        return response;
    }

    protected <TEntity> Response post(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version) {
        return post(value, locationId, routeValues, version, (Map<String, String>) null);
    }

    protected <TEntity, TResult> TResult post(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        final Invocation request =
            createRequest(HttpMethod.POST, locationId, routeValues, version, value, queryParameters);
        final TResult result = sendRequest(request, resultClazz);

        return result;
    }

    protected <TEntity, TResult> TResult put(final TEntity value, final UUID locationId,
        final ApiResourceVersion version, final Class<TResult> resultClazz) {
        return put(value, locationId, null, version, null, resultClazz);
    }

    protected <TEntity, TResult> TResult put(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version, final Class<TResult> resultClazz) {
        return put(value, locationId, routeValues, version, null, resultClazz);
    }

    protected <TEntity> Response put(final TEntity value, final UUID locationId, final Map<String, Object> routeValues,
        final ApiResourceVersion version, final Map<String, String> queryParameters) {

        final Invocation request =
            createRequest(HttpMethod.PUT, locationId, routeValues, version, value, queryParameters);
        final Response response = sendRequest(request);

        return response;
    }

    protected <TEntity, TResult> TResult put(final TEntity value, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters, final Class<TResult> resultClazz) {

        final Invocation request =
            createRequest(HttpMethod.PUT, locationId, routeValues, version, value, queryParameters);
        final TResult result = sendRequest(request, resultClazz);

        return result;
    }

    private ApiResourceLocation getLocation(final UUID locationId) {
        if (resourceLocations == null) {
            final WebTarget optionsTarget = baseTarget.path(OPTIONS_RELATIVE_PATH);
            final Builder builder = optionsTarget.request(MediaType.APPLICATION_JSON_TYPE);

            try {
                // String o = builder.async().options(String.class).get();
                resourceLocations = builder.async().options(ApiResourceLocationCollection.class).get();
            } catch (final InterruptedException e) {
                // TODO log errors
                return null;
            } catch (final ExecutionException e) {
                return null;
            }
        }

        return resourceLocations.getLocationById(locationId);
    }

    private WebTarget createTarget(final UUID locationId, final Map<String, Object> routeValues,
        final Map<String, String> queryParameters) {

        final ApiResourceLocation location = getLocation(locationId);
        if (location == null) {
            throw new VssResourceNotFoundException(locationId, baseUrl);
        }

        final Map<String, Object> dictionary =
            toRouteDictionary(routeValues, location.getArea(), location.getResourceName());

        final String routeTemplate = location.getRouteTemplate();
        final String actualTemplate = removeUndefinedOptionalParameters(routeTemplate, dictionary);
        final WebTarget targetTemplate = baseTarget.path(actualTemplate);

        WebTarget target = targetTemplate.resolveTemplates(dictionary);

        if (queryParameters != null) {
            for (final Entry<String, String> queryParameter : queryParameters.entrySet()) {
                target = target.queryParam(queryParameter.getKey(), queryParameter.getValue());
            }
        }

        return target;
    }

    private String removeUndefinedOptionalParameters(final String template, final Map<String, Object> routeValues) {
        final String[] templateParameters = template.split(ROUTE_TEMPLATE_SEPARATOR);
        final List<String> actualParameters = new ArrayList<String>();

        for (int i = 0; i < templateParameters.length; i++) {
            final String parameter = templateParameters[i];

            if (parameter.startsWith("{")) { //$NON-NLS-1$
                final String name;

                if (parameter.startsWith("{*")) { //$NON-NLS-1$
                    name = parameter.substring(2, parameter.length() - 1);
                } else {
                    name = parameter.substring(1, parameter.length() - 1);
                }

                if (routeValues.get(name) != null) {
                    actualParameters.add("{" + name + "}"); //$NON-NLS-1$ //$NON-NLS-2$
                }
            } else {
                actualParameters.add(parameter);
            }
        }

        return StringUtil.join(ROUTE_TEMPLATE_SEPARATOR, actualParameters);
    }

    private Map<String, Object> toRouteDictionary(final Map<String, Object> routeValues, final String areaName,
        final String resourceName) {

        final HashMap<String, Object> dictionary = new HashMap<String, Object>();
        if (routeValues != null) {

            for (final Entry<String, Object> e : routeValues.entrySet()) {
                if (e.getValue() != null) {
                    dictionary.put(e.getKey(), e.getValue());
                }
            }
        }

        if (!dictionary.containsKey(AREA_PARAMETER_NAME)) {
            dictionary.put(AREA_PARAMETER_NAME, areaName);
        }

        if (!dictionary.containsKey(RESOURCE_PARAMETER_NAME)) {
            dictionary.put(RESOURCE_PARAMETER_NAME, resourceName);
        }

        return dictionary;
    }

    private MediaType getMediaTypeWithQualityHeaderValue(final ApiResourceVersion version) {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(API_VERSION_PARAMETER_NAME, version.toString());
        parameters.put(CHARSET_PARAMETER_NAME, UTF8_CHARSET);

        final MediaType mediaType =
            new MediaType(MediaType.APPLICATION_JSON_TYPE.getType(), MediaType.APPLICATION_JSON_TYPE.getSubtype(),
                parameters);

        return mediaType;
    }

    private MediaType getMediaTypeWithQualityHeaderValue() {
        final Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(CHARSET_PARAMETER_NAME, UTF8_CHARSET);

        final MediaType mediaType =
            new MediaType(MediaType.APPLICATION_JSON_TYPE.getType(), MediaType.APPLICATION_JSON_TYPE.getSubtype(),
                parameters);

        return mediaType;
    }

    private boolean isJsonResponse(final Response response) {
        if (response != null && response.getMediaType() != null) {
            return response.getMediaType().getType().equalsIgnoreCase("application") && response.getMediaType().getSubtype().equalsIgnoreCase("json"); //$NON-NLS-1$ //$NON-NLS-2$
        } else {
            return false;
        }
    }

    /**
     * Negotiate the appropriate request version to use for the given api
     * resource location, based on the client and server capabilities
     * 
     * @param location
     *            - Location of the API resource
     * @param version
     *            - Client version to attempt to use (use the latest VSS API
     *            version if unspecified)
     * @return - Max API version supported on the server that is less than or
     *         equal to the client version. Returns null if the server does not
     *         support this location or this version of the client.
     */
    protected ApiResourceVersion NegotiateRequestVersion(final ApiResourceLocation location,
        final ApiResourceVersion version) {

        if (version == null) {
            return DEFAULT_API_VERSION;
        }

        if (location.getMinVersion().compareTo(version.getApiVersion()) > 0) {
            // Client is older than the server. The server no longer supports
            // this resource (deprecated).
            return null;
        } else if (location.getMaxVersion().compareTo(version.getApiVersion()) < 0) {
            // Client is newer than the server. Negotiate down to the latest
            // version on the server
            return new ApiResourceVersion(location.getMaxVersion());
        } else {
            // We can send at the requested API version. Make sure the resource
            // version is not bigger than what the server supports
            final int resourceVersion = Math.min(version.getResourceVersion(), location.getResourceVersion());

            final ApiResourceVersion negotiatedVersion = new ApiResourceVersion(version.getApiVersion());

            negotiatedVersion.setResourceVersion(resourceVersion);
            negotiatedVersion.setPreview(version.isPreview());

            return negotiatedVersion;
        }
    }

    protected ApiResourceVersion NegotiateRequestVersion(final ApiResourceLocation location) {
        return NegotiateRequestVersion(location, DEFAULT_API_VERSION);
    }

    protected ApiResourceVersion NegotiateRequestVersion(final UUID locationId, final ApiResourceVersion version) {
        return NegotiateRequestVersion(getLocation(locationId), version);
    }

    protected Invocation createRequest(final String method, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version,
        final Map<String, String> queryParameters) {

        final WebTarget target = createTarget(locationId, routeValues, queryParameters);
        final MediaType acceptType = getMediaTypeWithQualityHeaderValue(NegotiateRequestVersion(locationId, version));

        return target.request(acceptType).build(method);
    }

    protected <TEntity> Invocation createRequest(final String method, final UUID locationId,
        final Map<String, Object> routeValues, final ApiResourceVersion version, final TEntity value,
        final Map<String, String> queryParameters) {

        final WebTarget target = createTarget(locationId, routeValues, queryParameters);
        final MediaType acceptType = getMediaTypeWithQualityHeaderValue(NegotiateRequestVersion(locationId, version));
        final MediaType contentType = getMediaTypeWithQualityHeaderValue();

        return target.request(acceptType).build(method, Entity.entity(value, contentType));
    }

    protected Response sendRequest(final Invocation request) {
        Response response;

        try {
            response = request.submit().get();
        } catch (final ExecutionException e) {
            // TODO log exception
            // TODO process cancellation

            throw new VssServiceException(e.getMessage(), e);
        } catch (final InterruptedException e) {
            // TODO log exception
            // TODO process cancellation

            throw new VssServiceException(e.getMessage(), e);
        }

        handleResponse(response);

        return response;
    }

    protected <TResult> TResult sendRequest(final Invocation request, final Class<TResult> resultClass) {
        final Response response = sendRequest(request);

        return response.readEntity(resultClass);
    }

    protected <TResult> TResult sendRequest(final Invocation request, final GenericType<TResult> resultClass) {
        final Response response = sendRequest(request);

        return response.readEntity(resultClass);
    }

    protected void handleResponse(final Response response) {
        if (response.getStatusInfo() == Response.Status.PROXY_AUTHENTICATION_REQUIRED) {
            throw new ProxyAuthenticationRequiredException();
        } else if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL) {
            Exception exceptionToThrow = null;

            if (isJsonResponse(response)) {
                final WrappedException wrappedException = response.readEntity(WrappedException.class);
                exceptionToThrow = wrappedException.Unwrap(getTranslatedExceptions());
            }

            if (exceptionToThrow == null || !(exceptionToThrow instanceof VssException)) {
                String message = null;

                if (exceptionToThrow != null) {
                    message = exceptionToThrow.getMessage();
                }

                final MultivaluedMap<String, String> headers = response.getStringHeaders();

                if (headers.containsKey(VssHttpHeaders.TFS_SERVICE_ERROR)) {
                    try {
                        message = URLDecoder.decode(headers.getFirst(VssHttpHeaders.TFS_SERVICE_ERROR), "UTF-8"); //$NON-NLS-1$
                    } catch (final UnsupportedEncodingException e) {
                        // do nothing
                    }
                } else if (StringUtil.isNullOrEmpty(message)
                    && !StringUtil.isNullOrEmpty(response.getStatusInfo().getReasonPhrase())) {
                    message = response.getStatusInfo().getReasonPhrase();
                }

                exceptionToThrow = new VssServiceResponseException(response.getStatusInfo(), message, exceptionToThrow);
            }

            throw (VssException) exceptionToThrow;
        }
    }

    protected static abstract class HttpMethod {
        public static final String PATCH = "PATCH"; //$NON-NLS-1$
        public static final String GET = "GET"; //$NON-NLS-1$
        public static final String POST = "POST"; //$NON-NLS-1$
        public static final String PUT = "PUT"; //$NON-NLS-1$
        public static final String DELETE = "DELETE"; //$NON-NLS-1$
        public static final String HEAD = "HEAD"; //$NON-NLS-1$
        public static final String OPTIONS = "OPTIONS"; //$NON-NLS-1$
    }
}
