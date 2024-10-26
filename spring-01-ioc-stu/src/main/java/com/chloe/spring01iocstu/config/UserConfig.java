package com.chloe.spring01iocstu.config;

import com.chloe.spring01iocstu.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: UserConfig
 * Package: com.chloe.spring01iocstu.config
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/25 22:45
 * @Version 1.0
 */
@Configuration
public class UserConfig {
    @Bean(initMethod = "initUser", destroyMethod = "destroyUser")
    public User user(){
        return new User();
    }
}
