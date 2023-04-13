package com.example.demo6.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.dto.User;

@RestController
@RequestMapping("/api")
@Validated
public class ApiController {
	
	@GetMapping("/test")
	public String test() {
		System.out.println("asasdasd");
		return "TEST";
	}

	// http://localhost:8080/api/user?name=?&age=?
	@GetMapping("/user")
	public User get(@NotEmpty @Size(min=1, max=10) @RequestParam String name, @NotNull @Min(1) @RequestParam Integer age) {
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		
		return user;
	}
	
	// http body 데이터 전달 방식
	// 1. json 형식으로 서버로 전달 (@ReauestBody 선언)
	// 2. form 태그 활용 key=value (어노테이션 선언 x)
	@PostMapping("/user")
	public User post(@Valid @RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}
	
	@GetMapping("/user2")
	public User get2(@Validated User reqUser) {
		
		return reqUser;
	}
	
}
