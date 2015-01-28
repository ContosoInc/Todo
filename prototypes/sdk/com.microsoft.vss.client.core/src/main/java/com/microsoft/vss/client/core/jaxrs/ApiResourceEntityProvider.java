package com.microsoft.vss.client.core.jaxrs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.vss.client.core.json.serialization.VssJsonCollectionWrapper;

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

        if (List.class.isInstance(entity)) {
            jsonGenerator.writeObject(VssJsonCollectionWrapper.newInstance((List<?>) entity));
        } else {
            jsonGenerator.writeObject(entity);
        }
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

        JavaType rootType = null;

        if (genericType instanceof ParameterizedType && ((ParameterizedType) genericType).getRawType() == List.class) {
            final Type itemType = ((ParameterizedType) genericType).getActualTypeArguments()[0];
            try {
                rootType =
                    objectMapper.getTypeFactory().constructParametricType(VssJsonCollectionWrapper.class,
                        Class.forName(((Class<?>) itemType).getName()));
            } catch (final ClassNotFoundException e) {
                // TODO Log exception
                throw new ProcessingException(e);
            }
        }

        if (rootType != null) {
            VssJsonCollectionWrapper<?> result =
                objectMapper.readValue(jsonParser, objectMapper.constructType(rootType));
            return result.getValue();
        } else {
            return objectMapper.readValue(jsonParser, objectMapper.constructType(genericType));
        }

    }
}
