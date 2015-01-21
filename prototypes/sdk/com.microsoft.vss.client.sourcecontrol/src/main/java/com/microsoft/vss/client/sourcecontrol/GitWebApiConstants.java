package com.microsoft.vss.client.sourcecontrol;

import java.util.UUID;

public class GitWebApiConstants {
    public final static String HeadsFilter = "heads"; //$NON-NLS-1$
    public final static String TagsFilter = "tags"; //$NON-NLS-1$

    public final static String AreaName = "git"; //$NON-NLS-1$

    public final static String RefsLocationIdString = "2D874A60-A811-4F62-9C9F-963A6EA0A55B"; //$NON-NLS-1$
    public final static UUID RefsLocationId = UUID.fromString(RefsLocationIdString);
    public final static String ProjectRefsLocationIdString = "4C36AADB-AF42-45BB-80CA-6DF5CD443E0D"; //$NON-NLS-1$
    public final static UUID ProjectRefsLocationId = UUID.fromString(ProjectRefsLocationIdString);
    // Future_Atomic_Refs_Support
    public final static String CollectionRefsLocationIdString = "69046841-5346-42C7-A4C4-28B7EC1CEB35"; //$NON-NLS-1$
    public final static UUID CollectionRefsLocationId = UUID.fromString(CollectionRefsLocationIdString);
    // end of Future_Atomic_Refs_Support
    public final static String RepositoriesLocationIdString = "225F7195-F9C7-4D14-AB28-A83F7FF77E1F"; //$NON-NLS-1$
    public final static UUID RepositoriesLocationId = UUID.fromString(RepositoriesLocationIdString);
    public final static String ProjectRepositoriesLocationIdString = "88AEA7E8-9501-45DD-AC58-B069AA73B926"; //$NON-NLS-1$
    public final static UUID ProjectRepositoriesLocationId = UUID.fromString(ProjectRepositoriesLocationIdString);
    public final static String ItemsLocationIdString = "FB93C0DB-47ED-4A31-8C20-47552878FB44"; //$NON-NLS-1$
    public final static UUID ItemsLocationId = UUID.fromString(ItemsLocationIdString);
    public final static String ProjectItemsLocationIdString = "433AB753-6ED9-4169-9841-DD3F7611834A"; //$NON-NLS-1$
    public final static UUID ProjectItemsLocationId = UUID.fromString(ProjectItemsLocationIdString);
    public final static String ItemsBatchLocationIdString = "630FD2E4-FB88-4F85-AD21-13F3FD1FBCA9"; //$NON-NLS-1$
    public final static UUID ItemsBatchLocationId = UUID.fromString(ItemsBatchLocationIdString);
    public final static String ProjectItemsBatchLocationIdString = "567EF866-886B-44CC-81E2-6CC075905CE5"; //$NON-NLS-1$
    public final static UUID ProjectItemsBatchLocationId = UUID.fromString(ProjectItemsBatchLocationIdString);
    public final static String TreesLocationIdString = "729F6437-6F92-44EC-8BEE-273A7111063C"; //$NON-NLS-1$
    public final static UUID TreesLocationId = UUID.fromString(TreesLocationIdString);
    public final static String ProjectTreesLocationIdString = "11E0A184-7E28-4B77-9523-1D4D6DC29241"; //$NON-NLS-1$
    public final static UUID ProjectTreesLocationId = UUID.fromString(ProjectTreesLocationIdString);
    public final static String BlobsLocationIdString = "7B28E929-2C99-405D-9C5C-6167A06E6816"; //$NON-NLS-1$
    public final static UUID BlobsLocationId = UUID.fromString(BlobsLocationIdString);
    public final static String ProjectBlobsLocationIdString = "CFFAC033-C2F1-41A2-ACB3-B765E50A8D29"; //$NON-NLS-1$
    public final static UUID ProjectBlobsLocationId = UUID.fromString(ProjectBlobsLocationIdString);
    public final static String CommitsLocationIdString = "C2570C3B-5B3F-41B8-98BF-5407BFDE8D58"; //$NON-NLS-1$
    public final static UUID CommitsLocationId = UUID.fromString(CommitsLocationIdString);
    public final static String ProjectCommitsLocationIdString = "41A3DE30-8D9E-4F79-A7E3-EF8CF1299454"; //$NON-NLS-1$
    public final static UUID ProjectCommitsLocationId = UUID.fromString(ProjectCommitsLocationIdString);
    public final static String PushesLocationIdString = "EA98D07B-3C87-4971-8EDE-A613694FFB55"; //$NON-NLS-1$
    public final static UUID PushesLocationId = UUID.fromString(PushesLocationIdString);
    public final static String ProjectPushesLocationIdString = "9777557B-F5A5-4A6B-94F8-39AFF53B5B41"; //$NON-NLS-1$
    public final static UUID ProjectPushesLocationId = UUID.fromString(ProjectPushesLocationIdString);
    public final static String BranchesStatsLocationIdString = "D5B216DE-D8D5-4D32-AE76-51DF755B16D3"; //$NON-NLS-1$
    public final static UUID BranchesStatsLocationId = UUID.fromString(BranchesStatsLocationIdString);
    public final static String ProjectBranchesStatsLocationIdString = "B32DC299-ABE2-41E9-BD15-1E6856B95C9C"; //$NON-NLS-1$
    public final static UUID ProjectBranchesStatsLocationId = UUID.fromString(ProjectBranchesStatsLocationIdString);
    public final static String BranchStatsLocationIdString = "40C1F5B7-2BB6-4C28-B844-0F47CD6BB610"; //$NON-NLS-1$
    public final static UUID BranchStatsLocationId = UUID.fromString(BranchStatsLocationIdString);
    public final static String ProjectBranchStatsLocationIdString = "9B2552E4-9E48-4557-98EC-1982F699615F"; //$NON-NLS-1$
    public final static UUID ProjectBranchStatsLocationId = UUID.fromString(ProjectBranchStatsLocationIdString);
    public final static String CommitChangesLocationIdString = "5BF884F5-3E07-42E9-AFB8-1B872267BF16"; //$NON-NLS-1$
    public final static UUID CommitChangesLocationId = UUID.fromString(CommitChangesLocationIdString);
    public final static String ProjectCommitChangesLocationIdString = "074DB773-D674-4DE9-A0DD-FCB6ADDDECF9"; //$NON-NLS-1$
    public final static UUID ProjectCommitChangesLocationId = UUID.fromString(ProjectCommitChangesLocationIdString);
    public final static String PushCommitsLocationIdString = "168B4BB9-D936-4CD9-8A5F-66D6F6B23192"; //$NON-NLS-1$
    public final static UUID PushCommitsLocationId = UUID.fromString(PushCommitsLocationIdString);
    public final static String ProjectPushCommitsLocationIdString = "CC7A4CB0-7377-494A-80D4-EF4D607F6EB2"; //$NON-NLS-1$
    public final static UUID ProjectPushCommitsLocationId = UUID.fromString(ProjectPushCommitsLocationIdString);
    public final static String CommitDiffsLocationIdString = "615588D5-C0C7-4B88-88F8-E625306446E8"; //$NON-NLS-1$
    public final static UUID CommitDiffsLocationId = UUID.fromString(CommitDiffsLocationIdString);
    public final static String ProjectCommitDiffsLocationIdString = "29BA9926-BE39-4DB5-BBDF-D6C9458195C6"; //$NON-NLS-1$
    public final static UUID ProjectCommitDiffsLocationId = UUID.fromString(ProjectCommitDiffsLocationIdString);
    public final static String CommitsBatchLocationIdString = "6400DFB2-0BCB-462B-B992-5A57F8F1416C"; //$NON-NLS-1$
    public final static UUID CommitsBatchLocationId = UUID.fromString(CommitsBatchLocationIdString);
    public final static String ProjectCommitsBatchLocationIdString = "FED1587D-F1C8-475D-925C-B97F2C9DDE50"; //$NON-NLS-1$
    public final static UUID ProjectCommitsBatchLocationId = UUID.fromString(ProjectCommitsBatchLocationIdString);
    public final static String PullRequestsLocationIdString = "9946FD70-0D40-406E-B686-B4744CBBCC37"; //$NON-NLS-1$
    public final static UUID PullRequestsLocationId = UUID.fromString(PullRequestsLocationIdString);
    public final static String ProjectPullRequestsLocationIdString = "5318BF6C-115F-4828-BA3E-73ECA825C276"; //$NON-NLS-1$
    public final static UUID ProjectPullRequestsLocationId = UUID.fromString(ProjectPullRequestsLocationIdString);
    public final static String PullRequestReviewersLocationIdString = "4B6702C7-AA35-4B89-9C96-B9ABF6D3E540"; //$NON-NLS-1$
    public final static UUID PullRequestReviewersLocationId = UUID.fromString(PullRequestReviewersLocationIdString);
    public final static String ProjectPullRequestReviewersLocationIdString = "1D5702F2-90E2-4FE0-8794-4FCD822ADB9B"; //$NON-NLS-1$
    public final static UUID ProjectPullRequestReviewersLocationId =
        UUID.fromString(ProjectPullRequestReviewersLocationIdString);
    public final static String PullRequestWorkItemsLocationIdString = "0A637FCC-5370-4CE8-B0E8-98091F5F9482"; //$NON-NLS-1$
    public final static UUID PullRequestWorkItemsLocationId = UUID.fromString(PullRequestWorkItemsLocationIdString);
    public final static String ProjectPullRequestWorkItemsLocationIdString = "A92EC66C-5851-41A4-A96B-4A0860958844"; //$NON-NLS-1$
    public final static UUID ProjectPullRequestWorkItemsLocationId =
        UUID.fromString(ProjectPullRequestWorkItemsLocationIdString);
    public final static String MediaLocationIdString = "33645B30-4853-4236-AB87-FFED6EA1B5D5"; //$NON-NLS-1$
    public final static UUID MediaLocationId = UUID.fromString(MediaLocationIdString);
    public final static String ProjectMediaLocationIdString = "C96A81CD-52F6-41D9-843C-58C584967BA5"; //$NON-NLS-1$
    public final static UUID ProjectMediaLocationId = UUID.fromString(ProjectMediaLocationIdString);

    public final static String MediaTypeGitMedia = "application/vnd.git-media"; //$NON-NLS-1$
    public final static String MediaTypeGitMediaJson = "application/vnd.git-media+json"; //$NON-NLS-1$

}
