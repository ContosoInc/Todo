package com.microsoft.vss.client.core.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.vss.client.core.json.serialization.ReferenceLinksDeserializer;

@JsonDeserialize(using = ReferenceLinksDeserializer.class)
public class ReferenceLinks {
    private Map<String, Object> referenceLinks = new HashMap<String, Object>();

    public Map<String, Object> getLinks() {
        return referenceLinks;
    }

    public void setReferenceLinks(final Map<String, Object> referenceLinks) {
        this.referenceLinks = referenceLinks;
    }

}
