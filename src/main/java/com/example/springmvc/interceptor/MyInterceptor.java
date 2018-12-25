package com.example.springmvc.interceptor;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 * @author: czw
 * @create: 2018-12-25 22:46
 **/
public class MyInterceptor extends HandlerInterceptorAdapter {//继承HandlerInterceptorAdapter实现自定义拦截器


    public MyInterceptor() {
    }

    /**
     * 请求前执行
     * @param request
     * @param response
     * @param handle
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handle){
        long start = System.currentTimeMillis();
        request.setAttribute("start",start);
        return true;
    }

    /**
     * 请求后执行
     * @param request
     * @param response
     * @param handle
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle, ModelAndView modelAndView){
        long end = System.currentTimeMillis();
        long start = (long) request.getAttribute("start");
        request.removeAttribute("start");
        String url = request.getRequestURI();
        System.out.println("本次请求url:"+url+",调用时间："+(end-start)+"ms");
    }
}
