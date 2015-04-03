package com.microsoft.vss.client.core.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.teamfoundation.distributedtask.webapi.model.Demand;

public class DestributedTasksDemandSerializer
    extends JsonSerializer<Demand> {

    /**
     * Serializes ReferenceLinks to JSON
     * @param value
     * @param writer
     * @param serializer
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public void serialize(Demand value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        writer.writeObject(value.toString());
    }
}
