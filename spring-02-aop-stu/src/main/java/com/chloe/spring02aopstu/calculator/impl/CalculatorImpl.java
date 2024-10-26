package com.chloe.spring02aopstu.calculator.impl;

import com.chloe.spring02aopstu.calculator.Calculator;
import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorImpl
 * Package: com.chloe.spring02aopstu.calculator
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 7:38
 * @Version 1.0
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }
}
