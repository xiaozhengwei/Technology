package com.utunan.common.domain.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 统一请求返回结果
 *
 * @author xiaozhengwei
 * @since V1.0.0
 */
@Data
public class ResponseResult<T> implements Serializable {

    protected T data;
    private Integer code;
    private String msg;

    private ResponseResult() {
    }

    private ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult<T> newInstance(int code, String msg, T data) {
        System.out.println(ResponseCode.SUCCESS);
        return new ResponseResult<>(code, msg, data);
    }

    public static class ResponseCode {
        public static final int SUCCESS = 200;
        public static final int FAIL = 300;
    }

}

