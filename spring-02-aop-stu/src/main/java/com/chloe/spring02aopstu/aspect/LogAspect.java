package com.chloe.spring02aopstu.aspect;

import com.chloe.spring02aopstu.utils.LogUtil;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: LogAspect
 * Package: com.chloe.spring02aopstu.aspect
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 9:43
 * @Version 1.0
 */
@Component
@Aspect
public class LogAspect {
    @Before("execution(* com..*.*(..))")
    public void beforeLog() {
        System.out.println("[日志 Aspect] 开始...");
    }

    @AfterReturning(value = "execution(* com..*.*(..))", returning = "res")
    public void afterLog(Object res) {
        System.out.println("[日志 Aspect] 结束...， 结果是： " + res);
    }

    @AfterThrowing(value = "execution(* com..*.*(..))", throwing = "e")
    public void exceptionLog(Exception e) {
        System.out.println("[日志 Aspect] 异常...， 异常信息是： " + e.getCause());
    }

    @After("execution(* com..*.*(..))")
    public void endLog() {
        System.out.println("[日志 Aspect] 结束...");
    }
}
