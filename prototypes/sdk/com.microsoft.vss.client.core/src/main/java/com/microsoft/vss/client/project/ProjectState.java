package com.microsoft.vss.client.project;

public enum ProjectState {
    New(0), WellFormed(1), Deleting(2), CreateProject(3),
    /**
     * Used for the project history.
     */
    Deleted(4),
    /**
     * Used for filtering.
     */
    All(-1),
    /**
     * Used for updating projects.
     */
    Unchanged(-2);

    public final int value;

    ProjectState(final int value) {
        this.value = value;
    }
}
