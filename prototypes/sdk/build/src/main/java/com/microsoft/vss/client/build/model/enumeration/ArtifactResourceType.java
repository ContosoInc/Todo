package com.microsoft.vss.client.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum ArtifactResourceType {
    /**
     * Default value. Currently is never sent over the wire.
     */
    Unknown,

    /**
     * UNC or local folder path E.g.
     * \\vscsstor\CIDrops\CloudU.Gated\140317.115955 or
     * file://vscsstor/CIDrops/CloudU.Gated/140317.115955
     */
    LocalPath,

    /**
     * TF VC server folder path E.g. $/Dev1/Drops/CloudU.Gated/140317.115955
     */
    VersionControl,

    /**
     * Build container reference E.g. #/2121/drop
     */
    Container
}
