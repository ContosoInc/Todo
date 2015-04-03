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

package com.microsoft.teamfoundation.build.webapi.model;

import com.microsoft.teamfoundation.build.webapi.model.DefinitionTriggerType;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class BuildTrigger {

    private DefinitionTriggerType triggerType;

    public DefinitionTriggerType getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(final DefinitionTriggerType triggerType) {
        this.triggerType = triggerType;
    }
}
