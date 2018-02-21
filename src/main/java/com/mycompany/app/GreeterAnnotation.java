package com.mycompany.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class GreeterAnnotation {
	@Before("execution(* com.mycompany.app.Instrumentalist.*(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("Greetings in annotations!");
		
	}
}
