package com.chloe.spring02aopstu.anno;

import java.lang.annotation.*;

/**
 * ClassName: MyAnno
 * Package: com.chloe.spring02aopstu.anno
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:52
 * @Version 1.0
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnno {
}
