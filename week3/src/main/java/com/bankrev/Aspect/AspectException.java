package com.bankrev.Aspect;

import com.bankrev.exceptions.AccountNotFound;
import com.bankrev.exceptions.NotEnoughFundsException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectException {
    private Logger logger=org.slf4j.LoggerFactory.getLogger(AspectException.class);
    @AfterThrowing(pointcut = "execution(* com.bankrev.service.*.*(..))", throwing = "ex")
    public void AccountNotFound(AccountNotFound ex) {
        logger.info(ex.getMessage());
    }
    @AfterThrowing(pointcut = "execution(* com.bankrev.service.*.*(..))", throwing = "ex")
    public void NotEnoughFundsException(NotEnoughFundsException ex) {
        logger.info(ex.getMessage());
    }
}
