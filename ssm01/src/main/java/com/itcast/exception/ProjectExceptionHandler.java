package com.itcast.exception;

import com.itcast.entity.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description ==> TODO
 * BelongsProject ==> ssm_review
 * BelongsPackage ==> com.itcast.exception
 * Version ==> 1.0
 * CreateTime ==> 2022-12-12 10:52:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RestControllerAdvice
public class ProjectExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public R h(){
        return new R(500,"服务器内部错误!!果咩纳塞~~😭😭😭...");
    }


}
