package com.example.springmvc.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author: czw
 * @create: 2018-12-24 23:15
 **/
public class WebInitializer implements WebApplicationInitializer {//WebApplicationInitializer用来代替web.xml
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        //注册视图配置类
        context.register(MyMvcConfig.class);
        //新建webapplicationcontext，注册配置类，将和当前的servletContext关联
        context.setServletContext(servletContext);
        //注册springmvc中的dispatcher
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher",new DispatcherServlet(context));
        //添加拦截路径
        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
    }
}
