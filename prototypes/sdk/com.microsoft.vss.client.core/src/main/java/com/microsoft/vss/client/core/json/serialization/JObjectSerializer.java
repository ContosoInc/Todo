package com.microsoft.vss.client.core.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.vss.client.core.json.JObject;

public class JObjectSerializer
    extends JsonSerializer<JObject> {

    @Override
    public void serialize(JObject value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        writer.writeTree(value.getRoot());
    }

}
