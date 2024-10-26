package com.chloe.spring01iocstu.bean;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * ClassName: Cat
 * Package: com.chloe.spring01iocstu.bean
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/25 22:57
 * @Version 1.0
 */
@Component
@Data
public class Cat {
    private String name;
}
