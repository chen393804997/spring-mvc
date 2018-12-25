package com.example.springmvc.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * 拦截器配置
 * @author: czw
 * @create: 2018-12-25 22:56
 **/
@Configuration
public class InterceptConfigurer extends WebMvcConfigurerAdapter {
    /**
     * 添加拦截器 并设置拦截路径
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
