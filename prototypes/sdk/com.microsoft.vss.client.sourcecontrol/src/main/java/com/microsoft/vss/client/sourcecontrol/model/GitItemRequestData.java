package com.microsoft.vss.client.sourcecontrol.model;

public class GitItemRequestData {
    private GitItemDescriptor[] itemDescriptors;
    private boolean includeContentMetadata;
    private boolean latestProcessedChange;
    private boolean includeLinks;

    /**
     * Collection of items to fetch, including path, version, and recursion
     * level
     */
    public GitItemDescriptor[] getItemDescriptors() {
        return itemDescriptors;
    }

    /**
     * Collection of items to fetch, including path, version, and recursion
     * level
     */
    public void setItemDescriptors(final GitItemDescriptor[] itemDescriptors) {
        this.itemDescriptors = itemDescriptors;
    }

    /**
     * Whether to include metadata for all items
     */
    public boolean isIncludeContentMetadata() {
        return includeContentMetadata;
    }

    /**
     * Whether to include metadata for all items
     */
    public void setIncludeContentMetadata(final boolean includeContentMetadata) {
        this.includeContentMetadata = includeContentMetadata;
    }

    /**
     * Whether to include shallow ref to commit that last changed each item
     */
    public boolean isLatestProcessedChange() {
        return latestProcessedChange;
    }

    /**
     * Whether to include shallow ref to commit that last changed each item
     */
    public void setLatestProcessedChange(final boolean latestProcessedChange) {
        this.latestProcessedChange = latestProcessedChange;
    }

    /**
     * Whether to include the _links field on the shallow references
     */
    public boolean isIncludeLinks() {
        return includeLinks;
    }

    /**
     * Whether to include the _links field on the shallow references
     */
    public void setIncludeLinks(final boolean includeLinks) {
        this.includeLinks = includeLinks;
    }
}
