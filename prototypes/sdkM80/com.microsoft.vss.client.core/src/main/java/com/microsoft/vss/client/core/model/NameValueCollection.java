package com.microsoft.vss.client.core.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.microsoft.vss.client.core.utils.JsonHelper;
import com.microsoft.vss.client.core.utils.StringUtil;

public class NameValueCollection
    extends HashMap<String, String> {

    /**
     * Add parameter to collection if not empty
     * @param parameterName
     * @param values
     * @param <TValue>
     */
    public <TValue> void addIfNotEmpty(String parameterName, List<TValue> values) {
        if (values != null && !values.isEmpty()) {
            put(parameterName, StringUtil.join(",", values)); //$NON-NLS-1$
        }
    }

    /**
     * Add parameter to collection if not empty
     * @param parameterName
     * @param value
     */
    public void addIfNotEmpty(String parameterName, String value) {
        if (!StringUtil.isNullOrEmpty(value)) {
            put(parameterName, value);
        }
    }

    /**
     * Add parameter to collection if not empty
     * @param parameterName
     * @param value
     * @param <TValue>
     */
    public <TValue> void addIfNotNull(String parameterName, TValue value) {
        if (value != null) {
            if (value instanceof Date) {
                put(parameterName, JsonHelper.getDateFormat().format((Date) value));
            } else {
                put(parameterName, value.toString());
            }
        }
    }
}
