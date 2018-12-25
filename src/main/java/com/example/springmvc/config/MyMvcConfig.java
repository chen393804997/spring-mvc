package com.example.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.security.PublicKey;

/**
 *
 * @author: czw
 * @create: 2018-12-24 23:08
 **/
@EnableWebMvc//开启springmvc支持
@Configuration
@ComponentScan("com.example.springmvc")
public class MyMvcConfig {

    /**
     * 配置mvc中的view
     * @return
     */
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        //配置view的路径
        internalResourceViewResolver.setPrefix("/WEB-INF/classes/static.views/");
        //设置拼接的后缀
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setViewClass(JstlView.class);
        return internalResourceViewResolver;
    }

}
