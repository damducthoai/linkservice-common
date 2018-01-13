package com.butchjgo.linkservice.common.domain;

import java.util.concurrent.Flow;

public interface JmsReactive<T> extends Flow.Subscriber {
    void sendTo(String chanel, String msg);
}