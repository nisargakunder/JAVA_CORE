package com.bankrev.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLoggable {
    @Around("@annotation(com.bankrev.Aspect.Loggable)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
        logger.info("Executing method: {}", joinPoint.getSignature().getName());
        long startTime = System.currentTimeMillis();
        Object result=joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        logger.info("***************************");
        logger.info("Execution time: {} ms", endTime - startTime);
        return result;

    }


}
