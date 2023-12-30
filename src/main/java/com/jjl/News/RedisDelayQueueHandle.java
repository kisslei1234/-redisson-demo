package com.jjl.News;

public interface RedisDelayQueueHandle<T> {

    void execute(T t);
}
