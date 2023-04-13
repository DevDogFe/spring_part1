package com.example.demo5.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.dto.User;

@RestController
@RequestMapping("/api") 
public class APIController {
	
	

	// http://localhost:8080/api/user
	@PostMapping("/user")
	public ResponseEntity<User> user(@RequestBody User user) {
		// 스프링 부트 데이터 요청시 기본 파싱 key = value 구조
		// dto <- object mapper가 파싱해줌
		// 유효성 검사 - 예전 방식
		if (user.getAge() < 1 || user.getAge() > 100) {
			// 잘못된 입력값 확인
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
		}
		
		// service -> DAO -> DB insert
		// 정방향 -> 역방향
		System.out.println(user.toString());
		
		return ResponseEntity.ok(user);
	}
	
	// 두번째 연습
	// AOP 기반 Validation 활용
	// 1. GET 방식일 때 사용방법, POST 방식일 때 사용법이 약간 다르다.
	// 2. valid 선언 해줘야한다.
	@PostMapping("/user2")
	public ResponseEntity<User> user2(@Valid @RequestBody User user){
		// 관점 지향 패러다임 추가
		// AOP 기반의 valid 라이브러리 활용하면 공통적으로 들어가야 하는 부분에 코드를 분리시킬 수 있다.
		return ResponseEntity.ok(user);
	}
	
	// 와일드카드 ? 사용
	@PostMapping("/user3")
	public ResponseEntity<?> user3(@Valid @RequestBody User user, BindingResult bindingResult){
		
		// bindingResult 클래스 사용
		// bindingResult가 @valid에 대한 결과값을 가지고 있음
		if(bindingResult.hasErrors()) {
			// 에러 발생
			// 필드 - 어떤필드에서 에러가 발생했는지
			// 메세지 - 내용 반환 처리
			StringBuilder sb = new StringBuilder();
			bindingResult.getAllErrors().stream().forEach(e -> {
				System.out.println(e.getCode());
				System.out.println(e.getDefaultMessage());
				System.out.println(e.getArguments());
				System.out.println(e.getObjectName());
				sb.append("field: " + e.getCode());
				sb.append("\nmessage: " + e.getDefaultMessage() + "\n");
			});
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb.toString());
		}
		// 정상 처리
		
		return ResponseEntity.ok(user);
	}

}
