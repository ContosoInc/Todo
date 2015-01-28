package com.microsoft.vss.client.test.git;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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

    public void testGet_06(final String projectName, final String repoName, final String path) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_06", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final GitItem item = gitClient.getItem(repoId, path, null, true, true);
        printItem(item);
    }

    public void testGet_07(final String projectName, final String repoName, final String path) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_07", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final InputStream item = gitClient.getItemText(repoId, path, null);

        try {
            final InputStreamReader reader = new InputStreamReader(item, "UTF-8"); //$NON-NLS-1$
            final OutputStreamWriter writer = new OutputStreamWriter(System.out);

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            writer.flush();

            reader.close();
            // writer.close();

        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testGet_08(final String projectName, final String repoName, final String path) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_08", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final InputStream item = gitClient.getItemContent(repoId, path, null);

        try {
            final InputStreamReader reader = new InputStreamReader(item, "UTF-8"); //$NON-NLS-1$
            final OutputStreamWriter writer = new OutputStreamWriter(System.out);

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            writer.flush();

            reader.close();
            // writer.close();

        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void testGet_09(final String projectName, final String repoName, final String path) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_09", this.getClass().getName())); //$NON-NLS-1$

        final UUID repoId = getRepositoryId(projectName, repoName);

        final InputStream inputStream = gitClient.getItemsZip(repoId, path, VersionControlRecursionType.Full, null);
        final ZipInputStream unzippedInputStream = new ZipInputStream(inputStream);

        try {
            ZipEntry ze;

            final InputStreamReader reader = new InputStreamReader(unzippedInputStream);
            final OutputStreamWriter writer = new OutputStreamWriter(System.out);

            while ((ze = unzippedInputStream.getNextEntry()) != null) {
                System.out.println(MessageFormat.format("___________________ {0} ___________________", ze.getName())); //$NON-NLS-1$

                if (!ze.isDirectory()) {
                    try {

                        int ch;

                        while ((ch = reader.read()) != -1) {
                            writer.write(ch);
                        }

                        writer.flush();

                    } catch (UnsupportedEncodingException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println();
            }

            reader.close();
            // writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void testPatch_01(final String projectName, final String repoName, final String newRepoName) {
        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testPatch_01", this.getClass().getName())); //$NON-NLS-1$

        final GitRepository oldRepo = gitClient.getRepository(projectName, repoName);
        printRepository(oldRepo);

        final GitRepository newRepo = gitClient.renameRepository(oldRepo, newRepoName);
        printRepository(newRepo);

        final GitRepository restoredRepo = gitClient.renameRepository(newRepo, repoName);
        printRepository(restoredRepo);
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
