package com.butchjgo.linkservice.common.service;

public interface MessageHandler<T> {
    void onMessage(T t);
}
