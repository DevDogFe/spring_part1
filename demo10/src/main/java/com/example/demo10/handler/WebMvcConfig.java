package com.example.demo10.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	
	@Autowired //DI 적용
	AuthIntercepter authIntercepter;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(authIntercepter).addPathPatterns("/auth/**");
	}
	
}
