package com.example.demo9.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component // IoC 대상
public class AuthInterceptor implements HandlerInterceptor{

	// myInfo 이동시 세션 여부 확인 (Controller 들어가기 전에 인터셉트)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object user = session.getAttribute("user");
		System.out.println(user);
		if(user == null) {
			response.sendRedirect("/login-page");
			return false;
		}
		
		return true;
	}
}
