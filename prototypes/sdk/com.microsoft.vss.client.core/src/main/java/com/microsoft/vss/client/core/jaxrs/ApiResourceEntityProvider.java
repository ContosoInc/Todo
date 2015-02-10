package com.microsoft.vss.client.core.jaxrs;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.vss.client.core.json.serialization.VssJsonCollectionWrapper;
import com.microsoft.vss.client.core.utils.JsonHelper;

public class ApiResourceEntityProvider
    implements MessageBodyReader<Object> {

    // @Override
    // public long getSize(Object entity, Class<?> type, Type genericType,
    // Annotation[] annotations, MediaType mediaType) {
    // return -1;
    // }
    //
    // @Override
    // public boolean isWriteable(Class<?> type, Type genericType, Annotation[]
    // annotations, MediaType mediaType) {
    // return mediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE);
    // }
    //
    // @Override
    // public void writeTo(Object entity, Class<?> type, Type genericType,
    // Annotation[] annotations, MediaType mediaType,
    // MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
    // throws IOException,
    // WebApplicationException {
    //
    // final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
    // final JsonGenerator jsonGenerator =
    // objectMapper.getFactory().createGenerator(entityStream);
    // jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
    //
    // if (List.class.isInstance(entity)) {
    // jsonGenerator.writeObject(VssJsonCollectionWrapper.newInstance((List<?>)
    // entity));
    // } else {
    // jsonGenerator.writeObject(entity);
    // }
    // }

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return mediaType.getType().equalsIgnoreCase("application") //$NON-NLS-1$
            && mediaType.getSubtype().equalsIgnoreCase("json");  //$NON-NLS-1$
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
        MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
        throws IOException,
            WebApplicationException {

        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
        final JsonParser jsonParser = objectMapper.getFactory().createParser(entityStream);
        jsonParser.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);

        if (genericType instanceof ParameterizedType && ((ParameterizedType) genericType).getRawType() == List.class) {
            final JavaType rootType =
                objectMapper.getTypeFactory().constructParametricType(VssJsonCollectionWrapper.class,
                    objectMapper.constructType(genericType));
            final VssJsonCollectionWrapper<?> result = objectMapper.readValue(jsonParser, rootType);
            return result.getValue();
        } else {
            return objectMapper.readValue(jsonParser, objectMapper.constructType(genericType));
        }

    }
}
