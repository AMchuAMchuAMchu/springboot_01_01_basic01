package com.itheima.impl;

import com.itheima.dao.AnimeService;

/**
 * Description==>TODO
 * BelongsProject==>springboot_01_01_basic01
 * BelongsPackage==>com.itheima.impl
 * CreateTime==>2022-09-24 14:57:39
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public class AnimeServiceImpl implements AnimeService {

    private AnimeNameImpl animeName;

    @Override
    public void getAnimeName() {
        System.out.println("AnimeServiceImpl的getAnimeName方法执行了...");
        String randomAnimeName = animeName.getRandomAnimeName();
        System.out.println("结果是 >> "+randomAnimeName);
    }
}
