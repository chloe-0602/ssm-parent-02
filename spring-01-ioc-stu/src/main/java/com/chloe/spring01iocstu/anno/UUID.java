package com.chloe.spring01iocstu.anno;

import java.lang.annotation.*;

/**
 * ClassName: UUID
 * Package: com.chloe.spring01iocstu
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 11:24
 * @Version 1.0
 */
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface UUID {
}
