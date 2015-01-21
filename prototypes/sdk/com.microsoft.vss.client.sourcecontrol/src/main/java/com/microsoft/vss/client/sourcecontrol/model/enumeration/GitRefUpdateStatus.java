package com.microsoft.vss.client.sourcecontrol.model.enumeration;

/**
 * Represents the possible outcomes from a request to update a ref in a
 * repository.
 */
public enum GitRefUpdateStatus {
    /**
     * Indicates that the ref update request was completed successfully.
     */
    Succeeded,

    /**
     * Indicates that the ref update request could not be completed because part
     * of the graph would be disconnected by this change, and the caller does
     * not have ForcePush permission on the repository.
     */
    ForcePushRequired,

    /**
     * Indicates that the ref update request could not be completed because the
     * old object ID presented in the request was not the object ID of the ref
     * when the database attempted the update. The most likely scenario is that
     * the caller lost a race to update the ref.
     */
    StaleOldObjectId,

    /**
     * Indicates that the ref update request could not be completed because the
     * ref name presented in the request was not valid.
     */
    InvalidRefName,

    /**
     * The request was not processed
     */
    Unprocessed,

    /**
     * The ref update request could not be completed because the new object ID
     * for the ref could not be resolved to a commit object (potentially through
     * any number of tags)
     */
    UnresolvableToCommit,

    /**
     * The ref update request could not be completed because the user lacks
     * write permissions required to write this ref
     */
    WritePermissionRequired,

    /**
     * The ref update request could not be completed because the user lacks note
     * creation permissions required to write this note
     */
    ManageNotePermissionRequired,

    /**
     * The ref update request could not be completed because the user lacks the
     * permission to create a branch
     */
    CreateBranchPermissionRequired,

    /**
     * The ref update request could not be completed because the user lacks the
     * permission to create a tag
     */
    CreateTagPermissionRequired,

    /**
     * The ref update could not be completed because it was rejected by the
     * plugin.
     */
    RejectedByPlugin,

    /**
     * The ref update could not be completed because the ref is locked by
     * another user.
     */
    Locked,

    /**
     * The ref update could not be completed because, in case-insensitive mode,
     * the ref name conflicts with an existing, differently-cased ref name.
     */
    RefNameConflict,

    /**
     * The ref update could not be completed because it was rejected by policy.
     */
    RejectedByPolicy;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

}
