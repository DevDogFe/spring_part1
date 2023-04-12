package com.example.demo2.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
@RestController
@RequestMapping("/api2")
public class DeleteAPIController {

	// METHOD: delete
	// http://localhost:8080/api2/delete/userId?account=우리은행
	@DeleteMapping("/delete/{userId}")
	public void delete(@PathVariable String userId, @RequestParam String account) {
		System.out.println("userId: " + userId);
		System.out.println("account: " + account);
	}
	
	// http://localhost:8080/api2/movie/2?title=살인의추억&director=봉준호
	@DeleteMapping("movie/{id}")
	public void deleteMovie(@PathVariable int id, @RequestParam String title, @RequestParam String director) {
		System.out.println(id + "/" + title + "-" + director );
	}
	
	
	
} // end of class
