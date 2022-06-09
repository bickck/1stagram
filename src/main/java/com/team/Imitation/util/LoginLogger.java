package com.team.Imitation.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginLogger {

	private static Logger logger = LoggerFactory.getLogger(LoginLogger.class);

	@Pointcut("execution(* com.team.Imitation.controller.*(..)")
	public void logger() {
	}

	@Around("logger()")
	public Object loginLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		logger.info("Access => {} ", joinPoint.getTarget());
		return joinPoint.proceed();
	}
}
