package com.court.jee.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 配置自定义拦截器
 * @Description:
 * @Author:hkw
 * @Date: Created in 17:41 2017/11/13
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
                           registry.addInterceptor(myInterceptor).addPathPatterns("/*").excludePathPatterns("/static/**");
        super.addInterceptors(registry);
    }
}