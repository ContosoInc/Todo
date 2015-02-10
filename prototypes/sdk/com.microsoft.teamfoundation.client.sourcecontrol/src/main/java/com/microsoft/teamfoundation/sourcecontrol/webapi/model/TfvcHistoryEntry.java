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
import com.fasterxml.jackson.annotation.JsonProperty;

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
