package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PostReqDTO;
import com.example.demo.model.UserRequest;

@RestController
@RequestMapping("/api2")
public class PostAPIController {
	
	// 클라이언트에서 어떤 값을 보낼지 이미 알고있다.
	// method: POST
	// 시작줄: http://localhost:8080/api2/post1
	// 클라이언트에서는 데이터를 json 형식으로 보낼 예정
	@PostMapping("/post1")
	public void post1(@RequestBody Map<String, Object> reqData) {
		reqData.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " / " + e.getValue());
		});
	}
	
	// DTO 맵핑 + Json 형식으로 응답처리
	@PostMapping("/post2")
	public PostReqDTO post2(@RequestBody PostReqDTO postReqDTO) {
		System.out.println(postReqDTO.toString());
		return postReqDTO;
	}
	
	
}
