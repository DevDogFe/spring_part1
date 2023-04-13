package com.example.demo10.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

// /auth/**로 요청한 주소에만 동작
@Component
public class AuthIntercepter implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		// 세션 여부 확인
		HttpSession session = request.getSession();
		Object principal = session.getAttribute("principal");
		if(principal == null) {
			System.out.println("인증안된 사용자");
			response.sendRedirect("/loginPage");
			return false;
		}
		
		return true;
	}

}