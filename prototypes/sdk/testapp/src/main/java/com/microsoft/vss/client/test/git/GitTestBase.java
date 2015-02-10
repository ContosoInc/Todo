package com.microsoft.vss.client.test.git;

import java.net.URI;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.sourcecontrol.webapi.GitHttpClient;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.FileContentMetadata;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitItem;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRef;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.GitRepository;
import com.microsoft.vss.client.test.TestBase;
import com.microsoft.vss.client.test.project.ProjectTests;

public class GitTestBase
    extends TestBase {

    protected final GitHttpClient gitClient;

    public GitTestBase(final Client client, final URI baseUrl) {
        gitClient = new GitHttpClient(client, baseUrl);
    }

    protected UUID getRepositoryId(final String projectName, final String repoName) {
        final GitRepository repo = gitClient.getRepository(projectName, repoName);

        return repo.getId();
    }

    void printRepository(final GitRepository repo) {
        System.out.println("          Name = " + repo.getName()); //$NON-NLS-1$
        System.out.println("            Id = " + repo.getId()); //$NON-NLS-1$
        System.out.println("          Type = " + repo.getType()); //$NON-NLS-1$
        System.out.println("           Url = " + repo.getUrl()); //$NON-NLS-1$
        System.out.println("     RemoteUrl = " + repo.getRemoteUrl()); //$NON-NLS-1$
        System.out.println(" DefaultBranch = " + repo.getDefaultBranch()); //$NON-NLS-1$
        System.out.println("       Project : "); //$NON-NLS-1$
        ProjectTests.printProject(repo.getProjectReference());
    }

    void printRef(final GitRef ref) {
        System.out.println("          Name = " + ref.getName()); //$NON-NLS-1$
        System.out.println("            Id = " + ref.getObjectId()); //$NON-NLS-1$
    }

    void printItem(final GitItem item) {
        System.out.println("           Name = " + item.getPath()); //$NON-NLS-1$
        System.out.println("             Id = " + item.getObjectId()); //$NON-NLS-1$
        System.out.println("       CommitId = " + item.getCommitId()); //$NON-NLS-1$
        System.out.println("            Url = " + item.getUrl()); //$NON-NLS-1$
        System.out.println("  GitObjectType = " + item.getGitObjectType()); //$NON-NLS-1$
        printFileMetadata(item.getContentMetadata());
    }

    void printFileMetadata(final FileContentMetadata data) {
        if (data == null) {
            return;
        }

        System.out.println("    ContentType = " + data.getContentType()); //$NON-NLS-1$
        System.out.println("       Encoding = " + data.getEncoding()); //$NON-NLS-1$
        System.out.println("      Extension = " + data.getExtension()); //$NON-NLS-1$
        System.out.println("           Name = " + data.getFileName()); //$NON-NLS-1$
        System.out.println("     VS WebLink = " + data.getVisualStudioWebLink()); //$NON-NLS-1$
    }
}
