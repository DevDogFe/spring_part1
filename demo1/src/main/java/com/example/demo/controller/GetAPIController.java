package com.example.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserRequest;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// @Controller: 화면을 응답(html(jsp))
@RestController // @RestController: JSON 방식으로 응답 처리
@RequestMapping("/api")
public class GetAPIController {
	private String str;
	
	// 주소 설계 - GET방식, 패스 배리어블
	// http://localhost:8080/api/hello
	@GetMapping("/hello")
	public String getHello() {
		str = "hello";
		return str;
	};
	
	// 쿼리 파라미터 방식
	// http://localhost:8080/api/queryParam1?name=홍아
	@GetMapping("/queryParam1")
	public String queryParam1(@RequestParam String name) {
		return "name: " + name;
	}
	
	
	// 쿼리 스트링 방식으로 주소설계했다면 요청시에 정확히 설계대로 요청해야 한다.
	// 하지만 선택적 요소로도 만들 수 있다.
	// http://localhost:8080/api/queryParam2?name=홍아&age=10
	// http://localhost:8080/api/queryParam2?name=홍아 <- 매개변수를 다 받지 못하면 에러
	@GetMapping("/queryParam2")
	public String queryParam2(@RequestParam String name, @RequestParam(required = false, defaultValue = "0") int age) {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		return "name, age: " + name + ", " + age;
	}
	
	// http://localhost:8080/api/queryParam3?name=홍아&age=10&groupId=com.tenco
	@GetMapping("/queryParam3")
	public String queryParam3(@RequestParam Map<String, String> data) {
		StringBuilder sb = new StringBuilder();
		data.entrySet().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
			sb.append(entry.getKey() + "=" + entry.getValue() + "\n");
		});
		return "map 방식 파싱: " + sb ;
	}
	
	// 직접 설계하기
	// http://localhost:8080/api/queryParam3?name=홍아&age=10&groupId=com.tenco&address=부산시
	@GetMapping("/queryParamEx")
	public String queryParamEx(@RequestParam Map<String, String> data) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		data.entrySet().forEach(s -> {
			sb.append("\"" + s.getKey() + "\":\""+s.getValue()+"\",");
		});
		sb.delete(sb.length() - 1, sb.length());
		sb.append("}");
		return sb + "";
	}
	
	// DTO 방식
	// http://localhost:8080/api/queryParam2?name=홍아&age=10&email=a@naver.com
	// MessageConverter가 자동 파싱 처리해줌
	// DTO방식에서는 @RequestParam 필요없음
	// DTO의 속성값이 없으면 파싱하지 않는다.
	@GetMapping("/queryParam4")
	public String queryParam4(UserRequest userDTO) {
		System.out.println("dto방식 동작 처리");
		System.out.println(userDTO.getName());
		System.out.println(userDTO.getAge());
		System.out.println(userDTO.getEmail());
		return userDTO.toString();
	}
	
	// pathVariable 방식
	// http://localhost:8080/api/path-variable1/10
	@GetMapping("/path-variable1/{userId}")
	public String pathVariable1(@PathVariable int userId) {
		System.out.println(userId);
		return "userId: " + userId;
	}
	
	// 변수명을 똑같이 사용하지 못할 때 옵션값을 지정할 수 있다.
	// http://localhost:8080/api/path-variable2/홍길동
	@GetMapping("/path-variable2/{name}")
	public String pathVariable2(@PathVariable(name = "name") String mName) {
		String name = "내부에 name 변수명이 있을 때";
		return "name: " + mName;
	}
	
	// http://localhost:8080/api/users/1/orders/1
	@GetMapping("/users/{userId}/orders/{orderId}")
	public String getOrder(@PathVariable int userId, @PathVariable int orderId) {
		return "userId: " + userId + "/orderId: " + orderId;
	}
	
	// dto 사용
	// http://localhost:8080/api/name/흥아
	// DTO맵핑은 @PathVariable 선언 없이 사용
	// DTO안의 맵핑할 변수와 키값이 같아야한다.
	@GetMapping("/name/{name}")
	public UserRequest getUser(UserRequest dto) {
		UserRequest userRequest = new UserRequest();
		userRequest.setName(dto.getName());
		return userRequest;
	}
	
}
