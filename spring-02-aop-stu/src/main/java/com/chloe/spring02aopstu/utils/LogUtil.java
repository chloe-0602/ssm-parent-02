package com.chloe.spring02aopstu.utils;

import java.util.Arrays;

/**
 * ClassName: LogUtil
 * Package: com.chloe.spring02aopstu.utils
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 9:33
 * @Version 1.0
 */
public class LogUtil {
    public static void start(String methodName, Object... args){
        System.out.println("[日志 logUtil] 开始..." + methodName + "方法" + "， 参数： " + Arrays.toString(args));
    }


    public static void returnLog(String name, Object res) {
        System.out.println("[日志 logUtil] 结束..." + name + "方法" + "， 返回结果： " + res);
    }


    public static void endLog(String name) {

        System.out.println("[日志 logUtil] 结束..." + name + "方法");
    }

    public static void exceptionLog(String name, Exception e) {
        System.out.println("[日志 logUtil] 异常..." + name + "方法" + "， 异常信息： " + e.getMessage());
    }
}
