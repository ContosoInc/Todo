package com.microsoft.vss.client.distributedtask;

import java.util.UUID;

public abstract class TaskResourceIds {
    public final static String Area = "distributedtask"; //$NON-NLS-1$

    public final static UUID Agents = UUID.fromString("E298EF32-5878-4CAB-993C-043836571F42"); //$NON-NLS-1$
    public final static String AgentsResource = "agents"; //$NON-NLS-1$

    public final static UUID AgentMessages = UUID.fromString("C3A054F6-7A8A-49C0-944E-3A8E5D7ADFD7"); //$NON-NLS-1$
    public final static String AgentMessagesResource = "messages"; //$NON-NLS-1$

    public final static UUID AgentSessions = UUID.fromString("134E239E-2DF3-4794-A6F6-24F1F19EC8DC"); //$NON-NLS-1$
    public final static String AgentSessionsResource = "sessions"; //$NON-NLS-1$

    public final static UUID UserCapabilities = UUID.fromString("30BA3ADA-FEDF-4DA8-BBB5-DACF2F82E176"); //$NON-NLS-1$
    public final static String UserCapabilitiesResource = "usercapabilities"; //$NON-NLS-1$

    public final static UUID Logs = UUID.fromString("15344176-9E77-4CF4-A7C3-8BC4D0A3C4EB"); //$NON-NLS-1$
    public final static String LogsResource = "logs"; //$NON-NLS-1$

    public final static UUID Plans = UUID.fromString("F8D10759-6E90-48BC-96B0-D19440116797"); //$NON-NLS-1$
    public final static String PlansResource = "plans"; //$NON-NLS-1$

    public final static UUID JobEvents = UUID.fromString("DFED02FB-DEEE-4039-A04D-AA21D0241995"); //$NON-NLS-1$
    public final static String JobEventsResource = "events"; //$NON-NLS-1$

    public final static UUID Pools = UUID.fromString("A8C47E17-4D56-4A56-92BB-DE7EA7DC65BE"); //$NON-NLS-1$
    public final static String PoolsResource = "pools"; //$NON-NLS-1$

    public final static UUID Requests = UUID.fromString("57AF3969-93CA-47E9-93F6-63B124E8FF30"); //$NON-NLS-1$
    public final static String RequestsResource = "requests"; //$NON-NLS-1$

    public final static UUID JobRequests = UUID.fromString("FC825784-C92A-4299-9221-998A02D1B54F"); //$NON-NLS-1$
    public final static String JobRequestsResource = "jobrequests"; //$NON-NLS-1$

    public final static UUID Tasks = UUID.fromString("60AAC929-F0CD-4BC8-9CE4-6B30E8F1B1BD"); //$NON-NLS-1$
    public final static String TasksResource = "tasks"; //$NON-NLS-1$

    public final static UUID TaskIcons = UUID.fromString("63463108-174D-49D4-B8CB-235EEA42A5E1"); //$NON-NLS-1$
    public final static String TaskIconsResource = "icon"; //$NON-NLS-1$

    public final static UUID TaskDocumentation = UUID.fromString("C7701E23-91EA-48D6-9520-8050EFC046C2"); //$NON-NLS-1$
    public final static String TaskDocumentationResource = "documentation";         //$NON-NLS-1$

    public final static UUID Timelines = UUID.fromString("FFE38397-3A9D-4CA6-B06D-49303F287BA5"); //$NON-NLS-1$
    public final static String TimelinesResource = "timelines"; //$NON-NLS-1$

    public final static UUID TimelineRecords = UUID.fromString("50170D5D-F122-492F-9816-E2EF9F8D1756"); //$NON-NLS-1$
    public final static String TimelineRecordsResource = "records"; //$NON-NLS-1$

    public final static UUID TimelineRecordFeeds = UUID.fromString("9AE056F6-D4E4-4D0C-BD26-AEE2A22F01F2"); //$NON-NLS-1$
    public final static String TimelineRecordFeedsResource = "feed"; //$NON-NLS-1$
}
