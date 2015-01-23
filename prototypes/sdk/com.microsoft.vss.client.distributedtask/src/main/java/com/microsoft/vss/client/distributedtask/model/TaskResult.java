package com.microsoft.vss.client.distributedtask.model;

public enum TaskResult {
    Succeeded, SucceededWithIssues, Failed, Canceled, Skipped, Abandoned;

    @Override
    public String toString() {
        final String name = super.toString();
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }
}
