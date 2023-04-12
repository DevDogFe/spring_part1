package com.example.demo51.dto;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	private int id;
	private String title;
	private String director;
	@Email
	private String directorEmail;
}
