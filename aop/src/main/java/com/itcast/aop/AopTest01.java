package com.itcast.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.aop
 * Version ==> 1.0
 * CreateTime ==> 2022-12-11 12:00:50
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
@Aspect
public class AopTest01 {

    @Pointcut("execution(void com.itcast.service.Anime.getAnimeInfo())")
    public void pt(){}

    @Before("pt()")
    public void invoke01(){
        System.out.println("::"+ LocalDateTime.now());
    }

}
