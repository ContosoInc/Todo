package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.DocumentQuality;
import com.microsoft.vss.client.core.model.IdentityRef;
import com.microsoft.vss.client.core.model.TeamProjectReference;

/**
 * Created by yacao on 12/12/2014.
 */
public class BuildDefinitionReference
    extends DefinitionReference {
    private DocumentQuality documentQuality;
    private IdentityRef authoredBy;
    private Integer parentDefinitionId;
    private TeamProjectReference project;

    public DocumentQuality getDocumentQuality() {
        return documentQuality;
    }

    public void setDocumentQuality(DocumentQuality documentQuality) {
        this.documentQuality = documentQuality;
    }

    public IdentityRef getAuthoredBy() {
        return authoredBy;
    }

    public void setAuthoredBy(IdentityRef authoredBy) {
        this.authoredBy = authoredBy;
    }

    public Integer getParentDefinitionId() {
        return parentDefinitionId;
    }

    public void setParentDefinitionId(Integer parentDefinitionId) {
        this.parentDefinitionId = parentDefinitionId;
    }

    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(TeamProjectReference project) {
        this.project = project;
    }
}
