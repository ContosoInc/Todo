package com.microsoft.vss.client.core.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.microsoft.vss.client.core.json.JObject;

public class JObjectDeserializer
    extends JsonDeserializer<JObject> {

    @Override
    public JObject deserialize(JsonParser arg0, DeserializationContext arg1)
        throws IOException,
            JsonProcessingException {
        // TODO Auto-generated method stub
        return null;
    }

}
