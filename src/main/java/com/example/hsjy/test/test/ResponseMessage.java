package com.example.hsjy.test.test;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * Created with idea
 * Date: 2017/10/23 0023
 * Time: 16:14
 *
 * @author lvdong
 */

public class ResponseMessage<T> extends BaseResponse {

    protected T data;

    private Long timestamp;

    private boolean success;


    public T getData() {
        return data;
    }


    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public static <T> ResponseMessage<T> error(String message) {
        return error(500, message);
    }

    public static <T> ResponseMessage<T> error(int status, String message) {
        ResponseMessage<T> msg = new ResponseMessage<>();
        msg.message = message;
        msg.status(status);
        msg.success = false;
        return msg.putTimeStamp();
    }

    public ResponseMessage<T> status(int status) {
        this.status = status;
        return this;
    }

    public ResponseMessage<T> data(T data) {
        this.data = data;
        return this;
    }

    private ResponseMessage<T> putTimeStamp() {
        this.timestamp = System.currentTimeMillis();
        return this;
    }

    public ResponseMessage<T> success(boolean success) {
        this.success = success;
        return this;
    }

    public static <T> ResponseMessage<T> ok(T result) {
        return new ResponseMessage<T>()
                .data(result)
                .success(true)
                .putTimeStamp()
                .status(200);
    }
}
