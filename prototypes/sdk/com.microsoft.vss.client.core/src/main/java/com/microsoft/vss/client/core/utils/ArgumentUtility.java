package com.microsoft.vss.client.core.utils;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.UUID;

import com.microsoft.vss.client.core.Messages;

public abstract class ArgumentUtility {

    public final static String EMPTY_UUID_STRING = "00000000-0000-0000-0000-000000000000"; //$NON-NLS-1$
    public final static UUID EMPTY_UUID = UUID.fromString(EMPTY_UUID_STRING);

    public static void checkForNull(Object var, String varName) {
        if (var == null) {
            throw new IllegalArgumentException(MessageFormat.format(
                Messages.getString("ArgumentUtil.NullNotAllowedFormat"), varName)); //$NON-NLS-1$
        }
    }

    public static void checkStringForNullOrEmpty(String stringVar, String stringVarName) {
        checkStringForNullOrEmpty(stringVar, stringVarName, false);
    }

    public static void checkStringForNullOrEmpty(String stringVar, String stringVarName, boolean trim) {
        checkForNull(stringVar, stringVarName);
        if (trim == true) {
            stringVar = stringVar.trim();
        }
        if (stringVar.length() == 0) {
            throw new IllegalArgumentException(MessageFormat.format(
                Messages.getString("ArgumentUtil.EmptyStringNotAllowedFormat"), stringVarName)); //$NON-NLS-1$
        }
    }

    public static void checkCollectionForNullOrEmpty(Collection<?> collection, String collectionName) {
        checkForNull(collection, collectionName);
        if (collection.size() == 0) {
            throw new IllegalArgumentException(MessageFormat.format(
                Messages.getString("ArgumentUtil.EmptyCollectionNotAllowedFormat"), collectionName)); //$NON-NLS-1$
        }
    }

    public static void checkForEmptyGuid(UUID guid, String varName) {
        checkForNull(guid, varName);
        if (guid.equals(EMPTY_UUID)) {
            throw new IllegalArgumentException(MessageFormat.format(
                Messages.getString("ArgumentUtil.EmptyGuidNotAllowedFormat"), varName, EMPTY_UUID_STRING)); //$NON-NLS-1$
        }
    }
}
