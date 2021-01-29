package com.fzt.bootdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfigure implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyInteceptor()).addPathPatterns("/**");
    }
}
