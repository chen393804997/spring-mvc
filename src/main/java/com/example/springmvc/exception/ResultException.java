package com.example.springmvc.exception;

import java.io.Serializable;

public class ResultException extends Exception implements Serializable {
    /**
     * 错误代码
     */
    private String code;
    /**
     * 错误信息
     */
    private String message;

    public ResultException(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
