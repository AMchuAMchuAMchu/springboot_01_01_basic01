package com.itheima.impl;

import com.itheima.dao.AnimeKNCW;
import org.springframework.stereotype.Component;

/**
 * Description==>TODO
 * BelongsProject==>springboot_01_01_basic01
 * BelongsPackage==>com.itheima.impl
 * CreateTime==>2022-09-25 17:47:01
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Component
public class AnimeKNCWImpl implements AnimeKNCW {
    @Override
    public void sayHello() {
        System.out.println("阔你吃哇...哦哈呦~~...");
    }
}
