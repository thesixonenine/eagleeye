package com.simple.eagleeye.licensingservice.config;


import com.simple.eagleeye.licensingservice.interceptor.SelfHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author simple
 * @version 1.0
 * @date 2018/10/23 10:33
 */
@Configuration
public class LicensingWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SelfHandlerInterceptor()).addPathPatterns("/**");
    }
}
