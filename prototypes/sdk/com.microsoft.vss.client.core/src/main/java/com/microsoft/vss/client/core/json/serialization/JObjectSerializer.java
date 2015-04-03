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
    public void serialize(JObject arg0, JsonGenerator arg1, SerializerProvider arg2)
        throws IOException,
            JsonProcessingException {
        // TODO Auto-generated method stub

    }

}
