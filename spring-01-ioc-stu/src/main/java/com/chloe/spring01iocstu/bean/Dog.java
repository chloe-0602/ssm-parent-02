package com.chloe.spring01iocstu.bean;

import com.chloe.spring01iocstu.anno.UUID;
import lombok.Data;

/**
 * ClassName: Dog
 * Package: com.chloe.spring01iocstu.bean
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:25
 * @Version 1.0
 */
@Data
public class Dog {
    @UUID
    private String id;
}
