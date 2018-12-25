package com.example.springmvc.controller;

import com.example.springmvc.common.Result;
import com.example.springmvc.exception.ResultException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping("/get")
    public String get(){
        return "index";
    }

    @RequestMapping("/getException")
    @ResponseBody
    public Result getException() throws Exception {
        throw new ResultException("1","异常");
    }

    @RequestMapping(value = "/getString",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getString(){
        return "成功";
    }
}
