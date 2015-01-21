package com.microsoft.vss.client.sourcecontrol;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.client.Client;

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
import com.microsoft.vss.client.sourcecontrol.serialization.GitItems;
import com.microsoft.vss.client.sourcecontrol.serialization.GitRefUpdateResults;
import com.microsoft.vss.client.sourcecontrol.serialization.GitRefs;
import com.microsoft.vss.client.sourcecontrol.serialization.GitRepositories;

public class GitHttpClient
    extends VssHttpClientBase {

    private final static ApiResourceVersion API_VERSION = null;
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
     * Get a repository by id
     * 
     * @param repositoryId
     *            The id for the repository.
     */
    public GitRepository getRepository(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION, GitRepository.class);
    }

    /**
     * Get a repository by project ID or name and repository ID or name.
     * 
     * @param projectIdentifier
     *            The ID or Name of the project containing the repository.
     * @param repositoryIdentifier
     *            The ID or Name of the repository.
     */
    public GitRepository getRepository(final String projectIdentifier, final String repositoryIdentifier) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectIdentifier); //$NON-NLS-1$
        routeValues.put("repositoryId", repositoryIdentifier); //$NON-NLS-1$

        return super.get(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION, GitRepository.class);
    }

    /**
     * Get repositories for a specific project
     * 
     * @param projectIdentifier
     *            Either the project id (guid) or the project name. Project id
     *            is safer to use.
     */
    public List<GitRepository> getProjectRepositories(final String projectIdentifier) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("project", projectIdentifier); //$NON-NLS-1$

        final GitRepositories result =
            super.get(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION, GitRepositories.class);

        return result.getValue();
    }

    /**
     * Get all the repositories
     * 
     */
    public List<GitRepository> getRepositories() {
        final GitRepositories result =
            super.get(GitWebApiConstants.RepositoriesLocationId, API_VERSION, GitRepositories.class);

        return result.getValue();
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
    public GitRepository changeRepositoryType(final GitRepository repositoryToRename, final GitRepositoryType newType) {
        final GitRepository repositoryToSend = new GitRepository();
        repositoryToSend.setType(newType);

        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryToRename.getId()); //$NON-NLS-1$

        return super.patch(repositoryToSend, GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION,
            GitRepository.class);
    }

    /**
     * Change the type of a repository. Only the type is observed. If other
     * properties are passed, the server will ensure they match.
     */
    public void deleteRepository(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        super.delete(GitWebApiConstants.RepositoriesLocationId, routeValues, API_VERSION);
    }

    /*
     * Ref methods
     */

    /**
     * Get the refs for a specific git repository
     * 
     * @param repositoryId
     *            Repository Id
     */
    public List<GitRef> getRefs(final UUID repositoryId) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final GitRefs result = super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, GitRefs.class);

        return result.getValue();
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

        final GitRefs result = super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, GitRefs.class);

        return result.getValue();
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

        final GitRefs result = super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, GitRefs.class);

        return result.getValue();
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

        final GitRefs result = super.get(GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, GitRefs.class);

        return result.getValue();
    }

    public List<GitRefUpdateResult> updateRefs(final UUID repositoryId, final List<GitRefUpdate> updates) {
        final Map<String, Object> routeValues = new HashMap<String, Object>();
        routeValues.put("repositoryId", repositoryId); //$NON-NLS-1$

        final GitRefUpdateResults result =
            super.post(updates, GitWebApiConstants.RefsLocationId, routeValues, API_VERSION, GitRefUpdateResults.class);

        return result.getValue();
    }

    /*
     * Item methods
     */

    /**
     * Get a list of items containing the requested item as the first element.
     * Children will be placed into successive elements if recursio is
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

        final GitItems result =
            super.post(requestData, GitWebApiConstants.ItemsBatchLocationId, routeValues, API_VERSION, GitItems.class);

        return result.getValue();
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
