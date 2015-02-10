package com.microsoft.vss.client.core.model;

import com.microsoft.vss.client.core.utils.StringUtil;

public class ApiResourceVersion {
    private final static String PREVIEW_STAGE_NAME = "preview"; //$NON-NLS-1$

    private int major;
    private int minor;
    private int resourceVersion;
    private boolean isPreview;

    public ApiResourceVersion() {
        this(1, 0);
    }

    public ApiResourceVersion(final int major, final int minor) {
        this(major, minor, 0);
    }

    public ApiResourceVersion(final int major, final int minor, final int resourceVersion) {
        this.major = major;
        this.minor = minor;
        this.resourceVersion = resourceVersion;
        this.isPreview = resourceVersion > 0;
    }

    public ApiResourceVersion(final String apiResourceVersionString) {
        toVersion(apiResourceVersionString);
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(final int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(final int minor) {
        this.minor = minor;
    }

    public int getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final int resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void setPreview(final boolean isPreview) {
        this.isPreview = isPreview;
    }

    public String getApiVersion() {
        StringBuilder sb = new StringBuilder();

        sb.append(getMajor());
        sb.append('.');
        sb.append(getMinor());

        return sb.toString();
    }

    public void toVersion(final String apiVersionString) {
        if (StringUtil.isNullOrEmpty(apiVersionString)) {
            throw new IllegalArgumentException("ApiVersion: is null or empty"); //$NON-NLS-1$
        }

        final String[] apiResourceVersionParts = apiVersionString.split("-"); //$NON-NLS-1$

        if (apiResourceVersionParts.length == 2) {
            if (!tryParsePreview(apiResourceVersionParts[1])) {
                throw new IllegalArgumentException("ApiVersion: " + apiVersionString); //$NON-NLS-1$
            }
        }

        if (!tryParseVersion(apiResourceVersionParts[0])) {
            throw new IllegalArgumentException("ApiVersion: " + apiVersionString); //$NON-NLS-1$
        }
    }

    private boolean tryParseVersion(final String apiVersion) {
        final int p = apiVersion.indexOf('.');

        if (p < 0) {
            try {
                this.major = Integer.parseInt(apiVersion);
            } catch (final NumberFormatException e) {
                return false;
            }
        } else {
            try {
                this.major = Integer.parseInt(apiVersion.substring(0, p));
                this.minor = Integer.parseInt(apiVersion.substring(p + 1));
            } catch (final NumberFormatException e) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder sbVersion = new StringBuilder();

        sbVersion.append(major);
        sbVersion.append('.');
        sbVersion.append(minor);

        if (isPreview) {
            sbVersion.append('-');
            sbVersion.append(PREVIEW_STAGE_NAME);

            if (resourceVersion > 0) {
                sbVersion.append('.');
                sbVersion.append(resourceVersion);
            }
        }
        return sbVersion.toString();
    }

    private boolean tryParsePreview(final String previewVersion) {
        final String[] previewParts = previewVersion.split("\\."); //$NON-NLS-1$

        if (previewParts.length == 2) {
            try {
                this.resourceVersion = Integer.parseInt(previewParts[1]);
            } catch (final NumberFormatException e) {
                return false;
            }
        }

        if (previewParts.length > 0 && PREVIEW_STAGE_NAME.equalsIgnoreCase(previewParts[0])) {
            this.isPreview = true;
            return true;
        }

        return false;
    }
}
