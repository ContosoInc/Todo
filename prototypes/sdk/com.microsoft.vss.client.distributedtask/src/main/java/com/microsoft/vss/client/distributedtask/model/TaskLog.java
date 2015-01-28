package com.microsoft.vss.client.distributedtask.model;

import java.net.URI;
import java.util.Date;

import com.microsoft.vss.client.core.StringUtil;

public class TaskLog
    extends TaskLogReference {

    private URI indexLocation;
    private String path;
    private int lineCount;
    private Date createdOn;
    private Date lastChangedOn;

    public TaskLog() {}

    public TaskLog(String path) {
        assert !StringUtil.isNullOrEmpty(path) : "path parameter cannot be empty"; //$NON-NLS-1$
        this.setPath(path);
    }

    public URI getIndexLocation() {
        return indexLocation;
    }

    public void setIndexLocation(URI indexLocation) {
        this.indexLocation = indexLocation;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(final int lineCount) {
        this.lineCount = lineCount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(final Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

}
