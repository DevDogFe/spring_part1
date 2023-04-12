package com.example.demo5.controller;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;

import lombok.Builder;

@RestController
@Validated // GET 방식일 때 반드시 선언해주어야 유효성 검사를 시작한다.
public class UserController {

	// GET 방식일 때 파라미터 앞에 어떤 유효성 검사를 할지 지정해주어야한다.
	
	// http://localhost:8080/user?name=홍&age=10
	// Get 방식 valid 처리
	@GetMapping("/user")
	public User user(@Size(min=2) @RequestParam String name, @NotNull @Min(1) @RequestParam Integer age) {
		User user = new User();
		user.setAge(age);
		user.setName(name);
		
		return user;
	}
	// object mapper
	@GetMapping("/user2")
	public User user2(@Validated User user) {
		
		return user;
	}
	
	// Get방식 유효성 검사 직접 만들기
	@GetMapping("/userEx")
	public User userEx(@NotNull @RequestParam String name, @Min(1) @Max(100) @RequestParam Integer age, @Email @RequestParam String email, @Size(min = 11, max = 13) @RequestParam String phoneNumber) {
		User user = User.builder().age(age).name(name).email(email).phoneNumber(phoneNumber).build();
		
		
		return user;
	}
}
