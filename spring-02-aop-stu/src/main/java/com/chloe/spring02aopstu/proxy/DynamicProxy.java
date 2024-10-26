package com.chloe.spring02aopstu.proxy;

import com.chloe.spring02aopstu.utils.LogUtil;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * ClassName: DynamicProxy
 * Package: com.chloe.spring02aopstu.proxy
 * Description:
 * 目标对象需要有接口
 * 没有接口 会报错
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 8:00
 * @Version 1.0
 */
public class DynamicProxy {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getDynamicProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    LogUtil.start(method.getName(), args);
                    Object res = null;
                    try {
                        res = method.invoke(target, args);
                        LogUtil.returnLog(method.getName(), res);
                    } catch (Exception e) {
                        LogUtil.exceptionLog(method.getName(), e);
                    } finally {
                        LogUtil.endLog(method.getName());
                    }
                    return res;
                }
        );
    }
}
