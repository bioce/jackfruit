package com.github.bioce.jackfruit.core;

/**
 * @author bioce
 * @date 2020-04-21 12:40
 */
public class StringUtils {

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static boolean isNotEmpty(String s) {
        return s != null && !s.isEmpty();
    }

}
