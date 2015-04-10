package com.microsoft.vss.client.core.entitytypes;

import com.microsoft.vss.client.core.TestUtil;

public class JObjectSample1 {
    private int fieldA;
    private String fieldB;

    public JObjectSample1() {}

    private JObjectSample1(final int fieldA, final String fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    public int getFieldA() {
        return fieldA;
    }

    public void setFieldA(final int fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(final String fieldB) {
        this.fieldB = fieldB;
    }

    public static JObjectSample1 getRandomSample() {
        final int i = TestUtil.getRandomInt();
        final String s = TestUtil.getRandomString();

        final JObjectSample1 o = new JObjectSample1(i, s);
        return o;
    }

    @Override
    public boolean equals(final Object obj) {
        if (!(obj instanceof JObjectSample1)) {
            return false;
        }

        final JObjectSample1 o = (JObjectSample1) obj;

        if (fieldA != o.getFieldA()) {
            return false;
        }

        return fieldB.equals(o.getFieldB());
    }
}
