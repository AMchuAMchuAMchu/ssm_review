package com.itcast.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

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
//
//    @Pointcut("execution(void com.itcast.*.*.getAnimeInfo(..))")
//    public void pt(){}

    @Pointcut("execution(Object com.itcast.*.*.getAnimeInfo(..))")
    public void pt(){}

//    @Before("pt()")
//    public void invoke01(){
//        System.out.println("::"+ LocalDateTime.now());
//    }
//
//    @After("pt()")
//    public void invoke01(JoinPoint joinPoint){
//        System.out.println(">>"+LocalDateTime.now());
//    }
   @Around("pt()")
    public Object invoke01(ProceedingJoinPoint pjp){

       Object[] args = pjp.getArgs();

       Arrays.fill(args, "楪祈");
       try {
           pjp.proceed(args);
       } catch (Throwable e) {
           e.printStackTrace();
       }

       System.out.println(">>"+LocalDateTime.now());
       Object target = pjp.getTarget();
       target = "楪祈==>樱满集";
       return target;
    }

}
