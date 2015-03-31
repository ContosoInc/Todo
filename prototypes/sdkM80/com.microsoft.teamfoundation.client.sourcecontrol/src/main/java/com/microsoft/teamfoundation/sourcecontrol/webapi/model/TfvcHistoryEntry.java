/*
* ---------------------------------------------------------
* Copyright(C) Microsoft Corporation. All rights reserved.
* ---------------------------------------------------------
* 
* ---------------------------------------------------------
* Generated file, DO NOT EDIT
* ---------------------------------------------------------
*/
package com.microsoft.teamfoundation.sourcecontrol.webapi.model;

import java.net.*;
import java.util.*;

import com.microsoft.vss.client.core.model.*;
import com.microsoft.visualstudio.services.webapi.model.*;
import com.microsoft.teamfoundation.core.webapi.model.*;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.*;

public class TfvcHistoryEntry
    extends HistoryEntry<TfvcItem> {

    private int encoding;
    private int fileId;

    /**
     * Getter for Encoding
     * @return int
     */
    public int getEncoding() {
        return encoding;
    }

    /**
     * Setter for Encoding
     * @param encoding
     */
    public void setEncoding(final int encoding) {
        this.encoding = encoding;
    }

    /**
     * Getter for FileId
     * @return int
     */
    public int getFileId() {
        return fileId;
    }

    /**
     * Setter for FileId
     * @param fileId
     */
    public void setFileId(final int fileId) {
        this.fileId = fileId;
    }
}
