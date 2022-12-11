package com.itcast;

import com.itcast.config.SpringConfig;
import com.itcast.service.AnimeService;
import com.itcast.service.impl.AnimeServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 09:37:25
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class AnimeTest01 {

    @Test
    public void testAnime01(){

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);

//        AnimeServiceImpl bean = ac.getBean(AnimeServiceImpl.class);

//        bean.selectAnime();

        AnimeService bean = ac.getBean(AnimeService.class);
        bean.selectAnime();

    }

}
