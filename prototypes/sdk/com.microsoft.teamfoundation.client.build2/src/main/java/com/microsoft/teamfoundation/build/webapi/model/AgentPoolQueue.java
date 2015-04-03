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

import com.microsoft.teamfoundation.build.webapi.model.ShallowReference;
import com.microsoft.teamfoundation.build.webapi.model.TaskAgentPoolReference;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class AgentPoolQueue
    extends ShallowReference {

    private ReferenceLinks _links;
    private TaskAgentPoolReference pool;

    public ReferenceLinks get_links() {
        return _links;
    }

    public void set_links(final ReferenceLinks _links) {
        this._links = _links;
    }

    public TaskAgentPoolReference getPool() {
        return pool;
    }

    public void setPool(final TaskAgentPoolReference pool) {
        this.pool = pool;
    }
}
