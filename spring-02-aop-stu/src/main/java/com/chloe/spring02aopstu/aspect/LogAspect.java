package com.chloe.spring02aopstu.aspect;

import com.chloe.spring02aopstu.utils.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
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
    @Pointcut("execution(* com..*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeLog(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("[日志 Aspect] 开始..., 方法是："+ methodName+ "，参数是：" + Arrays.toString(args));
    }

    /**
     * 参数的顺序不能反，否则会不对，可能不会报错
     * @param joinPoint
     * @param res
     */
    @AfterReturning(value = "pointCut()", returning = "res")
    public void afterLog(JoinPoint joinPoint,Object res) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("[日志 Aspect] 结束...，方法是 "+methodName+" 结果是： " + res);
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void exceptionLog(Throwable e) {
        System.out.println("[日志 Aspect] 异常...， 异常信息是： " + e.getMessage());
    }

    @After("pointCut()")
    public void endLog(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        System.out.println("[日志 Aspect] 结束..., 方法是： " + methodName);
    }
}
