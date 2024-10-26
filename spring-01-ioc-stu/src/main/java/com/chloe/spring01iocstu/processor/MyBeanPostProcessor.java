package com.chloe.spring01iocstu.processor;

import com.chloe.spring01iocstu.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * ClassName: MyBeanPostProcessor
 * Package: com.chloe.spring01iocstu.processor
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/25 23:04
 * @Version 1.0
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【postProcess Before Initialization】："+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【postProcess After Initialization】："+beanName);
        if(bean instanceof User user){
            user.setUsername("张三");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
