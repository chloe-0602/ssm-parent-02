package com.chloe.spring01iocstu;

import com.chloe.spring01iocstu.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring01IocStuApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Spring01IocStuApplication.class, args);
        System.out.println("=========== ioc容器创建完成... ==========");

        User user = ioc.getBean(User.class);
        System.out.println("user = " + user);
    }

}
