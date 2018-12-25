package com.example.springmvc.controller;

import com.example.springmvc.core.Result;
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
}