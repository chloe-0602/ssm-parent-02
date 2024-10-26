package com.chloe.spring02aopstu.proxy;

import com.chloe.spring02aopstu.calculator.Calculator;

/**
 * ClassName: StaticProxyCalculator
 * Package: com.chloe.spring02aopstu.proxy
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 7:52
 * @Version 1.0
 */
public class StaticProxyCalculator implements Calculator {
    private Calculator target;
    public StaticProxyCalculator(Calculator target) {
        this.target = target;
    }
    @Override
    public int add(int a, int b) {
        System.out.println("[日志] 开始add方式...");
        int res = target.add(a, b);
        System.out.println("[日志] 结果为："+res);
        System.out.println("[日志] 结束add方式...");
        return res;
    }

    @Override
    public int sub(int a, int b) {
        return 0;
    }

    @Override
    public int mul(int a, int b) {
        return 0;
    }

    @Override
    public int div(int a, int b) {
        return 0;
    }
}
