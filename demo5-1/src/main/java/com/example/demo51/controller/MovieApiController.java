package com.example.demo51.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo51.dto.Movie;

@RestController
@RequestMapping("/api")
public class MovieApiController {

	@PostMapping("/movie")
	public ResponseEntity<Movie> insertMovie(@Valid @RequestBody Movie movie){
		
		System.out.println(movie.toString());
		if(movie.getId() < 1) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(movie);
		}
		
		return ResponseEntity.ok(movie);
	}
	
}
