package com.microsoft.teamfoundation.distributedtask.webapi;

import com.microsoft.teamfoundation.distributedtask.webapi.model.TimelineRecord;
import com.microsoft.visualstudio.services.webapi.model.VssJsonCollectionWrapper;

import java.net.URI;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.client.Client;

public class DistributedTaskHttpClient
    extends DistributedTaskHttpClientBase {

    public DistributedTaskHttpClient(final Client jaxrsClient, final URI baseUrl) {
        super(jaxrsClient, baseUrl);
    }

    /**
     * @param records
     *
     * @param planId
     *
     * @param timelineId
     *
     * @return List<TimelineRecord>
     */
    public List<TimelineRecord> updateRecords(
            final List<TimelineRecord> records,
            final UUID planId,
            final UUID timelineId) {
        return super.updateRecords(VssJsonCollectionWrapper.newInstance(records), planId, timelineId);
    }

    /**
     * @param lines
     *
     * @param planId
     *
     * @param timelineId
     *
     * @param recordId
     *
     */
    public void postLines(
            final List<String> lines,
            final UUID planId,
            final UUID timelineId,
            final UUID recordId) {
        super.postLines(VssJsonCollectionWrapper.newInstance(lines), planId, timelineId, recordId);
    }
}
