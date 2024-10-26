package com.chloe.spring02aopstu.aspect;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName: PointCutBean
 * Package: com.chloe.spring02aopstu.aspect
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 12:01
 * @Version 1.0
 */
@Component
public class PointCutBean {
    @Pointcut("execution(* com..*.*(..))")
    public void pointCut(){}
}
