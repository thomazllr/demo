package com.thomazllr.demo.core.mapper;

public interface BaseRequestMapper<T, R> {

    T fromRequest(R request);

    R toRequest(T entity);
}
