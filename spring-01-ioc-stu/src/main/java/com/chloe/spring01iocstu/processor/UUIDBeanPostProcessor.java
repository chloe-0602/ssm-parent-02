package com.chloe.spring01iocstu.processor;

import com.chloe.spring01iocstu.anno.UUID;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * ClassName: UUIDBeanPostProcessor
 * Package: com.chloe.spring01iocstu.processor
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:28
 * @Version 1.0
 */
@Component
public class UUIDBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (Field field : bean.getClass().getFields()) {
            if(field.isAnnotationPresent(UUID.class) && field.getType().equals(String.class)){
                field.setAccessible(true);
                try {
                    field.set(bean,java.util.UUID.randomUUID().toString());
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return bean;
    }
}
