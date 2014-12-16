package com.microsoft.tfs.sdk.build.model.enumeration;

/**
 * Created by yacao on 12/12/2014.
 */
public enum DocumentQuality {
    Definition (1),
    Draft (2);

    private int quality;
    DocumentQuality(int quality) {
       this.quality = quality;
    }
}
