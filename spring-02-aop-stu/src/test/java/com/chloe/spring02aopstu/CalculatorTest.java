package com.chloe.spring02aopstu;

import com.chloe.spring02aopstu.calculator.Calculator;
import com.chloe.spring02aopstu.calculator.impl.CalculatorImpl;
import com.chloe.spring02aopstu.proxy.DynamicProxy;
import com.chloe.spring02aopstu.proxy.StaticProxyCalculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ClassName: CalculatorTest
 * Package: com.chloe.spring02aopstu
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 7:49
 * @Version 1.0
 */

public class CalculatorTest {

    @Test
    public void test4(){
        Calculator calculator = new CalculatorImpl();

        Calculator proxyInstance = (Calculator) new DynamicProxy(calculator).getDynamicProxyInstance();
        proxyInstance.add(10,20);
    }

    @Test
    public void test03(){
        Calculator calculator = new CalculatorImpl();

        Calculator proxyInstance = (Calculator) new DynamicProxy(calculator).getDynamicProxyInstance();
        proxyInstance.add(3, 4);
    }

    @Test
    public void test02(){
        Calculator calculator = new CalculatorImpl();

        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invocationHandler 执行了...");
                Object res = method.invoke(calculator, args);
                System.out.println("invocationHandler 返回值是..." + res);
                return res;
            }
        };
        Calculator proxyInstance = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(),
                calculator.getClass().getInterfaces(),
                invocationHandler
        );

        proxyInstance.add(1,2);
    }
    @Test
    public void test01(){
        Calculator calculator = new CalculatorImpl();
        new StaticProxyCalculator(calculator).add(1,2);
    }
}
