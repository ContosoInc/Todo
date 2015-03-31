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

public enum GitRefUpdateStatus {

    SUCCEEDED(0),
    FORCE_PUSH_REQUIRED(1),
    STALE_OLD_OBJECT_ID(2),
    INVALID_REF_NAME(3),
    UNPROCESSED(4),
    UNRESOLVABLE_TO_COMMIT(5),
    WRITE_PERMISSION_REQUIRED(6),
    MANAGE_NOTE_PERMISSION_REQUIRED(7),
    CREATE_BRANCH_PERMISSION_REQUIRED(8),
    CREATE_TAG_PERMISSION_REQUIRED(9),
    REJECTED_BY_PLUGIN(10),
    LOCKED(11),
    REF_NAME_CONFLICT(12),
    REJECTED_BY_POLICY(13),
    ;
    
    private int value;

    private GitRefUpdateStatus(final int value) {
        this.value = value;
    }

    /**
     * String representation of an object of type GitRefUpdateStatus
     */
    @Override
    public String toString() {
        final String name = super.toString();

        if (name.equals("SUCCEEDED")) { //$NON-NLS-1$
            return "succeeded"; //$NON-NLS-1$
        }

        if (name.equals("FORCE_PUSH_REQUIRED")) { //$NON-NLS-1$
            return "forcePushRequired"; //$NON-NLS-1$
        }

        if (name.equals("STALE_OLD_OBJECT_ID")) { //$NON-NLS-1$
            return "staleOldObjectId"; //$NON-NLS-1$
        }

        if (name.equals("INVALID_REF_NAME")) { //$NON-NLS-1$
            return "invalidRefName"; //$NON-NLS-1$
        }

        if (name.equals("UNPROCESSED")) { //$NON-NLS-1$
            return "unprocessed"; //$NON-NLS-1$
        }

        if (name.equals("UNRESOLVABLE_TO_COMMIT")) { //$NON-NLS-1$
            return "unresolvableToCommit"; //$NON-NLS-1$
        }

        if (name.equals("WRITE_PERMISSION_REQUIRED")) { //$NON-NLS-1$
            return "writePermissionRequired"; //$NON-NLS-1$
        }

        if (name.equals("MANAGE_NOTE_PERMISSION_REQUIRED")) { //$NON-NLS-1$
            return "manageNotePermissionRequired"; //$NON-NLS-1$
        }

        if (name.equals("CREATE_BRANCH_PERMISSION_REQUIRED")) { //$NON-NLS-1$
            return "createBranchPermissionRequired"; //$NON-NLS-1$
        }

        if (name.equals("CREATE_TAG_PERMISSION_REQUIRED")) { //$NON-NLS-1$
            return "createTagPermissionRequired"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED_BY_PLUGIN")) { //$NON-NLS-1$
            return "rejectedByPlugin"; //$NON-NLS-1$
        }

        if (name.equals("LOCKED")) { //$NON-NLS-1$
            return "locked"; //$NON-NLS-1$
        }

        if (name.equals("REF_NAME_CONFLICT")) { //$NON-NLS-1$
            return "refNameConflict"; //$NON-NLS-1$
        }

        if (name.equals("REJECTED_BY_POLICY")) { //$NON-NLS-1$
            return "rejectedByPolicy"; //$NON-NLS-1$
        }

        return null;
    }
}
