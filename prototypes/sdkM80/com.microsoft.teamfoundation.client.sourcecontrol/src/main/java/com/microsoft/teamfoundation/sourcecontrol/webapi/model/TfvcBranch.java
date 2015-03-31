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

public class TfvcBranch
    extends TfvcBranchRef {

    private List<TfvcBranch> children;
    private List<TfvcBranchMapping> mappings;
    private TfvcShallowBranchRef parent;
    private List<TfvcShallowBranchRef> relatedBranches;

    /**
     * Getter for Children
     * @return List<TfvcBranch>
     */
    public List<TfvcBranch> getChildren() {
        return children;
    }

    /**
     * Setter for Children
     * @param children
     */
    public void setChildren(final List<TfvcBranch> children) {
        this.children = children;
    }

    /**
     * Getter for Mappings
     * @return List<TfvcBranchMapping>
     */
    public List<TfvcBranchMapping> getMappings() {
        return mappings;
    }

    /**
     * Setter for Mappings
     * @param mappings
     */
    public void setMappings(final List<TfvcBranchMapping> mappings) {
        this.mappings = mappings;
    }

    /**
     * Getter for Parent
     * @return TfvcShallowBranchRef
     */
    public TfvcShallowBranchRef getParent() {
        return parent;
    }

    /**
     * Setter for Parent
     * @param parent
     */
    public void setParent(final TfvcShallowBranchRef parent) {
        this.parent = parent;
    }

    /**
     * Getter for RelatedBranches
     * @return List<TfvcShallowBranchRef>
     */
    public List<TfvcShallowBranchRef> getRelatedBranches() {
        return relatedBranches;
    }

    /**
     * Setter for RelatedBranches
     * @param relatedBranches
     */
    public void setRelatedBranches(final List<TfvcShallowBranchRef> relatedBranches) {
        this.relatedBranches = relatedBranches;
    }
}
