package com.microsoft.vss.client.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.vss.client.core.StringUtil;
import com.microsoft.vss.client.core.jaxrs.JsonHelper;

public abstract class JsonUtil {
    public static void writeJson(final String path, final Object value) {
        OutputStream stream = null;
        try {
            stream = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (stream == null) {
            return;
        }

        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
        JsonGenerator jsonGenerator = null;

        try {
            jsonGenerator = objectMapper.getFactory().createGenerator(stream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (jsonGenerator == null) {
            return;
        }

        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        jsonGenerator.useDefaultPrettyPrinter();

        try {
            jsonGenerator.writeObject(value);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String toJson(final Object value) {
        OutputStream stream = new OutputStream() {
            private StringBuilder sb = new StringBuilder();

            @Override
            public void write(int b)
                throws IOException {
                this.sb.append((char) b);
            }

            @Override
            public String toString() {
                return this.sb.toString();
            }
        };

        final ObjectMapper objectMapper = JsonHelper.getObjectMapper();
        JsonGenerator jsonGenerator = null;

        try {
            jsonGenerator = objectMapper.getFactory().createGenerator(stream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (jsonGenerator == null) {
            return StringUtil.EMPTY;
        }

        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        jsonGenerator.useDefaultPrettyPrinter();

        try {
            jsonGenerator.writeObject(value);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return stream.toString();
    }
}
