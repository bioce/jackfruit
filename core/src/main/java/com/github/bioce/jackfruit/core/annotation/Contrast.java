package com.github.bioce.jackfruit.core.annotation;

import java.lang.annotation.*;

/**
 * @author bioce
 * @date 2020-04-29 23:10
 */
@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Contrast {
    String fieldName();
}
