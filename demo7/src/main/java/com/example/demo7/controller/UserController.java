package com.example.demo7.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	// http://localhost:8080/user
	@GetMapping({"/", "user"})
	public String userPage(Model model) {
		model.addAttribute("principal", "헬로우~~");
		return "user";
	}
}
