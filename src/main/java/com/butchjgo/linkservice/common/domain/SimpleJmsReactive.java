package com.butchjgo.linkservice.common.domain;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;
public class SimpleJmsReactive implements JmsReactive<RequestData>  {
    @Override
    public void sendTo(String chanel, String msg) {

    }

    @Override
    public void onSubscribe(Subscription subscription) {

    }

    @Override
    public void onNext(Object item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
