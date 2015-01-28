package com.microsoft.vss.client.sourcecontrol;

import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import com.microsoft.vss.client.core.VssHttpClientBase;
import com.microsoft.vss.client.core.model.ApiResourceVersion;
import com.microsoft.vss.client.sourcecontrol.model.GitItem;
import com.microsoft.vss.client.sourcecontrol.model.GitItemDescriptor;
import com.microsoft.vss.client.sourcecontrol.model.GitItemRequestData;
import com.microsoft.vss.client.sourcecontrol.model.GitRef;
import com.microsoft.vss.client.sourcecontrol.model.GitRefUpdate;
import com.microsoft.vss.client.sourcecontrol.model.GitRefUpdateResult;
import com.microsoft.vss.client.sourcecontrol.model.GitRepository;
import com.microsoft.vss.client.sourcecontrol.model.GitVersionDescriptor;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.GitRepositoryType;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.VersionControlRecursionType;

public class GitHttpClient
    extends VssHttpClientBase {

    private final static ApiResourceVersion API_VERSION = new ApiResourceVersion(2, 0, 1);
    private final static Map<String, Class<? extends Exception>> TRANSLATED_EXCEPTIONS;

    static {
        TRANSLATED_EXCEPTIONS = new HashMap<String, Class<? extends Exception>>();
    }

    public GitHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    @Override
    protected Map<String, Class<? extends Exception>> getTranslatedExceptions() {
        return TRANSLATED_EXCEPTIONS;
    }

    /*
     * Repository methods
     */

    /**
     * Get a repository by id or name
     * 
     * @param repository
     *            The id or name for the repository.
     */
    public GitRepository getRepository(final UUID repository) {
        return getRepository((Object) null, repository);
    }

    /**
     * Get a repository by id or name
     * 
     * @param repository
     *            The id or name for the repository.
     */
    public GitRepository getRepository(final String repository) {
        return getRepository((Object) null, repository);
    }

    /**
     * Get a repository by project ID or name and repository ID or name.
     */
    public GitRepository getRepository(final String project, final String repository) {
        return getRepository(project, repository);
    }

    /**
     * Get a repository by project ID or name and repository ID or name.
     */
    public GitRepository getRepository(final String project, final UUID repository) {
        return getRepository(project, repository);
    }

    /**
     * Get a repository by project ID or name and repository ID or name.
     */
    public GitRepository getRepository(final UUID project, final String repository) {
        return getRepository(project, repository);
    }

    /**
     * Get a repository by project ID or name and repository ID or name.
     */
    public GitRepository getRepository(final UUID project, final UUID repository) {
        return getRepository(project, repository);
    }

    private GitRepository getRepository(final Object project, final Object repository) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repository); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION, GitRepository.class);
    }

    /**
     * Get repositories for a specific project
     */
    public List<GitRepository> getRepositories(final String project) {
        return getRepositories((Object) project);
    }

    /**
     * Get repositories for a specific project
     */
    public List<GitRepository> getRepositories(final UUID project) {
        return getRepositories((Object) project);
    }

    private List<GitRepository> getRepositories(final Object project) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION,
            new GenericType<List<GitRepository>>() {});
    }

    /**
     * Get all the repositories
     * 
     */
    public List<GitRepository> getRepositories() {
        return super.get(GitWebApiConstants.RepositoriesLocationId, API_VERSION,
            new GenericType<List<GitRepository>>() {});
    }

    /**
     * Create a git repository
     * 
     * @param gitRepositoryToCreate
     *            Repository to create.
     */
    public GitRepository createRepository(final GitRepository gitRepositoryToCreate) {
        return super.post(gitRepositoryToCreate, GitWebApiConstants.RepositoriesLocationId, API_VERSION,
            GitRepository.class);
    }

    /**
     * Rename a repository. Only the name is observed. If other properties are
     * passed, the server will ensure they match.
     */
    public GitRepository renameRepository(final GitRepository repositoryToRename, final String newName) {
        final GitRepository repositoryToSend = new GitRepository();
        repositoryToSend.setName(newName);

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryToRename.getId()); //$NON-NLS-1$

        return super.patch(repositoryToSend, GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION,
            GitRepository.class);
    }

    /**
     * Change the type of a repository. Only the type is observed. If other
     * properties are passed, the server will ensure they match.
     */
    public GitRepository changeRepositoryType(final GitRepository repositoryToChange, final GitRepositoryType newType) {
        final GitRepository repositoryToSend = new GitRepository();
        repositoryToSend.setType(newType);

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryToChange.getId()); //$NON-NLS-1$

        return super.patch(repositoryToSend, GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION,
            GitRepository.class);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final String repositoryName) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryName); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final String projectName, final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectName); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final String projectName, final String repositoryName) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectName); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryName); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final UUID projectId, final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /**
     * Delete a git repository
     */
    public void deleteRepository(final UUID projectId, final String repositoryName) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectId); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryName); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /*
     * Ref methods
     */

    /**
     * Get the refs for a specific git repository
     */
    public List<GitRef> getRefs(final UUID project, final String repository) {
        return getRefs(project, repository, null, (Boolean) null);
    }

    /**
     * Get the refs for a specific git repository
     */
    public List<GitRef> getRefs(final UUID project, final UUID repository) {
        return getRefs(project, repository, null, (Boolean) null);
    }

    /**
     * Get the refs for a specific git repository
     */
    public List<GitRef> getRefs(final String project, final String repository) {
        return getRefs(project, repository, null, (Boolean) null);
    }

    /**
     * Get the refs for a specific git repository
     */
    public List<GitRef> getRefs(final String project, final UUID repository) {
        return getRefs(project, repository, null, (Boolean) null);
    }

    /**
     * Get the refs for a specific git repository
     */
    public List<GitRef> getRefs(final String repository) {
        return getRefs(null, repository, null, (Boolean) null);
    }

    public List<GitRef> getRefs(final UUID repository) {
        return getRefs(null, repository, null, (Boolean) null);
    }

    public List<GitRef> getRefs(final String project, final String repository, final String refType,
        final boolean includeLinks) {
        return getRefs(project, repository, refType, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final UUID project, final String repository, final String refType,
        final boolean includeLinks) {
        return getRefs(project, repository, refType, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final String project, final UUID repository, final String refType,
        final boolean includeLinks) {
        return getRefs(project, repository, refType, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final UUID project, final UUID repository, final String refType,
        final boolean includeLinks) {
        return getRefs(project, repository, refType, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final String repository, final boolean includeLinks) {
        return getRefs(null, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final UUID repository, final boolean includeLinks) {
        return getRefs(null, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final String project, final String repository, final boolean includeLinks) {
        return getRefs(project, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final UUID project, final String repository, final boolean includeLinks) {
        return getRefs(project, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final String project, final UUID repository, final boolean includeLinks) {
        return getRefs(project, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final UUID project, final UUID repository, final boolean includeLinks) {
        return getRefs(project, repository, null, (Boolean) includeLinks);
    }

    public List<GitRef> getRefs(final String project, final String repository, final String refType) {
        return getRefs(project, repository, refType, (Boolean) null);
    }

    public List<GitRef> getRefs(final UUID project, final String repository, final String refType) {
        return getRefs(project, repository, refType, (Boolean) null);
    }

    public List<GitRef> getRefs(final String project, final UUID repository, final String refType) {
        return getRefs(project, repository, refType, (Boolean) null);
    }

    public List<GitRef> getRefs(final UUID project, final UUID repository, final String refType) {
        return getRefs(project, repository, refType, (Boolean) null);
    }

    private List<GitRef> getRefs(final Object project, final Object repository, final String refType,
        final Boolean includeLinks) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", project); //$NON-NLS-1$
        routeValues.put("repositoryId", repository); //$NON-NLS-1$
        routeValues.put("refType", refType); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (includeLinks != null) {
            queryParameters.put("includeLinks", includeLinks.toString().toLowerCase()); //$NON-NLS-1$
        }

        return super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, queryParameters,
            new GenericType<List<GitRef>>() {});
    }

    /**
     * Get the refs that are branches for a specific git repository
     * 
     * @param repositoryId
     *            Repository Id
     */
    public List<GitRef> getBranchRefs(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", GitWebApiConstants.HeadsFilter); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION,
            new GenericType<List<GitRef>>() {});
    }

    /**
     * Get the refs that are tags for a specific git repository
     * 
     * @param repositoryId
     *            Repository Id
     */
    public List<GitRef> getTagRefs(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", GitWebApiConstants.TagsFilter); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION,
            new GenericType<List<GitRef>>() {});
    }

    /**
     * Get the refs that are tags for a specific git repository
     * 
     * @param repositoryId
     *            Repository Id
     */
    public List<GitRef> getFilteredRefs(final UUID repositoryId, final String filter) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("refType", filter); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION,
            new GenericType<List<GitRef>>() {});
    }

    public List<GitRefUpdateResult> updateRefs(final UUID repositoryId, final List<GitRefUpdate> updates) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        return super.post(updates, GitWebApiConstants.RefsLocationId, routeValues, API_VERSION,
            new GenericType<List<GitRefUpdateResult>>() {});
    }

    /*
     * Item methods
     */

    public GitItem getItem(final UUID repositoryId, final String path, final GitVersionDescriptor version,
        final boolean includeContentMetadata, final boolean includeLatestChange) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (includeContentMetadata) {
            queryParameters.put("includeContentMetadata", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        if (includeLatestChange) {
            queryParameters.put("latestProcessedChange", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        }

        if (version != null) {
            queryParameters.put("versionDescriptor", version.toString()); //$NON-NLS-1$
        }

        return super.get(GitWebApiConstants.ItemsLocationId, routeValues, API_VERSION, queryParameters, GitItem.class);
    }

    public InputStream getItemText(final UUID repositoryId, final String path, final GitVersionDescriptor version) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (version != null) {
            queryParameters.put("versionDescriptor", version.toString()); //$NON-NLS-1$
        }

        queryParameters.put("download", "true"); //$NON-NLS-1$ //$NON-NLS-2$

        final Invocation request =
            createRequest(HttpMethod.GET, GitWebApiConstants.ItemsLocationId, routeValues, API_VERSION,
                queryParameters, MediaType.TEXT_PLAIN_TYPE);

        return sendRequest(request, InputStream.class);
    }

    public InputStream getItemContent(final UUID repositoryId, final String path, final GitVersionDescriptor version) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$
        routeValues.put("path", path); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (version != null) {
            queryParameters.put("versionDescriptor", version.toString()); //$NON-NLS-1$
        }

        queryParameters.put("download", "true"); //$NON-NLS-1$ //$NON-NLS-2$

        final Invocation request =
            createRequest(HttpMethod.GET, GitWebApiConstants.ItemsLocationId, routeValues, API_VERSION,
                queryParameters, MediaType.APPLICATION_OCTET_STREAM_TYPE);

        return sendRequest(request, InputStream.class);
    }

    public InputStream getItemsContent(final UUID repositoryId, final String scopePath,
        final VersionControlRecursionType recursionLevel, final GitVersionDescriptor version) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (version != null) {
            queryParameters.put("versionDescriptor", version.toString()); //$NON-NLS-1$
        }

        queryParameters.put("download", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        queryParameters.put("scopePath", scopePath); //$NON-NLS-1$

        if (recursionLevel != null) {
            queryParameters.put("recursionLevel", recursionLevel.toString()); //$NON-NLS-1$
        }

        final Invocation request =
            createRequest(HttpMethod.GET, GitWebApiConstants.ItemsLocationId, routeValues, API_VERSION,
                queryParameters, MediaType.APPLICATION_OCTET_STREAM_TYPE);

        return sendRequest(request, InputStream.class);
    }

    public InputStream getItemsZip(final UUID repositoryId, final String scopePath,
        final VersionControlRecursionType recursionLevel, final GitVersionDescriptor version) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final Map<String, String> queryParameters = new HashMap<String, String>();

        if (version != null) {
            queryParameters.put("versionDescriptor", version.toString()); //$NON-NLS-1$
        }

        queryParameters.put("download", "true"); //$NON-NLS-1$ //$NON-NLS-2$
        queryParameters.put("scopePath", scopePath); //$NON-NLS-1$

        if (recursionLevel != null) {
            queryParameters.put("recursionLevel", recursionLevel.toString()); //$NON-NLS-1$
        }

        final Invocation request =
            createRequest(HttpMethod.GET, GitWebApiConstants.ItemsLocationId, routeValues, API_VERSION,
                queryParameters, APPLICATION_ZIP);

        return sendRequest(request, InputStream.class);
    }

    /**
     * Get a list of items containing the requested item as the first element.
     * Children will be placed into successive elements if recursion is
     * performed.
     * 
     * @param repositoryId
     *            UUID of repository
     * @param path
     *            full path to item from root
     * @param version
     *            description of version (name of branch/tag, sha1 of commit)
     * @param recursionLevel
     *            How deeply to fetch children
     * @param includeContentMetadata
     *            whether to include metadata of parent item (not children)
     * @param includeLatestChange
     * @return >A list of items, where the requested item is element 0
     */
    public List<GitItem> getItems(final UUID repositoryId, final String path, final GitVersionDescriptor version,
        final VersionControlRecursionType recursionLevel, final boolean includeContentMetadata,
        final boolean includeLatestChange) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final GitItemDescriptor itemDescriptor = new GitItemDescriptor();

        itemDescriptor.setPath(path);
        if (version != null) {
            itemDescriptor.setVersion(version.getVersion());
            itemDescriptor.setVersionType(version.getVersionType());
            itemDescriptor.setVersionOptions(version.getVersionOptions());
        }
        itemDescriptor.setRecursionLevel(recursionLevel);

        GitItemRequestData requestData = new GitItemRequestData();
        requestData.setIncludeContentMetadata(includeContentMetadata);
        requestData.setLatestProcessedChange(includeLatestChange);
        requestData.setItemDescriptors(new GitItemDescriptor[] {
            itemDescriptor
        });

        final List<List<GitItem>> result = getItemsBatch(repositoryId, requestData);

        return result.get(0);
    }

    public List<List<GitItem>> getItemsBatch(final UUID repositoryId, final GitItemRequestData requestData) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        return super.post(requestData, GitWebApiConstants.ItemsBatchLocationId, routeValues, API_VERSION,
            new GenericType<List<List<GitItem>>>() {});
    }

    // public InputStream getBlob(final UUID locationId, final String sha1) {
    //
    // final Invocation request = createRequest(HttpMethod.GET, locationId,
    // routeValues, version, queryParameters);
    // final InputStream result = sendRequest(request, InputStream.class);
    //
    // return result;
    // }

}
