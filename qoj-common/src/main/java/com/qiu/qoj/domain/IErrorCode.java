package com.qiu.qoj.domain;

/**
 * 封装API的错误码
 */
public interface IErrorCode {
    int getCode();

    String getMessage();
}