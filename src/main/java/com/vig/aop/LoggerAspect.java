package com.vig.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {

	public static final Logger logger = LogManager.getLogger(LoggerAspect.class); 

	//@Around("execution(* com.board..controller.*Controller.*(..)) or execution(* com.board..service.*Impl.*(..)) or execution(* com.board..mapper.*Mapper.*(..))")
	@Around("execution(* com.vig.controller.*Controller.get*(..))")
	public Object printLog(ProceedingJoinPoint joinPoint) throws Throwable {
		
		
		//가지고온 joinPoint의 타입이름을 갖고온다 -> 여기서는 컨트롤러 이름
		String name = joinPoint.getSignature().getDeclaringTypeName();
		
		//전달되는 메소드의 파라미터를 담는다.
		Object[] parms = joinPoint.getArgs();		
		
		long startTime = System.currentTimeMillis();
		
		//Around로 가져온 프로세스가 실행된다.
		Object ret = joinPoint.proceed();
		
		// 메소드가 실행될때 까지 걸리는 실행시간 측정
		long time = System.currentTimeMillis() - startTime;
	
		
		logger.info(name + "." + joinPoint.getSignature().getName() + "() " + "WorkTime : "+ (time/1000.0f));
	
		if(parms != null ) {
			for(Object t : parms) {
				logger.info("ParameterType :" + t.getClass().getName());
			}
		}

		
		return ret;
	}
}