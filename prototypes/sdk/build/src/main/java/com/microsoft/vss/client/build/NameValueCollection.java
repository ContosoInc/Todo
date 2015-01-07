package com.microsoft.vss.client.build;

import java.util.HashMap;
import java.util.List;

import com.microsoft.vss.client.core.StringUtil;

public class NameValueCollection
    extends HashMap<String, String> {

    public <TValue> void addIfNotEmpty(String parameterName, List<TValue> values) {
        if (values != null && !values.isEmpty()) {
            put(parameterName, StringUtil.join(",", values)); //$NON-NLS-1$
        }
    }

    public void addIfNotEmpty(String parameterName, String value) {
        if (!StringUtil.isNullOrEmpty(value)) {
            put(parameterName, value);
        }
    }

    public <TValue> void addIfNotNull(String parameterName, TValue value) {
        if (value != null) {
            put(parameterName, value.toString());
        }
    }
}
