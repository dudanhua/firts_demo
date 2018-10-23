package com.dudanhua.firstdemo.exception;

import com.dudanhua.firstdemo.Constants.Constant;

public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(Constant constant) {
        super(constant.getMsg());
        this.code = constant.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
