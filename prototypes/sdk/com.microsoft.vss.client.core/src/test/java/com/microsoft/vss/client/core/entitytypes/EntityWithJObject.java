package com.microsoft.vss.client.core.entitytypes;

import com.microsoft.vss.client.core.json.JObject;

public class EntityWithJObject {
    private int fieldA;
    private JObject fieldB;
    private String fieldC;

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    public JObject getFieldB() {
        return fieldB;
    }

    public void setFieldB(final JObject fieldB) {
        this.fieldB = fieldB;
    }

    public String getFieldC() {
        return fieldC;
    }

    public void setFieldC(final String fieldC) {
        this.fieldC = fieldC;
    }
}
