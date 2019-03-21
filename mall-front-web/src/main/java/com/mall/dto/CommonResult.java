package com.mall.dto;

import com.alibaba.fastjson.JSONObject;

public class CommonResult {

    private static final int SUCCESS_CODE = 200;

    private int code;

    private String message;

    private Object data;

    public CommonResult success(Object data) {
        this.code = SUCCESS_CODE;
        this.message = "操作成功。";
        this.data = data;
        return this;
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

