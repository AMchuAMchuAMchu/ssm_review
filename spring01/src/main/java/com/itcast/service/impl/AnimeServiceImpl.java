package com.itcast.service.impl;

import com.itcast.dao.AnimeDao;
import com.itcast.entity.Anime;
import com.itcast.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.soap.InitParam;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.service.impl
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 09:35:08
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
//@Scope(value = "prototype")
public class AnimeServiceImpl implements AnimeService{

    @Autowired
    private AnimeDao animeDao;

    @Override
    public Anime selectAnime() {
        System.out.println("service层执行一些业务逻辑...");
        animeDao.selectAnime();
        return new Anime();
    }

    @PostConstruct
    public void init(){
        System.out.println("init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy...");
    }

}
