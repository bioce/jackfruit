package com.github.bioce.jackfruit.jackson;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bioce.jackfruit.core.JackfruitException;

import java.util.List;
import java.util.Map;

/**
 * @author bioce
 * @date 2020-04-22 09:41
 */
public class Jackson {
    private static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String toJsonString(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new JackfruitException(e);
        }
    }

    public static <T> T parseObject(String text, Class<T> klass) {
        try {
            return objectMapper.readValue(text, klass);
        } catch (Exception e) {
            throw new JackfruitException(e);
        }
    }

    public static <T> List<T> parseArray(String text, Class<T> klass) {
        try {
            return objectMapper.readValue(text, new TypeReference<List<T>>() {});
        } catch (Exception e) {
            throw new JackfruitException(e);
        }
    }

    public static <K, V> Map<K, V> parseMap(String text, Class<K> kClass, Class<V> vClass) {
        try {
            return objectMapper.readValue(text, new TypeReference<Map<K, V>>() {});
        } catch (Exception e) {
            throw new JackfruitException(e);
        }
    }

}
