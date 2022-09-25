package com.itheima.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Description==>TODO
 * BelongsProject==>springboot_01_01_basic01
 * BelongsPackage==>com.itheima.bean
 * CreateTime==>2022-09-25 17:11:22
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Component
@ConfigurationProperties(prefix = "bestanime")
public class BestAnime {

    private String name;
    private Integer releaseTime;
    private String character01;
    private String character02;


    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    public void setCharacter01(String character01) {
        this.character01 = character01;
    }

    public void setCharacter02(String character02) {
        this.character02 = character02;
    }

    @Override
    public String toString() {
        return "BestAnime{" +
                "name='" + name + '\'' +
                ", releaseTime=" + releaseTime +
                ", character01='" + character01 + '\'' +
                ", character02='" + character02 + '\'' +
                '}';
    }
}
