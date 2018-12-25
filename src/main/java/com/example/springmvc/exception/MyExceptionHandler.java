package com.example.springmvc.exception;

import com.example.springmvc.common.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 自定义异常拦截
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = ResultException.class)//全局异常捕捉处理
    @ResponseBody
    public Result<Map<String,String>> resultExceptionHandler(HttpServletRequest req, Exception ex) throws Exception {
        ResultException exception;
        if (ex instanceof ResultException) {
            exception = (ResultException) ex;
        }else {
            exception = (ResultException)ex.getCause();
        }
        Map<String,String> object = new HashMap<>(4);
        object.put("code",exception.getCode());
        object.put("message",exception.getMessage());
        return new Result<>(true, object);
    }
}
