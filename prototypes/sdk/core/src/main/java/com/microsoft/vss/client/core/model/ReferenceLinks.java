package com.microsoft.vss.client.core.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.microsoft.vss.client.core.json.serialization.ReferenceLinksDeserializer;
import com.microsoft.vss.client.core.json.serialization.ReferenceLinksSerializer;

@JsonDeserialize(using = ReferenceLinksDeserializer.class)
@JsonSerialize(using = ReferenceLinksSerializer.class)
public class ReferenceLinks {
    private Map<String, Object> referenceLinks = new HashMap<String, Object>();

    public Map<String, Object> getLinks() {
        return referenceLinks;
    }

    public void setReferenceLinks(final Map<String, Object> referenceLinks) {
        this.referenceLinks = referenceLinks;
    }

}
