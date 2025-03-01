package com.thomazllr.demo.core.mapper;

public interface BaseResponseMapper<T, Q> {

    Q toResponse(T entity);

    T fromResponse(Q response);
}
