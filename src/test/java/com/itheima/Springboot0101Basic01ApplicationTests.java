package com.itheima;

import com.itheima.dao.AnimeKNCW;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot0101Basic01ApplicationTests {


    @Autowired
    private AnimeKNCW animeKNCW;

    @Test
    void contextLoads() {
        animeKNCW.sayHello();
    }

}
