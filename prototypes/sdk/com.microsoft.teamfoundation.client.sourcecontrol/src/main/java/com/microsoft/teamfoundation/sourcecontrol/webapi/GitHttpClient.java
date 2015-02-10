package com.microsoft.teamfoundation.sourcecontrol.webapi;

import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitItem;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRef;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRepository;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitVersionDescriptor;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.VersionControlRecursionType;
import com.microsoft.vss.client.core.utils.ArgumentUtility;

public class GitHttpClient
    extends GitHttpClientBase {

    public GitHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    public GitItem getItem(final String project, final String repositoryId, final String path,
        final boolean includeContentMetadata) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getItem(project, repositoryId, path, null, VersionControlRecursionType.NONE,
            includeContentMetadata, false, false, null);
    }

    public GitItem getItem(final String project, final String repositoryId, final String path,
        final boolean includeContentMetadata, final boolean latestProcessedChange,
        final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getItem(project, repositoryId, path, null, VersionControlRecursionType.NONE,
            includeContentMetadata, latestProcessedChange, false, versionDescriptor);
    }

    public GitItem getItem(final UUID repositoryId, final String path, final boolean includeContentMetadata) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getItem(repositoryId, path, null, VersionControlRecursionType.NONE, includeContentMetadata, false,
            false, null);
    }

    public GitItem getItem(final UUID repositoryId, final String path, final boolean includeContentMetadata,
        final boolean latestProcessedChange, final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getItem(repositoryId, path, null, VersionControlRecursionType.NONE, includeContentMetadata,
            latestProcessedChange, false, versionDescriptor);
    }

    public List<GitItem> getItems(final UUID repositoryId, final String scopePath,
        final VersionControlRecursionType recursionLevel, final boolean includeContentMetadata,
        final boolean latestProcessedChange, final boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getItems(repositoryId, scopePath, recursionLevel, includeContentMetadata, latestProcessedChange,
            false, includeLinks, versionDescriptor);
    }

    public List<GitItem> getItems(final String project, final String repositoryId, final String scopePath,
        final VersionControlRecursionType recursionLevel, final boolean includeContentMetadata,
        final boolean latestProcessedChange, final boolean includeLinks, final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getItems(project, repositoryId, scopePath, recursionLevel, includeContentMetadata,
            latestProcessedChange, false, includeLinks, versionDescriptor);
    }

    public InputStream getItemContent(final UUID repositoryId, final String path,
        final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getItemContent(repositoryId, path, null, VersionControlRecursionType.NONE, false, false, true,
            versionDescriptor);
    }

    public InputStream getItemContent(final String project, final String repositoryId, final String path,
        final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getItemContent(repositoryId, path, null, VersionControlRecursionType.NONE, false, false, true,
            versionDescriptor);
    }

    public InputStream getItemZip(final String project, final String repositoryId, final String scopePath,
        final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getItemZip(project, repositoryId, null, scopePath, VersionControlRecursionType.FULL, false, false,
            true, versionDescriptor);
    }

    public InputStream getItemZip(final UUID repositoryId, final String scopePath,
        final GitVersionDescriptor versionDescriptor) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getItemZip(repositoryId, null, scopePath, VersionControlRecursionType.FULL, false, false, true,
            versionDescriptor);
    }

    public List<GitRef> getRefs(final String repositoryId) {
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId", true); //$NON-NLS-1$
        return super.getRefs(repositoryId, null, null);
    }

    public List<GitRef> getRefs(final String repositoryId, final boolean includeLinks) {
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getRefs(repositoryId, null, includeLinks);
    }

    public List<GitRef> getRefs(final String repositoryId, final String refType) {
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getRefs(repositoryId, refType, null);
    }

    public List<GitRef> getRefs(final String repositoryId, final String refType, final boolean includeLinks) {
        ArgumentUtility.checkStringForNullOrEmpty(repositoryId, "repositoryId"); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(refType, "refType", true); //$NON-NLS-1$
        return super.getRefs(repositoryId, refType, includeLinks);
    }

    public List<GitRef> getRefs(final UUID repositoryId) {
        return super.getRefs(repositoryId, null, null);
    }

    public List<GitRef> getRefs(final UUID repositoryId, final boolean includeLinks) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getRefs(repositoryId, null, includeLinks);
    }

    public List<GitRef> getRefs(final UUID repositoryId, final String refType) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        return super.getRefs(repositoryId, refType, null);
    }

    public List<GitRef> getRefs(final UUID repositoryId, final String refType, final boolean includeLinks) {
        ArgumentUtility.checkForEmptyGuid(repositoryId, "repositoryId"); //$NON-NLS-1$
        ArgumentUtility.checkStringForNullOrEmpty(refType, "refType", true); //$NON-NLS-1$
        return super.getRefs(repositoryId, refType, includeLinks);
    }

    public List<GitRepository> getRepositories() {
        return super.getRepositories(null);
    }

    public List<GitRepository> getRepositories(final boolean includeLinks) {
        return super.getRepositories(includeLinks);
    }

    public List<GitRepository> getRepositories(final String project) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        return super.getRepositories(project, null);
    }

    public List<GitRepository> getRepositories(final String project, final boolean includeLinks) {
        ArgumentUtility.checkStringForNullOrEmpty(project, "project", true); //$NON-NLS-1$
        return super.getRepositories(project, includeLinks);
    }
}
