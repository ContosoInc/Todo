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

import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcBranch;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcBranchMapping;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcBranchRef;
import com.microsoft.teamfoundation.sourcecontrol.webapi.model.TfvcShallowBranchRef;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TfvcBranch
    extends TfvcBranchRef {

    private List<TfvcBranch> children;
    private List<TfvcBranchMapping> mappings;
    private TfvcShallowBranchRef parent;
    private List<TfvcShallowBranchRef> relatedBranches;

    public List<TfvcBranch> getChildren() {
        return children;
    }

    public void setChildren(final List<TfvcBranch> children) {
        this.children = children;
    }

    public List<TfvcBranchMapping> getMappings() {
        return mappings;
    }

    public void setMappings(final List<TfvcBranchMapping> mappings) {
        this.mappings = mappings;
    }

    public TfvcShallowBranchRef getParent() {
        return parent;
    }

    public void setParent(final TfvcShallowBranchRef parent) {
        this.parent = parent;
    }

    public List<TfvcShallowBranchRef> getRelatedBranches() {
        return relatedBranches;
    }

    public void setRelatedBranches(final List<TfvcShallowBranchRef> relatedBranches) {
        this.relatedBranches = relatedBranches;
    }
}
