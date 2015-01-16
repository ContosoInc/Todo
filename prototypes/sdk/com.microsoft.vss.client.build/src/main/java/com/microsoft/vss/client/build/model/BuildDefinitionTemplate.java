package com.microsoft.vss.client.build.model;

import java.util.UUID;

public class BuildDefinitionTemplate {
    private String id;
    private String name;
    private boolean canDelete;
    private String category;
    private UUID iconTaskId;
    private String description;
    private BuildDefinition template;

    public BuildDefinitionTemplate() {
        canDelete = true;
        category = "Custom"; //$NON-NLS-1$
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean canDelete() {
        return canDelete;
    }

    public void setDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public UUID getIconTaskId() {
        return iconTaskId;
    }

    public void setIconTaskId(UUID iconTaskId) {
        this.iconTaskId = iconTaskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BuildDefinition getTemplate() {
        return template;
    }

    public void setTemplate(BuildDefinition template) {
        this.template = template;
    }
}
