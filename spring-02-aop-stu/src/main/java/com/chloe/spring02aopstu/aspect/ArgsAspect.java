package com.chloe.spring02aopstu.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * ClassName: ArgsAspect
 * Package: com.chloe.spring02aopstu.aspect
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:49
 * @Version 1.0
 */
@Component
//@Aspect
public class ArgsAspect {
    @Before("args(java.lang.Integer, java.lang.Integer)")
    public void myBefore(){

        System.out.println("[args aspect] - myBefore");
    }
}
