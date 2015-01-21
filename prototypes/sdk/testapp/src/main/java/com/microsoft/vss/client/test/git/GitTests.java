package com.microsoft.vss.client.test.git;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.vss.client.sourcecontrol.model.GitItem;
import com.microsoft.vss.client.sourcecontrol.model.GitRef;
import com.microsoft.vss.client.sourcecontrol.model.GitRepository;
import com.microsoft.vss.client.sourcecontrol.model.enumeration.VersionControlRecursionType;

public class GitTests
    extends GitTestBase {

    public GitTests(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01() {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_01", this.getClass().getName())); //$NON-NLS-1$

        final List<GitRepository> repositories = gitClient.getRepositories();

        System.out.println(repositories.size() + " repository(ies) read"); //$NON-NLS-1$
        System.out.println();

        for (final GitRepository r : repositories) {
            printRepository(r);
        }

    }

    public void testGet_02(final String projectName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        final List<GitRepository> repositories = gitClient.getProjectRepositories(projectName);

        System.out.println(repositories.size() + " repository(ies) read"); //$NON-NLS-1$
        System.out.println();

        for (final GitRepository r : repositories) {
            printRepository(r);
        }
    }

    public void testGet_03(final String projectName, final String repoName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_03", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final GitRepository repository = gitClient.getRepository(repoId);

        printRepository(repository);
    }

    public void testGet_04(final String projectName, final String repoName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_04", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final List<GitRef> refs = gitClient.getRefs(repoId);

        System.out.println(refs.size() + " ref(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final GitRef r : refs) {
            printRef(r);
        }
    }

    public void testGet_05(final String projectName, final String repoName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_05", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final List<GitRef> refs = gitClient.getRefs(repoId);

        System.out.println(refs.size() + " ref(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final GitRef r : refs) {
            printRef(r);
        }
    }

    public void testPost_01(final String projectName, final String repoName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testPost_01", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final List<GitItem> items =
            gitClient.getItems(repoId, GitRepository.ROOT_PATH, null, VersionControlRecursionType.OneLevel, true, false);

        System.out.println(items.size() + " item(s) read"); //$NON-NLS-1$
        System.out.println();

        for (GitItem item : items) {
            printItem(item);
        }
    }

    public void testPost_02(final String projectName, final String repoName, final String path) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testPost_02", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final List<GitItem> items =
            gitClient.getItems(repoId, path, null, VersionControlRecursionType.Full, true, true);

        System.out.println(items.size() + " item(s) read"); //$NON-NLS-1$
        System.out.println();

        for (GitItem item : items) {
            printItem(item);
        }
    }
}
