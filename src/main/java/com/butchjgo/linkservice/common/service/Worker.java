package com.butchjgo.linkservice.common.service;

public interface Worker<I,O> {
    O process(I i);
}
