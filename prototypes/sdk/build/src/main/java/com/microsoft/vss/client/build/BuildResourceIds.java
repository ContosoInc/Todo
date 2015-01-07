package com.microsoft.vss.client.build;

import java.util.UUID;

public abstract class BuildResourceIds {

    public final static String Area = "build"; //$NON-NLS-1$

    public final static UUID Builds = UUID.fromString("{0CD358E1-9217-4D94-8269-1C1EE6F93DCF}"); //$NON-NLS-1$
    public final static String BuildsResource = "builds"; //$NON-NLS-1$

    public final static UUID Definitions = UUID.fromString("{DBEAF647-6167-421A-BDA9-C9327B25E2E6}"); //$NON-NLS-1$
    public final static String DefinitionsResource = "definitions"; //$NON-NLS-1$

    public final static UUID Templates = UUID.fromString("{E884571E-7F92-4D6A-9274-3F5649900835}"); //$NON-NLS-1$
    public final static String TemplatesResource = "templates"; //$NON-NLS-1$

    public final static UUID DefinitionRevisions = UUID.fromString("{7C116775-52E5-453E-8C5D-914D9762D8C4}"); //$NON-NLS-1$
    public final static String DefinitionRevisionsResource = "revisions"; //$NON-NLS-1$

    public final static UUID Options = UUID.fromString("{591CB5A4-2D46-4F3A-A697-5CD42B6BD332}"); //$NON-NLS-1$
    public final static String OptionsResource = "options"; //$NON-NLS-1$

    public final static UUID Queues = UUID.fromString("{09F2A4B8-08C9-4991-85C3-D698937568BE}"); //$NON-NLS-1$
    public final static String QueuesResource = "queues"; //$NON-NLS-1$

    public final static UUID Artifacts = UUID.fromString("{1DB06C96-014E-44E1-AC91-90B2D4B3E984}"); //$NON-NLS-1$
    public final static String ArtifactsResource = "artifacts"; //$NON-NLS-1$

    public final static UUID BuildCommits = UUID.fromString("{54572C7B-BBD3-45D4-80DC-28BE08941620}"); //$NON-NLS-1$
    public final static String BuildCommitsResource = "commits"; //$NON-NLS-1$

    public final static UUID BuildLogs = UUID.fromString("{35A80DAF-7F30-45FC-86E8-6B813D9C90DF}"); //$NON-NLS-1$
    public final static String BuildLogsResource = "logs"; //$NON-NLS-1$

    public final static UUID Tags = UUID.fromString("{D84AC5C6-EDC7-43D5-ADC9-1B34BE5DEA09}"); //$NON-NLS-1$
    public final static UUID BuildTags = UUID.fromString("{6E6114B2-8161-44C8-8F6C-C5505782427F}"); //$NON-NLS-1$
    public final static String BuildTagsResource = "tags"; //$NON-NLS-1$

}
