package com.example.demo9.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Autowired
	private AuthInterceptor authInterceptor;
	
	
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// authInterceptor 동작 시킬 때 특정 주소에서만 동작하도록 하기
		registry.addInterceptor(authInterceptor).addPathPatterns("/mypage/**");
	}

}
