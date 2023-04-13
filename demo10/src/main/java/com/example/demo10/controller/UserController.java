package com.example.demo10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo10.dto.User;

@Controller
public class UserController {
	
	@GetMapping("/loginPage")
	public String loginPage() {
		return "/login.html"; // 내부에서 이동
	}
	
	@GetMapping("/auth/infoPage")
	public String infoPage(HttpServletRequest request) {
//		HttpSession session = request.getSession();
//		Object principal = session.getAttribute("principal");
//		if(principal == null) {
//			return "redirect:/loginPage";
//		}
		return "/info.html";
	}
	
	@PostMapping("/loginProc")
	public String loginProc(HttpServletRequest request, User user) {
		HttpSession session = request.getSession();
		session.setAttribute("principal", user);
		
		return "redirect:/auth/infoPage";
	}
}
