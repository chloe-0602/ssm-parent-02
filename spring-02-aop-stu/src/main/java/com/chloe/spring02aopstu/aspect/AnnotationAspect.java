package com.chloe.spring02aopstu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClassName: AnnotationAspect
 * Package: com.chloe.spring02aopstu.aspect
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:53
 * @Version 1.0
 */
@Component
//@Aspect
public class AnnotationAspect {
    @Before("@annotation(com.chloe.spring02aopstu.anno.MyAnno)")
    public void before() {
        System.out.println("[@annotation aspect] - myBefore");
    }
}
