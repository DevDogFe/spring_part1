package com.time.killer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	
	private Integer id;
	@NotBlank
	@Size(min=4, max=20)
	private String username;
	@NotBlank
	@Size(min=6, max=15)
	private String pwd;
	@NotBlank
	@Size(min=1, max=10)
	private String nickname;
	@Email
	private String email;
	
}
