package com.github.bioce.jackfruit.util;

/**
 * @author bioce
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
