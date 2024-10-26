package com.chloe.spring01iocstu.config;

import com.chloe.spring01iocstu.anno.UUID;
import com.chloe.spring01iocstu.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: DogConfig
 * Package: com.chloe.spring01iocstu.config
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:32
 * @Version 1.0
 */
@Configuration
public class DogConfig {
    @Bean

    public Dog dog()
    {
        return new Dog();
    }
}
