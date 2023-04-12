package com.example.demo3.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.dto.Movie;
import com.example.demo3.dto.User;

@RestController
@RequestMapping("/api")
public class APIController {
	
	// http://localhost:80/api/hello
	// http://localhost/api/hello port를 80으로 세팅하면 생략가능
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	// MIME TYPE: text/plain
	// http://localhost/api/text
	@GetMapping("/text")
	public String text() {
		
		return "text/plain";
	}
	
	// json 형식으로 내려주기
	// localhost/api/json
	@PostMapping("/json")
	public User json(@RequestBody User user) {
		System.out.println(user.toString());
		return user;
	}
	
	@PutMapping("/put")
	public ResponseEntity<User> put(@RequestBody User user){
		System.out.println(user.toString());
		// http 메세지 코드 200 직접 세팅 OK -> 200, CREATED -> 201
		// http 메세지 body 데이터를 --> user object
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	/*
	 * 벡엔드 개발자 위치
	 * 클라이언트(모바일) --> request(http통신)
	 * 데이터로 리턴 (json)
	 * 매번 새로운 요청마다 다른 형식으로 리턴을 해주면 api도 그에 맞춰 계속 개발해야함
	 * 일괄적인 형식을 만들어서 리턴하면 api 개발에 편함
	 * */
	@PutMapping("/put2")
	public ResponseEntity<String> put2(@RequestBody User user){
		// 정상적인 값이 들어왔는지 확인, 인증된 사용자인지 확인
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		// 201 -> C/U
		return new ResponseEntity<>(user.toString(), headers, HttpStatus.CREATED);
	}
	
	@PostMapping("/movie")
	public ResponseEntity<String> insertMovie(@RequestBody Movie movie){
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.TEXT_PLAIN);
		
		return new ResponseEntity<>(movie.toString(), headers, HttpStatus.CREATED);
	}
}
