package com.example.demo6.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo6.dto.CustomError;

@RestControllerAdvice // IoC 대상 지정, RestController 예외 처리
public class GlobalControllerAdvice {

	// 모든 예외를 처리하고싶다면
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception e) {
		
		System.out.println("==========");
		System.out.println(e.getClass());
		System.out.println(e.getMessage());
		System.out.println("==========");
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
	}
	
	// 특정 예외를 다르게 처리하고 싶다면
	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
		
		List<CustomError> errorlist = new ArrayList<>();
		e.getAllErrors().forEach(error->{
			String field = error.getCode();
			String message = error.getDefaultMessage();
			CustomError customError = new CustomError();
			customError.setField(field);
			customError.setMessage(message);
			errorlist.add(customError);
		});
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorlist);
	}

	
	@ExceptionHandler(value = HttpMessageNotReadableException.class)
	public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException e) {
		
		System.out.println("************");
		System.out.println("제이슨 형식 아님");
		System.out.println(e.getMessage());
		System.out.println("************");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
	}
	
	@ExceptionHandler(value = BindException.class)
	public ResponseEntity<?> bindException(BindException e) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println("************");
		System.out.println("겟할때 입력 잘못함");
		sb.append("에러난 이유: " + e.getCause() + " / 상태: " + e.getTarget());
		e.getAllErrors().forEach(error -> {
			System.out.println(error.getCode());
			System.out.println(error.getDefaultMessage());
			sb.append(" / 요구조건: " + error.getCode() + " / 세부요청: " + error.getDefaultMessage());
		});
		
		System.out.println("************");
		
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb);
	}
	
	

}
 