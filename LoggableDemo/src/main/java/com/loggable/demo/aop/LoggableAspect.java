/**
 * 
 */
package com.loggable.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author rbhat
 *
 */
@Component
@Aspect
public class LoggableAspect {
	Logger log = LoggerFactory.getLogger(this.getClass());

	@Around("execution(* *(..)) && @annotation(Loggable)")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		log.info("#{} ({}): {} in {}msec", 
				MethodSignature.class.cast(point.getSignature()).getMethod().getName(),
				point.getArgs(), 
				result, 
				System.currentTimeMillis() - start);
		return result;
	}
}
