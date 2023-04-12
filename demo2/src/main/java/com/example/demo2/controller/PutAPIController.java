package com.example.demo2.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.model.PostRequestDTO;
import com.example.demo2.model.PutRequestDTO;

@RestController
@RequestMapping("/api")
public class PutAPIController {

	// METHOD : PUT
	// http://localhost:8080/api/put1
	@PutMapping("/put1")
	public PostRequestDTO put(@RequestBody PostRequestDTO req) {
		System.out.println("req: " + req);
		return req;
	}
	
	// http://localhost:8080/api/put2
	@PutMapping("/put2")
	public PutRequestDTO put2(@RequestBody PutRequestDTO reqDTO) {
		System.out.println("reqDTO: " + reqDTO);
		return reqDTO;
	}
	
}
