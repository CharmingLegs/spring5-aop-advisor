package cn.fall.thee.charming.legs.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-01-31
 */

@Slf4j
public class MyAfterReturningAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("执行后置通知");
    }
}
