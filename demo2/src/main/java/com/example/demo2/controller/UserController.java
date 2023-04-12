package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/info")
	public void info() {
		System.out.println("method = get");
	}
	
	@PostMapping("/info")
	public void info2() {
		System.out.println("method = post");
	}
	
	@PutMapping("/info")
	public void info3() {
		System.out.println("method = put");
	}
	
	@DeleteMapping("/info")
	public void info4() {
		System.out.println("method = delete");
	}
	
}
