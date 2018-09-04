package com.dmitry.profiles.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;

/**
 * @author du376ye
 *
 */
@Aspect
@Component
public class AuditAspect {
	private static Logger LOG = LogManager.getLogger(AuditAspect.class);

	/**
	 * @param joinPoint
	 * @param auditable
	 * @return
	 * @throws Throwable
	 */
	@Around("@annotation(auditable)")
	public Object auditMethod(ProceedingJoinPoint joinPoint, Auditable auditable) throws Throwable
	{
		final String _M = "auditMethod(): ";
		
		LOG.info("{} called. joinPoint = {}, auditable.value() = {}", _M, joinPoint, auditable.value());
		
		Logger log =  LogManager.getLogger(auditable.log());
		log.info("{}: started", auditable.value());
		Object retValue =  joinPoint.proceed();
		log.info("{}: ended", auditable.value());
		return(retValue);
	}
}
