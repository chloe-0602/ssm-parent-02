package com.chloe.spring01iocstu;

import com.chloe.spring01iocstu.bean.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring01IocStuApplicationTests {

    @Autowired
    Dog dog;
    @Test
    void contextLoads() {
        System.out.println(dog);
    }

}
