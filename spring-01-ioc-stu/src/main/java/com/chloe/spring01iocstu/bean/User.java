package com.chloe.spring01iocstu.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ClassName: User
 * Package: com.chloe.spring01iocstu.bean
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/25 22:43
 * @Version 1.0
 */
@Data
    public class User implements InitializingBean, DisposableBean {
    private String username;
    private String password;

    public User() {
        System.out.println("User ====> 构造器" );
    }

    @Autowired
    public void setCat(Cat cat){
        System.out.println("User ====> setter 自动注入：属性值："+cat);
    }

    public void initUser() {
        System.out.println("User ====> @Bean initMethod ...initUser" );
    }

    public void destroyUser() {
        System.out.println("User ====> @Bean destroyMethod ...destroyUser" );
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("User ====> InitializingBean afterPropertiesSet...init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("User ====> DisposableBean destroy...destroy");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("User ====> @PostConstruct postConstruct...init");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("User ====> @PreDestroy preDestroy...destroy");
    }
}
