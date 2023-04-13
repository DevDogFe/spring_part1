package com.example.demo9.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo9.dto.User;

@Controller
public class UserController {
	
	// 1. 로그인 페이지를 직접 URL로 요청해서 응답 받을 수 있다. (사전 지식)
	// 2. 로그인 페이지를 controller를 타서 응답처리해보자.
	@GetMapping("/login-page")
	public String login() {
		
		return "login.html";
	}
	
	@GetMapping("/mypage/myinfo")
	public String myinfo() {
		return "/mypage/myinfo.html";
	}
	
	@GetMapping("/mypage/cart")
	public String cart() {
		return "/mypage/cart.html";
	}
	
	@PostMapping("/login-proc")
	public String loginProc(HttpServletRequest request, HttpServletResponse response, User user) {
		HttpSession session = request.getSession();
		System.out.println(user.toString());
		session.setAttribute("user", user);
		
		return "redirect:mypage/myinfo";
	}
}
