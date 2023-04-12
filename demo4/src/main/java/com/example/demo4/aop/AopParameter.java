package com.example.demo4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo4.dto.User;

@Aspect // 관점지향 클래스로 설계
@Component // IoC 관리 대상으로 설계
public class AopParameter {

	// 포인트 컷
	// role 설정
	// excution 표현식

	@Pointcut("execution(* com.example.demo4.controller..*.*(..))")
	private void cut() {
	}

	// cut() method가 실행되는 지점 이전에 before()메서드를 실행
	@Before("cut()")
	public void before(JoinPoint joinPoint) {

		// 활용
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("before()");
		System.out.println("사용된 method 확인");
		System.out.println(method.getName());

		Object[] args = joinPoint.getArgs();

		// 매개변수 출력
		for (Object obj : args) {
			System.out.println("type: " + obj.getClass().getSimpleName());
			System.out.println("value: " + obj);
		}

		// controller -> /api/get 호출하기전에 수행되는 메서드
		// 어떤 메서드가 수행되었는지 알아보는 방법
	}

	@AfterReturning(value = "cut()", returning = "obj")
	public void afterReturn(JoinPoint joinPoint, Object obj) {
		System.out.println("=====================");
		System.out.println("returnObj");
		System.out.println("obj: " + obj);

	}

}
