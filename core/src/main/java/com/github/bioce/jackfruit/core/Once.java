package com.github.bioce.jackfruit.core;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author bioce
 */
public class Once {

    private volatile boolean done;

    private ReentrantLock lock;

    public Once() {
        this.lock = new ReentrantLock();
    }

    public static Once build() {
        return new Once();
    }

    public void doit(Runnable runnable) {
        if (done) {
            return;
        }
        lock.lock();
        try {
            if (done) {
                return;
            }
            runnable.run();
            done = true;
        } finally {
            lock.unlock();
        }
    }
}
