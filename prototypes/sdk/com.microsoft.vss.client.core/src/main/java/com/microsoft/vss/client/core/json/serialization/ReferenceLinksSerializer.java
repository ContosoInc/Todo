package com.microsoft.vss.client.core.json.serialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.microsoft.visualstudio.services.webapi.model.ReferenceLinks;

public class ReferenceLinksSerializer
    extends JsonSerializer<ReferenceLinks> {

    /**
     * Serializes ReferenceLinks to JSON
     * @param value
     * @param writer
     * @param serializer
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public void serialize(ReferenceLinks value, JsonGenerator writer, SerializerProvider serializer)
        throws IOException,
            JsonProcessingException {
        writer.writeObject(value.getLinks());
    }

}
