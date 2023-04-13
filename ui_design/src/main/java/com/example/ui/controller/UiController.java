package com.example.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UiController {
	
	@GetMapping("/ui")
	public String showUi() {
		return "ui";
	}

}
