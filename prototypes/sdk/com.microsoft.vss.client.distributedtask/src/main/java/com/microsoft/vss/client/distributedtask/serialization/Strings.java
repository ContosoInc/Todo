package com.microsoft.vss.client.distributedtask.serialization;

import java.util.List;

import com.microsoft.vss.client.core.serialization.VssJsonCollectionWrapper;

// TODO replace with VssCollectionWrapper and its JsonParser
public class Strings
    extends VssJsonCollectionWrapper<String> {

    public Strings(List<String> lines) {
        super(lines);
    }

}
