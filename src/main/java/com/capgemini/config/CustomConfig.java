package com.capgemini.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.capgemini.interceptor.MyCustomInterceptor;

@Component
public class CustomConfig extends WebMvcConfigurerAdapter {
	@Autowired
	MyCustomInterceptor myCustomInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myCustomInterceptor);
	}

}
