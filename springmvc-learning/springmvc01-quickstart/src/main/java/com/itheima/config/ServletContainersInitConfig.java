package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author: Song Laixiong
 * @Create: 2024-10-23
 * @Description:
 */

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    //加载 SpringMvc 配置类
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //初始化 WebApplicationContext 对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置哪些请求归属 SpringMvc 处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //加载 Spring 配置类
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
