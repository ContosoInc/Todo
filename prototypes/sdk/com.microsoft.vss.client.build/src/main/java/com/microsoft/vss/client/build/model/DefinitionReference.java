package com.microsoft.vss.client.build.model;

import com.microsoft.vss.client.build.model.enumeration.DefinitionQueueStatus;
import com.microsoft.vss.client.build.model.enumeration.DefinitionType;

public class DefinitionReference
    extends ShallowReference {

    private String uri;
    private DefinitionType definitionType;
    private QueueReference queue;
    private DefinitionQueueStatus queueStatus;
    private int revision;

    /**
     * The Uri of the definition
     */
    public String getUri() {
        return uri;
    }

    /**
     * The Uri of the definition
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * The type of the definition.
     */
    public DefinitionType getDefinitionType() {
        return definitionType;
    }

    /**
     * The type of the definition.
     */
    public void setDefinitionType(DefinitionType definitionType) {
        this.definitionType = definitionType;
    }

    /**
     * The default queue which should be used for requests.
     */
    public QueueReference getQueue() {
        return queue;
    }

    /**
     * The default queue which should be used for requests.
     */
    public void setQueue(QueueReference queue) {
        this.queue = queue;
    }

    /**
     * If builds can be queued from this definition
     */
    public DefinitionQueueStatus getQueueStatus() {
        return queueStatus;
    }

    /**
     * If builds can be queued from this definition
     */
    public void setQueueStatus(DefinitionQueueStatus queueStatus) {
        this.queueStatus = queueStatus;
    }

    /**
     * The definition revision number.
     */
    public int getRevision() {
        return revision;
    }

    /**
     * The definition revision number.
     */
    public void setRevision(int revision) {
        this.revision = revision;
    }

}
