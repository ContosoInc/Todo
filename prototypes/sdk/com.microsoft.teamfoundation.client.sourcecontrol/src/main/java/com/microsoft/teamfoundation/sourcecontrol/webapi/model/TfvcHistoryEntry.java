/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*
* See following wiki page for instructions on how to regenerate:
*   https://vsowiki.com/index.php?title=Rest_Client_Generation
*/

package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcItem;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcHistoryEntry
    extends HistoryEntry<TfvcItem> {

    private int encoding;
    private int fileId;

    public int getEncoding() {
        return encoding;
    }

    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(final int fileId) {
        this.fileId = fileId;
    }
}
