package com.chloe.spring02aopstu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * ClassName: AroundAspect
 * Package: com.chloe.spring02aopstu.aspect
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 14:12
 * @Version 1.0
 */
@Component
@Aspect
public class AroundAspect {
    @Around("com.chloe.spring02aopstu.aspect.PointCutBean.pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        Object[] args = joinPoint.getArgs();
        Object res = null;
        try {
            System.out.println("[Around Aspect] 开始..., 方法是："+ methodName+ "，参数是：" + Arrays.toString(args));
             res = joinPoint.proceed();
            System.out.println("[Around Aspect] 正常返回，结果是： " + res);
        } catch (Throwable e) {
            System.out.println("[Around Aspect] 异常返回，异常是： " + e);
            throw new RuntimeException(e);
        } finally {
            System.out.println("[Around Aspect] 结束..., 方法是： " + methodName);
        }

        return res;
    }
}
