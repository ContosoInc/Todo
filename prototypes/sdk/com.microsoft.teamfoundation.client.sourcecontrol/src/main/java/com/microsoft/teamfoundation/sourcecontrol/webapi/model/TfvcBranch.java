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
