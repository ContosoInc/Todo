package com.microsoft.vss.client.test.build;

import java.net.URI;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import javax.ws.rs.client.Client;

import com.microsoft.teamfoundation.build.webapi.model.AgentPoolQueue;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinition;
import com.microsoft.teamfoundation.build.webapi.model.BuildDefinitionReference;
import com.microsoft.teamfoundation.build.webapi.model.BuildRepository;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionReference;
import com.microsoft.teamfoundation.build.webapi.model.DefinitionType;
import com.microsoft.teamfoundation.build.webapi.model.ShallowReference;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;

public class BuildDefinitionTests
    extends BuildTestBase {
    public BuildDefinitionTests(final Client client, final URI uri) {
        super(client, uri);
    }

    public void testGet_01(final String projectName) {

        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_01", this.getClass().getName())); //$NON-NLS-1$

        final UUID projectId = getProjectIdByName(projectName);

        final List<DefinitionReference> definitions = buildClient.getDefinitions(projectId);

        System.out.println(definitions.size() + " definition(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final DefinitionReference definition : definitions) {
            printBuildDefinitionReference((BuildDefinitionReference) definition);
        }

    }

    public void testGet_02(final String projectName, final String definitionName) {

        System.out.println(MessageFormat.format(
            "================================ {0} ==== {1} ================================", //$NON-NLS-1$
            "testGet_02", this.getClass().getName())); //$NON-NLS-1$

        final UUID projectId = getProjectIdByName(projectName);

        final List<DefinitionReference> definitions =
            buildClient.getDefinitions(projectId, definitionName, DefinitionType.BUILD);

        System.out.println(definitions.size() + " definition(s) read"); //$NON-NLS-1$
        System.out.println();

        for (final DefinitionReference definition : definitions) {
            printBuildDefinitionReference((BuildDefinitionReference) definition);
        }

    }

    private void printReference(final ShallowReference reference) {
        System.out.println("                 Id = " + reference.getId()); //$NON-NLS-1$
        System.out.println("               Name = " + reference.getName()); //$NON-NLS-1$
        System.out.println("                Url = " + reference.getUrl()); //$NON-NLS-1$
    }

    private void printDefinitionReference(final DefinitionReference definitionReference) {
        printReference(definitionReference);
        System.out.println("                Uri = " + definitionReference.getUri()); //$NON-NLS-1$
        System.out.println("     DefinitionType = " + definitionReference.getType()); //$NON-NLS-1$
        System.out.println("        QueueStatus = " + definitionReference.getQueueStatus()); //$NON-NLS-1$
        System.out.println("           Revision = " + definitionReference.getRevision()); //$NON-NLS-1$
    }

    private void printBuildDefinitionReference(final BuildDefinitionReference buildDefinitionReference) {
        printDefinitionReference(buildDefinitionReference);
        System.out.println("    DocumentQuality = " + buildDefinitionReference.getQuality()); //$NON-NLS-1$
        System.out.println("         AuthoredBy = " + buildDefinitionReference.getAuthoredBy().getDisplayName()); //$NON-NLS-1$
        System.out.println("            DraftOf : "); //$NON-NLS-1$
        printDefinitionReference(buildDefinitionReference.getDraftOf());
        System.out.println("            Project = " + buildDefinitionReference.getProject().getName()); //$NON-NLS-1$
        System.out.println("              Queue : "); //$NON-NLS-1$
        printAgentPoolQueue(buildDefinitionReference.getQueue());
    }

    private void printAgentPoolQueue(final AgentPoolQueue queue) {
        System.out.println("                 Id = " + queue.getId()); //$NON-NLS-1$
        System.out.println("               Name = " + queue.getName()); //$NON-NLS-1$
        System.out.println("                Uri = " + queue.getUrl()); //$NON-NLS-1$
        System.out.println("             _links : "); //$NON-NLS-1$
        printReferenceLinks(queue.getLinks());
    }

    private void printReferenceLinks(final ReferenceLinks links) {
        for (final Entry<String, Object> link : links.getLinks().entrySet()) {
            System.out.println("[" + link.getKey() + ", " + link.getValue() + "]"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        }
    }

    private void printBuildRepository(final BuildRepository repository) {
        if (repository == null) {
            System.out.println("         Repository = null"); //$NON-NLS-1$
            return;
        }

        System.out.println("         Repository:"); //$NON-NLS-1$
        System.out.println("                 Id = " + repository.getId()); //$NON-NLS-1$
        System.out.println("               Name = " + repository.getName()); //$NON-NLS-1$
        System.out.println("                Url = " + repository.getUrl()); //$NON-NLS-1$
        System.out.println("               Type = " + repository.getType()); //$NON-NLS-1$
        System.out.println("      DefaultBranch = " + repository.getDefaultBranch()); //$NON-NLS-1$
        System.out.println("         RootFolder = " + repository.getRootFolder()); //$NON-NLS-1$
    }

    private void printDefinition(final BuildDefinition buildDefinition) {
        printBuildDefinitionReference(buildDefinition);
        System.out.println("  BuildNumberFormat = " + buildDefinition.getBuildNumberFormat()); //$NON-NLS-1$
        System.out.println("            Comment = " + buildDefinition.getComment()); //$NON-NLS-1$
        System.out.println("        Description = " + buildDefinition.getDescription()); //$NON-NLS-1$
        System.out.println("       DropLocation = " + buildDefinition.getDropLocation()); //$NON-NLS-1$
        System.out.println("         BuildSteps = [ count " + buildDefinition.getBuild().size() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("            Options = [ count " + buildDefinition.getOptions().size() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
        printBuildRepository(buildDefinition.getRepository());
        System.out.println("           Triggers = [ count " + buildDefinition.getTriggers().size() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("          Variables = [ count " + buildDefinition.getVariables().size() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println("            Demands = [ count " + buildDefinition.getDemands().size() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
    }
}
