package com.github.bioce.jackfruit.core;

/**
 * @author bioce
 * @date 2020-04-29 22:09
 */
public class JackfruitException extends RuntimeException {
    public JackfruitException() {
        super();
    }

    public JackfruitException(String message) {
        super(message);
    }

    public JackfruitException(String message, Throwable cause) {
        super(message, cause);
    }

    public JackfruitException(Throwable cause) {
        super(cause);
    }
}
