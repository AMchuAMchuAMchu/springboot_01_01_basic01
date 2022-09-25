package com.itheima.test;

import com.itheima.bean.BestAnime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description==>TODO
 * BelongsProject==>springboot_01_01_basic01
 * BelongsPackage==>com.itheima.test
 * CreateTime==>2022-09-25 16:00:23
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@RestController
@RequestMapping("/anime")
public class SpringbootTest01 {

    @Value("${animeName}")
    private String animeName;

    @Value("${animeReleaseTime}")
    private Integer animeReleaseTime;


    @Value("${likesAnime.anime01}")
    private String laAnime01;

    @Value("${animeAndCharacters[0].c1}")
    private String likeC1;


    @Value("${animePath}")
    private String animePath;


    @Autowired
    private Environment env;

    @Autowired
    private BestAnime bestanime;

    @GetMapping
    public String getAnimeKNCW(){
        System.out.println("animeInfo .. ... ");
        System.out.println("animeName::"+animeName);
        System.out.println("animeReleaseTime::"+animeReleaseTime);
        System.out.println("laAnime01::"+laAnime01);
        System.out.println("likeC1::"+likeC1);
        System.out.println("animePath::"+animePath);
        System.out.println("=========================================");
        System.out.println("recentAnime::"+env.getProperty("recentAnime[0]"));
        System.out.println("bestAnime"+bestanime.toString());
        return "<h1>阔你吃哇...哦哈呦~~^_^</h1>";
    }







}
