package io.github.lengmuyun.chapter02;

public class VolatileExample {

    int x = 42;
    volatile boolean v = false;

    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v) {
            // 这里x会是多少呢?
        }
    }

}
