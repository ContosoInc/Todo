package com.microsoft.vss.client.core.jaxrs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiResourceEntityProvider
    implements MessageBodyReader<Object>, MessageBodyWriter<Object> {

    @Override
    public long getSize(Object entity, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return mediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE);
    }

    @Override
    public void writeTo(Object entity, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType,
        MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
        throws IOException,
            WebApplicationException {

        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
        final JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(entityStream);
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        jsonGenerator.useDefaultPrettyPrinter();

        jsonGenerator.writeObject(entity);
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return mediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE);
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
        MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
        throws IOException,
            WebApplicationException {

        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
        final JsonParser jsonParser = objectMapper.getFactory().createParser(entityStream);
        jsonParser.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);

        return objectMapper.readValue(jsonParser, objectMapper.constructType(genericType));
    }

}
