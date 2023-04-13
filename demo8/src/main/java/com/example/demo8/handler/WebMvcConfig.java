package com.example.demo8.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * 1. WebMvcConfigurer
 * 2. addInterceptors() 구현
 * */
@Configuration // 1개 이상 BEAN 등록 해야할 때
public class WebMvcConfig implements WebMvcConfigurer {

	// DI 사용하기
	@Autowired // SpringContainer에 있으면 가져	옴
	private LoggingInterceptor loggingInterceptor;
	
//	public WebMvcConfig(LoggingInterceptor loggingInterceptor) {
//		this.loggingInterceptor = loggingInterceptor;
//	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(loggingInterceptor);
	}
}
