package com.chloe.spring02aopstu;

import com.chloe.spring02aopstu.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: AopTest
 * Package: com.chloe.spring02aopstu
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/10/26 9:53
 * @Version 1.0
 */
@SpringBootTest
public class AopTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void test5(){
        calculator.add(1,2);
    }
}
