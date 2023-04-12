package com.example.demo5.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	@NotNull
	private String name;
	@Min(1)
	@Max(100)
	private int age;
	@Email(message = "이메일 형식 확인")
	private String email;
	@Size(min = 11, max = 13)
	private String phoneNumber;

}
